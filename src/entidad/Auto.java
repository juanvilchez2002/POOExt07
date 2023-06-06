
package entidad;


public class Auto {
    
    //atributos
    private String duenio;
    private String fechaVencimiento;
    private String color;
    private String modelo;
    private int KM;
    
    //constructor vacio
    public Auto() {
        this.KM = 7500;
    }
    
    //constructor con parametros
    public Auto(String duenio, String fechaVencimiento, String color, String modelo, int KM) {
        this.duenio = duenio;
        this.fechaVencimiento = fechaVencimiento;
        this.color = color;
        this.modelo = modelo;
        this.KM = KM;
    }
    
    //setts y getters

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKM() {
        return KM;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }
    
    //toString
    @Override
    public String toString() {
        return "Auto{" + "duenio=" + duenio + ", fechaVencimiento=" + fechaVencimiento + ", color=" + color + ", modelo=" + modelo + ", KM=" + KM + '}';
    }
    
    
}
