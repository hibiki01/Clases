package Clases;
public class Circulo {
    //Propiedades
    private int x;
    private int y;
    private double radio;
    //Constructor
    public Circulo(int x, int y, double rad){
        this.x=x; this.y=y; radio=rad;
    }
    //Getter y Setter
    public int get_x(){
        return x;
    }
    public void set_x(int x){
        this.x=x;
    }
    public int get_y(){
        return y;
    }
    public void set_y(int y){
        this.y=y;
    }
    public double get_radio(){
        return radio;
    }
    public void set_radio(double radio){
        this.radio=radio;
    }
    
    //Metodos: Funcion, Procedimiento
    public void mover(int x, int y){
        System.out.println("Se movio a la posicion ("+x+","+y+")");
    }
    public void copiar(int x, int y){
        System.out.println("Se copio a la posicion ("+x+","+y+")");
    }
    public void colorear(String color){
        System.out.println("Circulo se coloreo de "+color);
    }

    public double area(){
        return Math.PI*Math.pow(radio,2);
    }
    
    public double longitud(){
        return 2*Math.PI*radio;
    }    
}
