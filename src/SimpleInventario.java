import java.util.Scanner;
public class SimpleInventario {
    public static void agregarArticulo(String s) {
        System.out.println("Agregar un articulo:  ");

    }

    public static void removerArticulo(int id){
    }
    public static double obtenerPrecioArticulo(int id){
        return 0.00;
    }
    public static void imprimiendoinventario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String usuario = scanner.next();
        System.out.println("Bienvenid@ "+ usuario);

        String articuloExistente = obtenerNombredelArticulo();
        System.out.println("Articulo existente: " +articuloExistente);


    }
    public static void main(String[] args) {
        imprimiendoinventario();
    }

    public static String obtenerNombredelArticulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo: ");
        String nombrearticulo;
        nombrearticulo= scanner.next();
        System.out.println("Usted ha ingresado el articulo: "+ nombrearticulo);
        return nombrearticulo;



    }

}
