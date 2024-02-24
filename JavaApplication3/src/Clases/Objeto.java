package Clases;
import java.util.Scanner;
class Reto1{
    private final Scanner scanner = new Scanner(System.in);
    public String read(){
        return this.scanner.nextLine();
    }
    public double imc(double a,double b){
    double s=b/(a*a);
    return s;}
    public void run(){
    String []a=this.read().split(" ");
    float e= Float.parseFloat(a[0]);
    float r= Float.parseFloat(a[1]);
    int yuyu=Integer.parseInt(a[2]);
    double s=imc(r,e);
    double tr = Math.round(s * 10.0) / 10.0;
    if(((0<e) && (e<150)) && ((0.1<r) && (r<2.5)) && ((0<yuyu) && (yuyu<110)) ){
    if (yuyu<45){
        if(s<22){
            System.out.println(tr+" Bajo");}
        else{
            System.out.println(tr+" Medio");
        }
    }
    else if(yuyu<=45){
        if (s<22){
            System.out.println(tr+" "+"Medio");
        }
        else {
            System.out.println(tr+" Alto");}}
    }  
    else{
        System.out.println("ERROR");}
}
}