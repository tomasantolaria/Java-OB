public class Sesion2 {

    static double precioIva(double precio){
        return precio * 1.21;
    }
    public static void main(String[] args) {
        double precioTotal = precioIva(55.6);
        System.out.println(precioTotal);
    }
}
