public class mostraProducte {
    public static void mostrarCantidadProducto(String[] invetario, String producto) {
        int contador = 0;
        for (int i = 0; i < invetario.length; i++) {
            if (invetario[i].equalsIgnoreCase(producto)) {
                contador++;
            }
        }
        if (contador != 0) {
            System.out.println("El producto " + producto + " tants de pics " + contador);
        }else {
            System.out.println("El producto " + producto + "No aperreix cap pic no esta al inventari");
        }
    }
}
