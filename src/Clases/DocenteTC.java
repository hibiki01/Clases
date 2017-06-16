package Clases;

public class DocenteTC extends Docente{
    
    private double salario_base;
    
    public DocenteTC (String dni,String nom,String cat,
            String sexo,String f_nac,double salariob){
         super(dni,nom,cat,sexo,f_nac);
         this.salario_base = salariob;
        
    }

    //getter

    public double getSalario_base() {
        return salario_base;
    }
   
    
    //setter

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    
    
    public double Get_sueldoTC(){
        return this.salario_base;
    }
    
    
}
