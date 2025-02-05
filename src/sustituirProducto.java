import java.util.Objects;

public class sustituirProducto {
    public static void main(String[] args) {

    }

    public static String[] reemplazarProducto (String[] inventario, String opcion){
        System.out.println("Sustitución de producto: ");
        String res = Main.valor();

        int posicion = 0;

        for (int i = 0; i < inventario.length; i++) {
            if(Objects.equals(inventario[i], res)) {
                posicion = i;

                inventario[posicion] = res;

                break;
            }
        }
        return inventario;
    }
}
