import java.util.Arrays;
import java.util.Scanner;

public class anadirProducto {
    public static void main(String[] args) {
    }

    public static String[] anadirProducto(String [] inventario, String respuesta) {
        inventario[inventario.length-1] = respuesta;
        System.out.println(Arrays.toString(inventario));
        return inventario;

    }

}
