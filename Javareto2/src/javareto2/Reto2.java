package javareto2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
class Producto{
    private String nombre;
    private float precio;
    private float inventario;

    public Producto(String nombre, float precio, float inventario) {
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public Producto() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public float getInventario() {
        return inventario;
    }}
class BaseDatosProductos{
    public boolean verificarDatos (HashMap g,String a){
    boolean r=false;
    if(g.containsKey(a)){
   r=true;}
    return r;
}
public HashMap <String,Producto>Base(){
   
 HashMap<String,Producto> ListaProductos=new HashMap<>();
        
        ListaProductos.put("1", new Producto("Manzana",5000,25));
        ListaProductos.put("2", new Producto("Limones",2300,15));
        ListaProductos.put("3", new Producto("Pera",2700,33));
        ListaProductos.put("4", new Producto("Arandanos",9300,5));
        ListaProductos.put("5", new Producto("Tomates",2100,42));
        ListaProductos.put("6", new Producto("Fresas",4100,3));
        ListaProductos.put("7", new Producto("Helado",4500,41));
        ListaProductos.put("8", new Producto("Galletas",500,8));
        ListaProductos.put("9", new Producto("Chocolates",3500,80));
        ListaProductos.put("10", new Producto("Jamon",15000,10));
    return ListaProductos;
}

 public void generarInforme(ArrayList<Producto>x){
     ArrayList <Float>t=new ArrayList<>();
      int y=0;
      int z=0;
      float w=0;
     for(Producto h:x){
         t.add(h.getPrecio());
     }
     for (int i=0;i<t.size()-1;i++){
     if(t.get(y)<t.get(i+1)){
         y=i+1;
     }
     if(t.get(z)>t.get(i+1)){
         z=i+1;
     }}
     for(float s:t){
     w+=s;}
     float po=t.size();
     float pa=w/po;
     DecimalFormat formato1 = new DecimalFormat("#.0");
     System.out.println(x.get(y).getNombre()+" "+x.get(z).getNombre()+" "+formato1.format(pa));
 } 
    public boolean AGREGAR(HashMap <String,Producto>x, boolean r,String c,String nom,float p, float can){
        if(r){
            
            return false;}
        else{
        Producto u =new Producto(nom,p,can);
        x.put(c, u);}
          return true;}
    public boolean ACTUALIZAR(HashMap <String,Producto> x, boolean r,String c,String nom,float p, float can){
        if(r){
            Producto l=new Producto(nom,p,can);
            x.put(c,l);
            return true;
        }
        else{
        return false;}
    }
    public boolean ELIMINAR(HashMap <String,Producto>x, boolean r,String c,String nom,float p, float can){
        if(r){
            x.remove(c);
            return true;
        }
        else{
        return false;}
    }
 }

class Reto3{
    private final Scanner scanner = new Scanner(System.in);
    
    public String read(){
        return this.scanner.nextLine();
    }
    public void run(){
        BaseDatosProductos jui=new BaseDatosProductos();
        HashMap <String,Producto>a=jui.Base();
        boolean qwa=true;
        float q=0;
        String g=this.read();
        switch (g) {
            case "AGREGAR":
                {
                    String[] o=this.read().split(" ");
                    float w=Float.parseFloat(o[2]);
                    float l=Float.parseFloat(o[3]);
                    qwa=jui.AGREGAR(a, jui.verificarDatos(a, o[0]), o[0], o[1], w, l);
                    ArrayList <Producto>uy=new ArrayList<>(a.values());
                    if(qwa){
                        jui.generarInforme(uy);
                        }
                    else{System.out.println("ERROR");}
                break;
                }
            case "ACTUALIZAR":
                {
                    String[] o=this.read().split(" ");
                    float w=Float.parseFloat(o[2]);
                    float l=Float.parseFloat(o[3]);
                    qwa=jui.ACTUALIZAR(a, jui.verificarDatos(a, o[0]), o[0], o[1], w, l);
                    ArrayList <Producto>uy=new ArrayList<>(a.values());
                    if(qwa){
            jui.generarInforme(uy);
        }
        else{System.out.println("ERROR");}
                   
                    break;
                }
            case "BORRAR":
                {
                    String[] o=this.read().split(" ");
                    float w=Float.parseFloat(o[2]);
                    float l=Float.parseFloat(o[3]);
                    qwa=jui.ELIMINAR(a, jui.verificarDatos(a, o[0]), o[0], o[1], w, l);
                    ArrayList <Producto>uy=new ArrayList<>(a.values());
                    if(qwa){
            jui.generarInforme(uy);
        }
        else{System.out.println("ERROR");}
                  
                    break;
                }
            default:
                break;
        }}}
