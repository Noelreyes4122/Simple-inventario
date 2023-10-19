import java.util.Scanner;
public class SimpleInventario {
    public static void agregarArticulo(String s) {
        System.out.println("Agregar un articulo:  ");
        if(s.length()>4){
            System.out.println("Articulo agregado exitosamente!");
        } else{
            System.out.println("No se permite este Articulo");
        }





    }


    public static void removerArticulo(int id){
        if (id>0){
            System.out.println("Articulo Removido");
        }
    }
    public static double obtenerPrecioArticulo() {
        double precio = (Math.random() * 5000) + 100;
        if (precio > 0) {
            return precio;
        }
        return -1;
    }
    public static void imprimiendoinventario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String usuario = scanner.next();
        System.out.println("Bienvenid@ "+ usuario);

        String articuloExistente = obtenerPrecioArticulo();
        System.out.println("Articulo existente: " +articuloExistente);


    }

    public static void modificarArticulo() {
        String nombre =obtenerNombredelArticulo();
        double precio = obtenerPrecioArticulo();

        }
        public static String obtenerNombredelArticulo () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre del articulo: ");
            String nombrearticulo;
            nombrearticulo = scanner.next();
            System.out.println("Usted ha ingresado el articulo: " + nombrearticulo);
            return nombrearticulo;


        }



}


