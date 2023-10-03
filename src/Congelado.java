/**
 *
 * @author julio
 */
public class Congelado extends Producto{
    private int diasCongelado;

    public Congelado() {
        super();
    }

    public Congelado(int diasCongelado, String nombreProducto, String descripcion, int codigo, int precio, int cantidad) {
        super(nombreProducto, descripcion, codigo, precio, cantidad);
        this.diasCongelado = diasCongelado;
    }

    public int getDiasCongelado() {
        return diasCongelado;
    }

    public void setDiasCongelado(int diasCongelado) {
        this.diasCongelado = diasCongelado;
    }

    @Override
    public String toString() {
        return "Congelado{" + "diasCongelado=" + diasCongelado + '}'+" "+super.toString();
    }

    @Override
    public int calcularTotal() {
        return this.getPrecio()*this.getCantidad();
    }

    @Override
    public void agregarComentario() {
        System.out.println(this.getNombreProducto()+" lleva "+this.diasCongelado+" congelado");
    }
    
    
    
}
