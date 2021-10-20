import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class SegundaVentana
{


	Frame ventana = new Frame("Ventana"); // Creamos la ventana
	Panel PanelNorte = new Panel(); // contenedor.
	Panel PanelSur = new Panel();
	Button btnAceptar = new Button("Aceptar");
	Button btnCancelar = new Button("cancelar");

	// Constructor de la clase
	public SegundaVentana()
	{
		ventana.setBounds(50, 50, 200, 250);; // Posicion ventana 50px de posicion  200 ancho 100 alto
		ventana.setResizable(false); // para no poder modificar
		ventana.setBackground(Color.cyan); // Color de la ventana
		ventana.add(PanelNorte);
		ventana.add(PanelSur);

		PanelSur.add(btnCancelar);
		PanelNorte.add(btnAceptar); // añado el panel y el boton

		ventana.setVisible(true); // Siempre la ultima

	}
	public static void main(String[] args)
	{

		new SegundaVentana(); // referencia a un metodo funcion
	}
}