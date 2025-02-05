public class menu {
    public static int menuInventari () {
        int opcion;
        System.out.println("Inventario CIFP Pere de Son Gall");
        System.out.println("1. Añadir Producto");
        System.out.println("2. Eliminar Producto por nombre");
        System.out.println("3. Eliminar Producto por posicion");
        System.out.println("4. Modificar Producto");
        System.out.println("5. Mostrar Producto");
        System.out.println("6. Mostrar resumen del inventario");
        System.out.println("7. Salir");
        opcion = Main.valornumeroco();
        return opcion;
    }
}
