package poo.ejercicio;

public class Main {
    public static void main(String[] args) {
        Smartphone iphone7 = new Smartphone("Iphone", "Negro", "7", 50.000, 2015, 4.8, 10, 4.3, true);
        iphone7.comprar(67.000);
        System.out.println(iphone7);

        System.out.println("----------------------------------------------");

        SmartWatch samsunggalaxy5 = new SmartWatch("Samsung", "negro", "Galaxy watch 5", 14.900, 2022, false, 0, true);
        System.out.println(samsunggalaxy5);
        samsunggalaxy5.comprar(10.000);
        samsunggalaxy5.tactil();

    }
}
