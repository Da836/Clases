package ClaseProfesor;
public class Profesor {
    private String nombres, apellidos,titulo,escalafon;
    private int edad;

    Profesor(String nombres, String apellidos, String titulo, String escalafon, int edad){
        setNombres(nombres);
        setApellidos(apellidos);
        setTitulo(titulo);
        setEscalafon(escalafon);
        setEdad(edad);
    }

    public void setNombres(String n){
        nombres = n;
    }
    public void setApellidos(String a){
        apellidos = a;
    }
    public void setTitulo(String c){
        titulo = c;
    }
    public void setEscalafon(String cr){
        escalafon = cr;
    }
    public void setEdad(int e){
        edad = e;
    }

    public String getNombres(){
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getEscalafon(){
        return escalafon;
    }
    public int getEdad(){
        return edad;
    }

    public void imprimirProfesor(){
        System.out.println("\nNombres: "+getNombres()+"\nApellidos: "+getApellidos()+"\nTitulo: "+getTitulo()+
                            "\nEscalafon: "+getEscalafon()+"\nEdad: "+getEdad());
    }
}

