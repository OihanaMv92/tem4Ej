import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class AwtFlow extends Frame
{


		private static final long serialVersionUID = 1L;
		// Creamos los botones con sus correspondientes etiquetas
		Button btnBoton1 = new Button("Aceptar");
		Button btnBoton2 = new Button("Abrir");
		Button btnBoton3 = new Button("Cerrar");
		// Constructor de la clase con el mismo nombre que ella
		public AwtFlow()
		{
			// Establecer la distribución del Frame
			setLayout(new FlowLayout());
			// Establecer el título de la aplicación
			setTitle("FlowLayout");
			// Añadir los botones antes creados
			add(btnBoton1);
			add(btnBoton2);
			add(btnBoton3);
			// Establecer el tamaño del Frame
			setSize(200,200);
			// Centra la ventana en la pantalla
			setLocationRelativeTo(null);
			// Mostrar el Frame en pantalla
			setVisible(true);
		}
		// Fin del Constructor
		// Método Main. Es el método que se ejecutará en primer
		// lugar al ejecutarse la aplicación
		public static void main(String[] args)
		{
			// Crear una instancia u objeto de nuestra Clase AwtFlow
			new AwtFlow();
		}
		// Fin del Main
	}
	// Fin de la Clase
