package Clases;

public class DocentePH extends Docente{
    private int h_trabajadas;
    private double p_hora;
    public DocentePH(String dni,String nom,String cat,
            String sexo,String f_nac,int ht,double ph){
        super(dni,nom,cat,sexo,f_nac);
        this.h_trabajadas=ht;
        this.p_hora=ph;        
    }
    
    public int getH_trabajadas() {
        return h_trabajadas;
    }
    public double getP_hora() {
        return p_hora;
    }
    public void setH_trabajadas(int h_trabajadas) {
        this.h_trabajadas = h_trabajadas;
    }
    public void setP_hora(double p_hora) {
        this.p_hora = p_hora;
    }
    
    //Metodo
    public double get_sueldoPH(){
        return this.h_trabajadas*this.p_hora;
    }
}
