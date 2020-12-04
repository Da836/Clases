package ClaseAsignaturas;

public class Asignaturas {
    private String codigoasignatura,nombreasignatura,horario;
    private int Capacidad;


    Asignaturas(String codigoasignatura, String nombreasignatura, String horario, int Capacidad){
        setCodigoAsignatura(codigoasignatura);
        setNombreAsignatura(nombreasignatura);
        setHorario(horario);
        setCapacidad(Capacidad);
    }

    public void setCodigoAsignatura(String f){
        codigoasignatura = f;
    }
    public void setNombreAsignatura(String b){
        nombreasignatura = b;
    }
    public void setHorario(String l) {
        horario = l;
    }
    public void setCapacidad(int d) {
        Capacidad = d;
    }

    public String getCodigoAsignatura(){
        return codigoasignatura;
    }
    public String getNombreAsignatura(){
        return nombreasignatura;
    }
    public String getHorario(){
        return horario;
    }
    public int getCapacidad(){
        return Capacidad;
    }

    public void imprimirAsignaturas(){
        System.out.println("\nCodigo de la Asignatura: "+getCodigoAsignatura()+"\nNombre de la Asignatura: "+getNombreAsignatura()+
                "\nHorario: "+getHorario()+"\nCapacidad: "+getCapacidad());
    }
}


