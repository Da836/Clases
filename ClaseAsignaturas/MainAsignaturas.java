package ClaseAsignaturas;
import ClaseAlumno.Alumno;

import java.util.Scanner;

public class MainAsignaturas {
    static Scanner entrada = new Scanner(System.in);
    public static void main (String[] args){
        String codigoasignatura,nombreasignatura,horario;
        int Capacidad;
        System.out.println("Favor ingresar codigo de la asignatura: ");
        codigoasignatura = entrada.nextLine();
        System.out.println("Favor ingresar nombre de la asignatura: ");
        nombreasignatura = entrada.nextLine();
        System.out.println("Favor ingresar horario: ");
        horario = entrada.nextLine();
        System.out.println("Favor ingresar capacidad: ");
        Capacidad = entrada.nextInt();
        Asignaturas n = new Asignaturas(codigoasignatura,nombreasignatura,horario,Capacidad);
        n.imprimirAsignaturas();
    }
}
