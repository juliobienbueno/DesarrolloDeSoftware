/**
 *
 * @author julio
 */
public class Abarrote extends Producto{
    private String marca;

    public Abarrote() {
        super();
    }

    public Abarrote(String marca, String nombreProducto, String descripcion, int codigo, int precio, int cantidad) {
        super(nombreProducto, descripcion, codigo, precio, cantidad);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Abarrote{" + "marca=" + marca + '}'+" "+super.toString();
    }

    @Override
    public int calcularTotal() {
        return this.getPrecio()*this.getCantidad();
    }

    @Override
    public void agregarComentario() {
        System.out.println("En superbaratin prefiera los productos "+this.marca);
    }
    
    
}
