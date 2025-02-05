public class eliminarprodPosicion {
    public static String[] eliminarPosicion(String[] inventario, int posicion) {
        String[] copia = new String[inventario.length - 1];
        System.arraycopy(inventario, 0, copia, 0, posicion);
        System.arraycopy(inventario, posicion + 1, copia, posicion, copia.length - posicion - 1);
        return copia;
    }
}
