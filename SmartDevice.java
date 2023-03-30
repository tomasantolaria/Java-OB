package poo.ejercicio;

public class SmartDevice {

    //Atributos
    String marca;
    String color;
    String version;
    double precio;
    int anio;

    //Constructores
    public SmartDevice(){

    }
    public SmartDevice(String marca, String color, String version, double precio, int anio) {
        this.marca = marca;
        this.color = color;
        this.version = version;
        this.precio = precio;
        this.anio = anio;
    }

    //Metodo
    public void comprar(double dinero){
        double faltante = this.precio - dinero;
        if(dinero > this.precio)
            System.out.println("Has comprado el producto");
        else
            System.out.println("El dinero no es suficiente. Le faltan $" + faltante);
    }
}
