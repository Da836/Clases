package ClaseProfesor;
import java.util.Scanner;

public class MainProfesor {
    static Scanner entrada = new Scanner(System.in);
    public static void main (String[] args){
        String nombres, apellidos, titulo, escalafon;
        int edad;
        System.out.println("Favor ingresar los nombres: ");
        nombres = entrada.nextLine();
        System.out.println("Favor ingresar los apellidos: ");
        apellidos = entrada.nextLine();
        System.out.println("Favor ingresar titulo: ");
        titulo = entrada.nextLine();
        System.out.println("Favor ingresar escalafon: ");
        escalafon = entrada.nextLine();
        System.out.println("Favor ingresar edad: ");
        edad = entrada.nextInt();
        Profesor e = new Profesor(nombres,apellidos,titulo,escalafon,edad);
        e.imprimirProfesor();
    }
}
