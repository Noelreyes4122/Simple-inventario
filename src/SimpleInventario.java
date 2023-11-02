import java.util.Scanner;
public class SimpleInventario {
    static String[] articulos= new String[5];
    public static void agregarArticulo() {
        int i =0;
        while(i < articulos.length) {
            articulos[i]=obtenerNombredelArticulo();
            i++;
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
        System.out.println("Articulo registrado: "+ articulos);
        for(String articulos: articulos) {
            System.out.println(articulos);
        }



    }

    public static void modificarArticulo() {
        String nombre =obtenerNombredelArticulo();
        double precio = obtenerPrecioArticulo();

        if(nombre.toLowerCase().startsWith("a") || nombre.toLowerCase().startsWith("d")){
            if(precio >= 150 && precio <= 250){
                precio += precio * 0.02;
                System.out.println("El nombre del articulo es " + nombre + " y el precio actualizado es " + precio);
            } else if(precio > 250 && precio <= 500){
                precio += precio * 0.08;
                System.out.println("El nombre del articulo es " + nombre + " y el precio actualizado es " + precio);
            } else {
                precio += precio * 0.12;
                System.out.println("El nombre del articulo es " + nombre + " y el precio actualizado es " + precio);
            }
        } else if(nombre.toLowerCase().startsWith("co") || nombre.toLowerCase().startsWith("m")){
            precio -= precio * 0.20;
            System.out.println("El nombre del articulo es " + nombre + " y el precio actualizado es " + precio);
        }
    }


        public static String obtenerNombredelArticulo () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre del articulo: ");
            String nombrearticulo;
            nombrearticulo = scanner.next();
            System.out.println("Usted ha ingresado el articulo: " + nombrearticulo);
            return nombrearticulo;


        }

    public static void main(String[] args) {
        agregarArticulo();
        imprimiendoinventario();
    }

}


