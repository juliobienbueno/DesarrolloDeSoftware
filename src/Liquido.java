/**
 *
 * @author julio
 */
public class Liquido extends Producto{
    private int ml;
    private boolean esAlcohol;//'T' si 'F' no

    public Liquido() {
        super();
    }

    public Liquido(int ml, boolean esAlcohol, String nombreProducto, String descripcion, int codigo, int precio, int cantidad) {
        super(nombreProducto, descripcion, codigo, precio, cantidad);
        this.ml = ml;
        this.esAlcohol = esAlcohol;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public boolean isEsAlcohol() {
        return esAlcohol;
    }

    public void setEsAlcohol(boolean esAlcohol) {
        this.esAlcohol = esAlcohol;
    }

    @Override
    public String toString() {
        return "Liquido{" + "ml=" + ml + ", esAlcohol=" + esAlcohol + '}'+" "+super.toString();
    }

    @Override
    public int calcularTotal() {
        return this.getPrecio()*this.getCantidad();
    }

    @Override
    public void agregarComentario() {
        if (esAlcohol) {
            System.out.println("Si va a tomar pase las llaves!");            
        }
    }
    
    
}
