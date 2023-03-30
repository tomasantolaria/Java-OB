package poo.ejercicio;

public class SmartWatch extends SmartDevice{
    boolean camara;
    int botones;
    boolean contadorPasos;

    public SmartWatch(){

    }

    public SmartWatch(String marca, String color, String version, double precio, int anio, boolean camara, int botones, boolean contadorPasos) {
        super(marca, color, version, precio, anio);
        this.camara = camara;
        this.botones = botones;
        this.contadorPasos = contadorPasos;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "camara=" + camara +
                ", botones=" + botones +
                ", contadorPasos=" + contadorPasos +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", version='" + version + '\'' +
                ", precio=" + precio +
                ", anio=" + anio +
                '}';
    }

    public void tactil(){
        if(this.botones==0)
            System.out.println("El reloj es tactil");
    }
}
