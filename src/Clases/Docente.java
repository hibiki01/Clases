package Clases;

public class Docente {
    private String dni;
    private String nombre_completo;
    private String categoria;
    private String sexo;
    private String f_nacimiento;
    //Constructor
    public Docente(String dni, String nombre_completo, String categoria, String sexo, String f_nacimiento) {
        this.dni = dni;
        this.nombre_completo = nombre_completo;
        this.categoria = categoria;
        this.sexo = sexo;
        this.f_nacimiento = f_nacimiento;
    }
    //Getter y Setter
    public String getDni() {
        return dni;
    }
    public String getNombre_completo() {
        return nombre_completo;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getSexo() {
        return sexo;
    }
    public String getF_nacimiento() {
        return f_nacimiento;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }
    public int get_edad(){
        return 2017-
                Integer.parseInt(this.f_nacimiento.substring(6));
    }
}
