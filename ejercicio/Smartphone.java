package poo.ejercicio;

public class Smartphone extends SmartDevice{
    double capacidad;
    double altura;
    double ancho;
    boolean camaraFrontal;

    public Smartphone(){

    }
    public Smartphone(String marca, String color, String version, double precio, int anio, double capacidad, double altura, double ancho, boolean camaraFrontal) {
        super(marca, color, version, precio, anio);
        this.capacidad = capacidad;
        this.altura = altura;
        this.ancho = ancho;
        this.camaraFrontal = camaraFrontal;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "capacidad=" + capacidad +
                ", altura=" + altura +
                ", ancho=" + ancho +
                ", camaraFrontal=" + camaraFrontal +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", version='" + version + '\'' +
                ", precio=" + precio +
                ", anio=" + anio +
                '}';
    }
}
