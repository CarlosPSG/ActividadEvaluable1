import java.util.Arrays;
import java.util.Scanner;

public class anadirProducto {
    public static String[] anadirProductoinventario(String [] inventario, String respuesta) {
        inventario = Arrays.copyOf(inventario, inventario.length + 1);
        inventario[inventario.length-1] = respuesta;
        System.out.println(Arrays.toString(inventario));
        return inventario;

    }

}
