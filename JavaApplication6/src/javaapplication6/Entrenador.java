package javaapplication6;

public class Entrenador extends Persona {
    
    String estrategia;

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public Entrenador(String nombre, String apellido, int edad,String rol,String estrategia){
    super(nombre, apellido, edad,rol="entrenador");
    this.estrategia=estrategia;}
    String a=toString();
    public void planear(){
        System.out.println(a+" planea el entrenamiento del equipo según su táctica "+estrategia);}
    @Override
    public String viaje(){
        return a+" "+super.viaje();
    }

    @Override
    public void partido() {
        
        System.out.println(a+" esta listo para enfrentar el partido");
    }

    @Override
    public void entrevista() {
        System.out.println(a+" da fuertes declaraciones sobre el rendimiento del partido"); 
    }  
}
class Jugador extends Persona {
    
    String posicion;
    int dorsal;

    public Jugador(String posicion, int dorsal, String nombre, String apellido, int edad, String rol) {
        super(nombre, apellido, edad,rol="jugador");
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    @Override
    public String toString(){
    return super.toString()+" con el dorsal "+dorsal+" en la posicion "+posicion;}
    
    @Override
    public String viaje(){
        return toString()+" "+super.viaje();
    }

    @Override
    public void partido() {
        
        System.out.println(toString()+" esta listo para jugar el partido");
    }

    @Override
    public void entrevista() {
        System.out.println(toString()+" muestra sus expectativas hacia el proximo encuentro");} 
    public void entrenar(Entrenador a){
        System.out.println(toString()+" entrena fuertemente segun las ordenes del entrenador "
                +a.getNombre()+" "+a.getApellido());}
    }