/**
 *
 * @author julio
 */
public class Aseo extends Producto{
    private String lugarAseo;//cocina baño etc

    public Aseo() {
        super();
    }

    public Aseo(String lugarAseo, String nombreProducto, String descripcion, int codigo, int precio, int cantidad) {
        super(nombreProducto, descripcion, codigo, precio, cantidad);
        this.lugarAseo = lugarAseo;
    }

    public String getLugarAseo() {
        return lugarAseo;
    }

    public void setLugarAseo(String lugarAseo) {
        this.lugarAseo = lugarAseo;
    }

    @Override
    public String toString() {
        return "Aseo{" + "lugarAseo=" + lugarAseo + '}'+" "+super.toString();
    }

    @Override
    public int calcularTotal() {
        return this.getPrecio()*this.getCantidad();
    }

    @Override
    public void agregarComentario() {
        System.out.println("Cuide su "+this.getLugarAseo()+ " con "+this.getNombreProducto());
    }
    
    
}
