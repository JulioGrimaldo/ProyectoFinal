
package model;

public class Bicicleta {
    private String Modelo;
    private String Marca;
    private String Color;
    private String Tipo;
    private int nPiezas;

    public Bicicleta() {
        
    }

    public Bicicleta(String Modelo, String Marca, String Color, String Tipo, int nPiezas) {
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Color = Color;
        this.Tipo = Tipo;
        this.nPiezas = nPiezas;
    }

    
    
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getnPiezas() {
        return nPiezas;
    }

    public void setnPiezas(int nPiezas) {
        this.nPiezas = nPiezas;
    }
    
}
