package javaapplication6;
import java.util.Scanner;
public class JavaApplication6 {
public static String read(){
    Scanner alfa=new Scanner(System.in);
    return alfa.nextLine();
}
    public static void main(String[] args) {
        String x="S";
        String y;
        String z;
        do{
        System.out.println("Digite la tarea que quiere realizar \n1. Todos\n2. jugador\n3.Todos\n4.Entrenador\n5. Todos");
        y=read();
        if(y.equals("2")){z="jugador";}
        else if(y.equals("4")){z="entrenador";}
        if (y.equals("1")||y.equals("3")||y.equals("5")){
            System.out.println("Cual rol quiere que cumpla esa tarea?");
            z=read();
        }
        if(z.equals("jugador")){
            Persona juga=new Jugador("delantero",9,"Joaquin","Putini",23,"jugador");
            switch(y){
                case "1":juga.viaje();
                break;
                case "3":juga.viaje();
                break;
                case "5":juga.viaje();
                break;
            }
        }
        else if(z.equals("entrenador")){
        Persona entre=new Entrenador("Jose","Dias",56,"Putazo limpio","entrenador");}
        
        }
        while(x.equalsIgnoreCase("S"));
}}
