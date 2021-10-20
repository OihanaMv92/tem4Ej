import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class PrimeraVentana
{
	
	Frame ventana = new Frame("Ventana"); // Creamos la ventana
	Panel PanelNorte = new Panel(); // contenedor.
	Panel PanelSur = new Panel();
	Button btnAceptar = new Button("Aceptar");
	Button btnCancelar = new Button("cancelar");
	
	// Constructor de la clase
	public PrimeraVentana()
	{
		ventana.setBounds(50, 50, 200, 250);; // Posicion ventana 50px de posicion  200 ancho 100 alto
		ventana.setResizable(false); // para no poder modificar
		ventana.setBackground(Color.cyan); // Color de la ventana
		ventana.add(PanelNorte);
		ventana.add(PanelSur);
		
		//ventana.setLayout(new FlowLayout());// Darle la distribucion coloca arriba del todo 
		//ventana.setLayout(new BorderLayout()); // especificar Posiciones y añadirlas.
		//ventana.add("North",btnAceptar);//añadir
		//ventana.add("Center",btnCancelar);//añadir
		ventana.setLayout(new GridLayout(2,3)); // añadir rejilla 2 filas 3 columnas
		PanelSur.add(btnCancelar);
		PanelNorte.add(btnAceptar); // añado el panel y el boton

		ventana.setVisible(true); // Siempre la ultima
		
	}
	public static void main(String[] args)
	{
		
		new PrimeraVentana(); // referencia a un metodo funcion
	}

}
