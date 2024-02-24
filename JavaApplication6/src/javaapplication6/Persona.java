package javaapplication6;

public abstract class Persona {
    protected String nombre;
    protected String rol;
    protected String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad,String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rol=rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String viaje(){
        return ("viaja junto a todo el equipo hacia la concentración");}
    public abstract void partido();
    public abstract void entrevista();
    @Override
    public String toString(){
    return "El "+rol+" "+nombre+" "+apellido;}
}
