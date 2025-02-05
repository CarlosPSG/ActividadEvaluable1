public class modificarProducto {
    public static String[] modificarProductoinventari(String[] inventario) {
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("Que producto quieres modificar?");
            String prodmodificar = Main.valor();
            System.out.println("porque lo quieres sustituir: ");
            String nuevaVersionProducto = Main.valor();
            if (inventario[i].equals(prodmodificar)) {
                inventario[i] = nuevaVersionProducto;
            }else {
                System.out.println("No se puede modificar el producto, porque mo se encuentra");
            }
        }
        return inventario;
    }
}
