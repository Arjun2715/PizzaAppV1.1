package Test;

/**
 *
 * @author arjun
 */
public class Pedido {

    private String IdTelefono;
    private String NombreCliente;
    private String Dirreccion;
    private String HoraDeEntrega;
    private String TipoDePedido;
    private String TipoDePago;
    private String NombreDeCajero;
    private String ListaDeCompra;
    private String Hora;
    private String FechaDeFactura;

    public Pedido(String IdTelefono, String NombreCliente, String Dirreccion, String HoraDeEntrega, String TipoDePedido, String TipoDePago, String NombreDeCajero, String ListaDeCompra, String Hora, String FechaDeFactura) {
        this.IdTelefono = IdTelefono;
        this.NombreCliente = NombreCliente;
        this.Dirreccion = Dirreccion;
        this.HoraDeEntrega = HoraDeEntrega;
        this.TipoDePedido = TipoDePedido;
        this.TipoDePago = TipoDePago;
        this.NombreDeCajero = NombreDeCajero;
        this.ListaDeCompra = ListaDeCompra;
        this.Hora = Hora;
        this.FechaDeFactura = FechaDeFactura;
    }

    
    @Override
    public String toString() {
        return "Pedido[" + "IdTelefono=" + IdTelefono
                + ", NombreCliente=" + NombreCliente
                + ", Dirreccion=" + Dirreccion
                + ", HoraDeEntrega=" + HoraDeEntrega
                + ", TipoDePedido=" + TipoDePedido
                + ", TipoDePago=" + TipoDePago
                + ", NombreDeCajero=" + NombreDeCajero
                + ", ListaDeCompra=" + ListaDeCompra
                + ", Hora=" + Hora
                + ", FechaDeFactura=" + FechaDeFactura 
                + ", ListaDeCompra=" + ListaDeCompra+']';
    }
}
