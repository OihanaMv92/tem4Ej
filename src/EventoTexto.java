import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoTexto extends Frame implements WindowListener, ActionListener,
TextListener // a�adir el TextListener
{
	private static final long serialVersionUID = 1L;
	Label lblEtiqueta = new Label("Escribe un texto:");
	// Creamos el textfield con 20 caracteres de ancho
	TextField txtCampo1 = new TextField(20);
	//Creamos el textarea vac�o, con 5 filas y 20 columnas
	TextArea txaCampo2 = new TextArea("",5,20); // 5 filas 20 espacios
	Button btnBoton = new Button ("A�adir texto");
	String cadena = "";
	int longitud=0;
	public EventoTexto()
	{
		setLayout(new FlowLayout());
		setTitle("TextField y TextArea");
		add(lblEtiqueta);
		add(txtCampo1);
		add(btnBoton);
		add(txaCampo2);
		btnBoton.addActionListener(this);
		//A�adir el listener al textfield para poder escribir en �l por eso campo 1 por que es lo que guarda el dato
		txtCampo1.addTextListener(this);
		addWindowListener(this);
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoTexto();
	}
	//Al cambiar el texto en el textfield, guardamos lo escrito en
	//la cadena ca
	public void textValueChanged(TextEvent te) // el valor del texto cambio
	{
		cadena = txtCampo1.getText(); // en la variable cadena metemos en el txt campo1  txtCampo1.getText() cojemos el texto de campo 1
	}
	public void actionPerformed(ActionEvent ae)
	{
		//Calculamos la longitud de lo escrito para que no sobrepase el ancho y si pasa hace salto de linia
		longitud = longitud + cadena.length();
		//Si no supera los 20, lo metemos en el TextArea a
		//continuaci�n de lo que ya haya
		if(longitud<=20)
		{
			txaCampo2.setText(txaCampo2.getText()+" "+cadena); // Lo del parentesis lo metemos en campo 2
			// cojo lo del text area le a�ado un espacio y lo que coje el usuario.
		}
		// Si no, lo pasamos a la l�nea siguiente
		else
		{
			txaCampo2.setText(txaCampo2.getText()+"\n"+cadena);
			longitud = cadena.length();
		}
		// Borramos lo que haya en el textfield
		txtCampo1.setText("");
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}
