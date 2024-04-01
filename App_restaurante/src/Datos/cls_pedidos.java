
package Datos;

/**
 *
 * @author ACER GAMER
 */
public class cls_pedidos {
    private String id_clienteStr;
    private String det_pedidoStr;
    private float totalFlt;

    public cls_pedidos(String id, String detalle, float total) {
        this.id_clienteStr = id;
        this.det_pedidoStr = detalle;
        this.totalFlt = total;
    }
    
    public String getdetalle(){return this.det_pedidoStr;}
    public String getid(){return this.id_clienteStr;}
    public float gettotal(){return this.totalFlt;}
    
    
    
    
    
}
