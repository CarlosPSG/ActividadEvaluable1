import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean condicion = true;
       String[] inventario = {};


        while (condicion) {

            int opcion = menu();

            switch (opcion) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
                case 6 -> {}
                case 7 -> {}
                case 8 -> {
                    System.out.println("Rosello excelente");
                    condicion = false;
                }
            }
        }

    }
    static int menu () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inventario CIFP Pere de Son Gall");
        System.out.println("1. Añadir Producto");
        System.out.println("2. Eliminar Producto por nombre");
        System.out.println("4. Eliminar Producto por posicion");
        System.out.println("5. Modificar Producto");
        System.out.println("6. Mostrar Producto");
        System.out.println("7. Mostrar resumen del inventario");
        System.out.println("8. Salir");
        System.out.println("Ingresa una opcion: ");
        int opcion = sc.nextInt();
        return opcion;
    }
}