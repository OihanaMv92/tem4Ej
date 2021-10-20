import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Aceptar extends Frame implements WindowListener,
ActionListener
{
	private static final long serialVersionUID = 1L;
	Button btnAceptar = new Button("Aceptar");
	Button btnCancelar = new Button ("Cancelar");
	Button btnSalir = new Button("Salir");
	Button btnVolver = new Button ("Volver");
	public Aceptar()
	{
		setLayout(new FlowLayout()); // añadir distribucion
		setTitle("Nombre Ventana");
		add(btnAceptar);
		add(btnCancelar);
		add(btnVolver);
		add(btnSalir);
		addWindowListener(this);  // añadir el windowsListener a la ventana
		//Añadir el listener al botón
		btnAceptar.addActionListener(this); 
		btnCancelar.addActionListener(this);
		btnVolver.addActionListener(this);
		btnSalir.addActionListener(this);
		setResizable(false);// no poder maximizar
		setSize(200,100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Aceptar();
	}

	@Override
	public void actionPerformed(ActionEvent EventoGenerado)
	{
		if(EventoGenerado.getSource().equals(btnAceptar)) { // getSource te dice en que boton se produce el evento (Donde pulsa el usuario) es igual al btnAceptar
			System.out.println("Pulsaste el boton Aceptar..");
			
		}
		else if(EventoGenerado.getSource().equals(btnCancelar)) {
		System.out.println("Pulsaste el boton Cancelar..");
		}	
		else if(EventoGenerado.getSource().equals(btnVolver)){
			System.out.println("Pulsaste el boton Volver..");
		}
		else if(EventoGenerado.getSource().equals(btnSalir)) { // al boton salir añadimos el system exit
			System.out.println("Hasta Luego Lucas..");
			System.exit(0);
		}
		
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{}

	@Override
	public void windowClosed(WindowEvent arg0)
	{}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0); // Funciona la x
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		System.out.println("me han restaurado"); // Bajar
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		System.out.println("Me han minimizado..."); // agrandar
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{}

	@Override
	public void windowOpened(WindowEvent arg0)
	{}

}
