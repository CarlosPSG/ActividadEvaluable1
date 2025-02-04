import java.util.Scanner;

public class anadirProducto {
    public static void main(String[] args) {

    }

    public static String[] anadirProducto(String [] inventario){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime lo que quieres añadir: ");
        String respuesta = sc.nextLine();
       inventario[inventario.length-1] = respuesta;
        //? Le asignamos el nuevo producto añadido al final de la lista
        return inventario;
    }
}
