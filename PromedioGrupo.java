import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PromedioGrupo {

    // Declaración de variables globales
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    // Declaración de un arreglo de un TDA
    public static Alumno[] alumnos;

    public static void leerAlumnos() throws IOException {
        String matricula, nombre;

        System.out.println("Solicitud de información de cada estudiante");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("Escribe la matrícula");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Escribe el nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            // Creación de un objeto Alumno (POJO)
            Alumno a = new Alumno(matricula, nombre);
            System.out.println("Escribe calificación de estructuras: ");
            entrada = bufer.readLine();
            a.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escribe calificación de inglés: ");
            entrada = bufer.readLine();
            a.setIngles(Double.parseDouble(entrada));
            System.out.println("Escribe calificación de IoT: ");
            entrada = bufer.readLine();
            a.setIot(Double.parseDouble(entrada));
            a.setpromedio();
            // Agregando un alumno al arreglo
            alumnos[i] = a;
        }
    }

    public static void imprimirAlumnos() {
        System.out.println("Contenido del arreglo alumnos:");
        for (Alumno a : alumnos) {
            System.out.println("-----------------------------------");
            System.out.println("Información del alumno");
            System.out.println(a.toString());
        }
    }

    public static double calcularPromedioGrupo() {
        double suma = 0;
        for (Alumno a : alumnos) {
            suma += a.getpromedio();
        }
        return (suma / alumnos.length);
    }

    public static void main(String[] args) throws IOException {
        int n; // Tamaño del grupo
        double promedio; // El promedio del grupo

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("----------------------------------------------");
        // Recuperando el tamaño del grupo
        System.out.println("Escribe el número de alumnos de un grupo: ");
        entrada = bufer.readLine(); // Lectura del teclado
        n = Integer.parseInt(entrada); // Conversión de string a int

        // Construimos el arreglo alumno;
        alumnos = new Alumno[n];
        // Introducir información de los alumnos
        leerAlumnos();
        // Mostrar la información
        imprimirAlumnos();
        // Obtener el promedio
        promedio = calcularPromedioGrupo();

        System.out.println("----------------------------------------");
        System.out.println("El promedio de grupo es: " + promedio);
    }
}