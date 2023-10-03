/**
 *
 * @author julio
 */
public class Principal {
    public static void main(String[] args) {
        
        Abarrote ab1 = new Abarrote("Lays", "Lays Stack", "Papas onduladas en tarro",123, 2000, 2);
        Liquido li1 = new Liquido(750, true, "Vino Blanco Gato", "Botella de vino blanco", 211, 2500, 4);
        Aseo as1 = new Aseo("comedor", "Nova Elite", "Toalla nova", 300, 1850, 1);
        Congelado co1 = new Congelado(10, "Merluzina", "Trozos de merluza", 400, 6890, 2); 
        Oferta of1 = new Oferta(7, "Set de Copas", "Par de copas de cristal", 500, 2000, 1);
        
        ListaProducto listapro1= new ListaProducto();
        
        listapro1.almacenarProducto(ab1);
        listapro1.almacenarProducto(li1);
        listapro1.almacenarProducto(as1);
        listapro1.almacenarProducto(co1);
        listapro1.almacenarProducto(of1);
        
        listapro1.listarProductos();
        
        ab1.agregarComentario();
        li1.agregarComentario();
        as1.agregarComentario();
        co1.agregarComentario();
        of1.agregarComentario();
        
        
    }
}
