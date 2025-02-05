import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean condicion = true;
       String[] inventario = {"almendra","carlos","miquel"};


        while (condicion) {
            int opcion = menu();

            switch (opcion) {
                case 1 -> {
                    inventario = anadirProducto.anadirProducto(inventario, valor());
                }
                case 2 -> {
                    inventario = eliminarProdNombre.eliminarProdNombre(inventario,valor());
                }
                case 3 -> {

                }
                case 4 -> {
                    inventario = sustituirProducto.reemplazarProducto(inventario, valor());
                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 -> {

                }
                case 8 -> {
                    condicion = false;
                }
            }
        }

    }
    static int menu () {
        System.out.println("Inventario CIFP Pere de Son Gall");
        System.out.println("1. Añadir Producto");
        System.out.println("2. Eliminar Producto por nombre");
        System.out.println("4. Eliminar Producto por posicion");
        System.out.println("5. Modificar Producto");
        System.out.println("6. Mostrar Producto");
        System.out.println("7. Mostrar resumen del inventario");
        System.out.println("8. Salir");
        int opcion = valornumeroco();
        return opcion;
    }
    public static String valor () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un producto");
        return sc.nextLine();
    }
    public static int valornumeroco() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Numero");
        return sc.nextInt();
    }
}