package ClaseAlumno;

public class Alumno{
    private String nombre,cuenta,telefono;
    private int edad;
    private double estatura;

    Alumno(String nombre, String cuenta, String telefono, int edad,double estatura){
        setNombre(nombre);
        setCuenta(cuenta);
        setTelefono(telefono);
        setEdad(edad);
        setEstatura(estatura);
    }

    public void setNombre(String f){
        nombre = f;
    }
    public void setCuenta(String b){
        cuenta = b;
    }
    public void setTelefono(String k){
        telefono = k;
    }
    public void setEdad(int m){
        edad = m;
    }
    public void setEstatura(double p){
        estatura = p;
    }

    public String getNombre(){
        return nombre;
    }
    public String getCuenta(){
        return cuenta;
    }
    public String getTelefono(){
        return telefono;
    }
    public int getEdad(){
        return edad;
    }
    public double getEstatura(){
        return estatura;
    }

    public void imprimirAlumno(){
        System.out.println("\nNombre: "+getNombre()+"\nCuenta: "+getCuenta()+"\nTelefono: "+getTelefono()+
                "\nEdad: "+getEdad()+"\nEstatura: "+getEstatura());
    }
}
