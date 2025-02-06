import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean condicion = true;
       String[] inventario = {};
        while (condicion) {
            menu.menuInventari();
            int opcion = valornumeroco();
            switch (opcion) {
                case 1 -> {
                    inventario = anadirProducto.anadirProductoinventario(inventario, valor());
                }
                case 2 -> {
                    inventario = eliminarProdNombre.eliminarProdNombreinventario(inventario,valor());
                }
                case 3 -> {
                    inventario = eliminarprodPosicion.eliminarPosicion(inventario,valornumeroco());
                }
                case 4 -> {
                    modificarProducto.modificarProductoinventari(inventario);
                }
                case 5 -> {
                    mostraProducte.mostrarCantidadProducto(inventario, valor());
                }
                case 6 -> {
                    MostrarInventario.mostrarInventario(inventario);
                }
                case 7 -> {
                    condicion = false;
                }
            }
        }
    }
    public static String valor () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un producto");
        return sc.nextLine();
    }
    public static int valornumeroco() {
        System.out.println("Ingrese un Numero");
        return sc.nextInt();
    }
}