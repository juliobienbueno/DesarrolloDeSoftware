/**
 *
 * @author julio
 */
public class Oferta extends Producto{
    private int diasRestantes;

    public Oferta() {
        super();
    }

    public Oferta(int diasRestantes, String nombreProducto, String descripcion, int codigo, int precio, int cantidad) {
        super(nombreProducto, descripcion, codigo, precio, cantidad);
        this.diasRestantes = diasRestantes;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    @Override
    public String toString() {
        return "Oferta{" + "diasRestantes=" + diasRestantes + '}'+" "+super.toString();
    }

    @Override
    public int calcularTotal() {
        return this.getPrecio()*this.getCantidad();
    }

    @Override
    public void agregarComentario() {
        System.out.println("Restan "+this.diasRestantes+" dias de esta oferta");
    }
    
    
}
