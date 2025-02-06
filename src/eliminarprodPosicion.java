public class eliminarprodPosicion {
    public static String[] eliminarPosicion(String[] inventario, int posicion) {
        if (posicion >= 0 && posicion < inventario.length) {
            String[] copia = new String[inventario.length - 1];
            System.arraycopy(inventario, 0, copia, 0, posicion);
            System.arraycopy(inventario, posicion + 1, copia, posicion, copia.length - posicion);
            return copia;
        }
        return inventario;
    }
}
