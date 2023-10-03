
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class ListaProducto {
    private ArrayList<Producto>listaProductos;

    public ListaProducto() {
        listaProductos= new ArrayList<>();
    }
    
    public boolean almacenarProducto(Producto producto){
        return listaProductos.add(producto);
    }
    
    public int precioTotal()
    {
        int precioTotal=0;
        for (Producto producto : listaProductos) {
            precioTotal += producto.calcularTotal();
        }
        return precioTotal;
    }
    
    public void listarProductos()
    {   System.out.println("--SuperBaratin--");
        System.out.println("--Lista Productos--\n");
        for (Producto producto : listaProductos) {
            System.out.println(producto.getCodigo()+"   "+producto.getNombreProducto()+"   "+producto.getCantidad()+"x"+producto.getPrecio()+"   "+producto.calcularTotal());
        }
        System.out.println("");
        System.out.println("--Total: "+precioTotal()+"--");
        System.out.println("");
        System.out.println("--Gracias por su compra--");
        
    }
    
}
