package ClaseAlumno;
import java.util.Scanner;

public class MainAlumno {
    static Scanner entrada = new Scanner(System.in);
    public static void main (String[] args){
        String nombre, cuenta, telefono;
        int edad;
        double estatura;
        System.out.println("Favor ingresar nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Favor ingresar numero de cuenta: ");
        cuenta = entrada.nextLine();
        System.out.println("Favor ingresar numero de telefono: ");
        telefono = entrada.nextLine();
        System.out.println("Favor ingresar edad: ");
        edad = entrada.nextInt();
        System.out.println("Favor ingresar estatura: ");
        estatura = entrada.nextDouble();
        Alumno j = new Alumno(nombre,cuenta,telefono,edad,estatura);
        j.imprimirAlumno();
    }
}
