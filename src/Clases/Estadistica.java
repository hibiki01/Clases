package Clases;

public class Estadistica {
    private double[] datos;
    //Constructor
    public Estadistica(double[] valores){
        datos=valores;
    }
    //Getters y Setters
    public double[] getDatos() {
        return datos;
    }
    public void setDatos(double[] datos) {
        this.datos = datos;
    }
    //Metodos
    public double media(){
        double suma=0;
        for(int i=0;i<datos.length;i++){
            suma=suma+datos[i];
        }
        return suma/datos.length;
    }
    
}
