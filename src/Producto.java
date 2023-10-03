/**
 *
 * @author julio
 */
public abstract class Producto implements IComentario{
    protected String nombreProducto,descripcion;
    protected int codigo,precio,cantidad;

    public Producto() {
    }

    public Producto(String nombreProducto, String descripcion, int codigo, int precio, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    public abstract int calcularTotal();
    
}
