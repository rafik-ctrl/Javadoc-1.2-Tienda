
/**
 * Calcula precios de una tienda online.
 */
public class Tienda {

    /**
     * Crea una instancia de la tienda.
     */
    public Tienda() {
    }

    /** IVA general en España, en tanto por uno. */
    public static final double IVA = 0.21;

    /**
     * Calcula el precio de un producto con el IVA incluido.
     *
     * @param precio el precio sin IVA, en euros
     * @return el precio con IVA incluido, en euros
     */
    public static double precioConIva(double precio) {
        return precio + precio * IVA;
    }

    /**
     * Aplica un descuento a un precio.
     *
     * @param precio el precio original, en euros
     * @param descuento el porcentaje de descuento aplicado
     * @return el precio con el descuento aplicado, en euros
     */
    public static double aplicarDescuento(double precio, int descuento) {
        return precio - precio * descuento / 100;
    }

    /**
     * Comprueba si un pedido tiene envio gratuito.
     *
     * @param precio el importe del pedido, en euros
     * @return true si el precio es mayor o igual a 50 euros,
     *         false en caso contrario
     */
    public static boolean envioGratis(double precio) {
        return precio >= 50;
    }

    /**
     * Muestra por pantalla una linea del ticket de compra.
     *
     * @param producto el nombre del producto
     * @param precio el precio sin IVA, en euros
     */
    public static void mostrarTicket(String producto, double precio) {
        System.out.println(producto + ": " + precioConIva(precio) + " euros");
    }

    /**
     * Calcula cuantas unidades se pueden comprar con un presupuesto.
     *
     * @param precio el precio de una unidad, en euros
     * @param presupuesto el dinero disponible para comprar, en euros
     * @return el numero maximo de unidades que se pueden comprar
     */
    public static int unidadesPosibles(double precio, double presupuesto) {
        return (int) (presupuesto / precio);
    }

    /**
     * Prueba los metodos de la clase mostrando sus resultados.
     *
     * @param args argumentos de la linea de ordenes (no se usan)
     */
    public static void main(String[] args) {
        System.out.println("Con IVA: " + precioConIva(100));
        System.out.println("Con descuento: " + aplicarDescuento(80, 25));
        System.out.println("¿Envío gratis? " + envioGratis(60));
        mostrarTicket("Ratón", 10);
        System.out.println("Unidades: " + unidadesPosibles(7.5, 40));
    }
}
