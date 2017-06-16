package Examenes;

public class Triangulo {
    private double lado_1;
    private double lado_2;
    private double lado_3;
    //Cosntructor
    public Triangulo(double l1,double l2,double l3){
        lado_1=l1;
        lado_2=l2; lado_3=l3;
    }
    //Getters
    public double getLado_1() {
        return lado_1;
    }
    public double getLado_2() {
        return lado_2;
    }
    public double getLado_3() {
        return lado_3;
    }
    //Setters
    public void setLado_1(double lado_1) {
        this.lado_1 = lado_1;
    }
    public void setLado_2(double lado_2) {
        this.lado_2 = lado_2;
    }
    public void setLado_3(double lado_3) {
        this.lado_3 = lado_3;
    }   
    //Metodos
    public boolean esTriangulo(){
        boolean bandera=false;
        if(lado_1<lado_2+lado_3 && lado_2<lado_1+lado_3 && lado_3<lado_1+lado_2){
            bandera=true;
        }
        return bandera;
    }
    public double area(){
        double p=(lado_1+lado_2+lado_3)/2;
        double a=Math.sqrt(p*(p-lado_1)*(p-lado_2)*(p-lado_3));
        return a;
    }
    public double perimetro(){
        return lado_1+lado_2+lado_3;
    }
}
