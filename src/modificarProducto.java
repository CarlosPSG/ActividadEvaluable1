public class modificarProducto {
    public static String[] modificarProducto(String[] inventario) {
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("Que producto quieres modificar?");
            String prodeliminar = Main.valor();
            System.out.println("porque lo quieres sustituir: ");
            String nuevaVersionProducto = Main.valor();
            if (inventario[i].equals(prodeliminar)) {
                inventario[i] = nuevaVersionProducto;
            }
        }
        return inventario;
    }
}
