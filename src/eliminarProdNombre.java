import java.util.Arrays;

public class eliminarProdNombre {
    public static String[] eliminarProdNombreinventario(String[] inventario, String nombre) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].equals(nombre)) {
                int pos = Arrays.binarySearch(inventario, nombre);
                String[] nuevoInventario = new String[inventario.length - 1];
                System.arraycopy(inventario, 0, nuevoInventario, 0, pos);
                System.arraycopy(inventario, pos + 1, nuevoInventario, pos, inventario.length - pos - 1);
                inventario = nuevoInventario;
            }
        }
        return inventario;
    }
}
