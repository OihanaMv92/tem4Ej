import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio7 extends Frame 
{
	private static final long serialVersionUID = 1L;
	MenuBar barraMenu = new MenuBar();
	Menu articulos = new Menu("Artículos");
	Menu clientes = new Menu("Clientes");
	Menu facturas = new Menu("Facturas");
	MenuItem articuloNuevo=new MenuItem("Nuevo Artículo");
	MenuItem articuloEliminar=new MenuItem("Eliminar Artículo");
	MenuItem articuloConsultar=new MenuItem("Consultar Artículo");
	MenuItem clientesNuevo=new MenuItem("Nuevo Cliente");
	MenuItem clientesEliminar=new MenuItem("Eliminar Cliente");
	MenuItem clientesConsultar=new MenuItem("Consultar Cliente");
	MenuItem facturasNueva=new MenuItem("Nueva Factura");
	MenuItem facturaConsultar=new MenuItem("Consultar Factura");
	public Ejercicio7()
	{
		setLayout(new FlowLayout());
		setTitle("Menú");
		setMenuBar(barraMenu);
		articulos.add(articuloNuevo);
		articulos.add(articuloEliminar);
		articulos.add(articuloConsultar);
		clientes.add(clientesNuevo);
		clientes.add(clientesEliminar);
		clientes.add(clientesConsultar);
		facturas.add(facturasNueva);
		facturas.add(facturaConsultar);
		barraMenu.add(articulos);
		barraMenu.add(clientes);
		barraMenu.add(facturas);
		setSize(350,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio7();
	}
}