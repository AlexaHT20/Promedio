import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class PromedioGrupo{

    public static void main(String[] args) throws IOException {
        int n; //tamaño del grupo
        double[] calificaciones; //Calificaciones de cada alumno
        double suma = 0; // para sumar calificaciones
        double promedio; // el promedio del grupo

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("----------------------------------------------");
        //Recuperando el tamaño del grupo
        System.out.println("Escribe el numero de alumnos de un grupo: ");
        entrada = bufer.readLine(); //Lectura del teclado
        n = Integer.parseInt(entrada); //Conversion de string a int

        calificaciones = new double[n]; //Construccion del arreglo
        // Pedir calificacion y acumularla
        for( int i = 0;i < calificaciones.length;i++){
            System.out.println("Escribe la calificacion del estudiante[ "+ (i+1)+ "]");
            entrada = bufer.readLine();
            calificaciones [i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        //Obtener el promedio
        promedio = suma /n;
        System.out.println("----------------------------------------");
        System.out.println("Las calificaciones de cada alumno son: ");
        for( double calif : calificaciones){
            System.out.println(calif);
        System.out.println("----------------------------------------");
        System.out.println("El promedio de grupo es: " + promedio);
        }

    }
}