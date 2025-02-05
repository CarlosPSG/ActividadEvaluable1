public class menu {

    public static int menu () {
        System.out.println("Inventario CIFP Pere de Son Gall");
        System.out.println("1. Añadir Producto");
        System.out.println("2. Eliminar Producto por nombre");
        System.out.println("4. Eliminar Producto por posicion");
        System.out.println("5. Modificar Producto");
        System.out.println("6. Mostrar Producto");
        System.out.println("7. Mostrar resumen del inventario");
        System.out.println("8. Salir");
        int opcion = Main.valornumeroco();
        return opcion;
    }
}
