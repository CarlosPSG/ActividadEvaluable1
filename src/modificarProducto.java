public class modificarProducto {
    public static String[] modificarProductoinventari(String[] inventario) {
        System.out.println("¿Que producto quieres modificar?");
        String prodmodificar = Main.valor();
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].equals(prodmodificar)) {
                System.out.println("Por que producto lo quieres sustituir: ");
                String nuevaVersionProducto = Main.valor();
                inventario[i] = nuevaVersionProducto;
            }else {
                System.out.println("No se puede modificar el producto, porque no se encuentra");
            }
        }
        return inventario;
    }
}
