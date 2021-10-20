import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BOTONES implements WindowListener,
ActionListener
{
	Frame ventana1 = new Frame("Ventana Uno");
	Frame ventana2 = new Frame("Ventana Dos");
	Button btnAceptar = new Button("Aeptar");
	Button btnCancelar = new Button("cancelar");
	Button btnsi = new Button("si");
	Button btnno = new Button("no");
	Label lblNombre = new Label("Nombre:");
	TextField txtNombre = new TextField(20);
	TextField txtApellido = new TextField(20);
	TextField txtDni = new TextField(20);
	Label lblApellido = new Label("Apellido:");
	Label lbldni = new Label("Dni:");
	Label lblBorrar = new Label("Estas seguro de borrar?");

	public BOTONES()
	{
		ventana1.setLayout(new FlowLayout());
		ventana1.add(lblNombre);
		ventana1.add(txtNombre);
		ventana1.add(lblApellido);
		ventana1.add(txtApellido);
		ventana1.add(lbldni);
		ventana1.add(txtDni);
		ventana1.add(btnAceptar);
		ventana1.add(btnCancelar);
		
		ventana2.setLayout(new FlowLayout());
		ventana2.add(lblBorrar);
		ventana2.add(btnsi);
		ventana2.add(btnno);

		ventana1.addWindowListener(this);
		btnAceptar.addActionListener(this);
		btnCancelar.addActionListener(this);
		ventana1.setLocationRelativeTo(null);//Ventana centrada

		ventana2.addWindowListener(this);
		btnsi.addActionListener(this);
		btnno.addActionListener(this);
		ventana2.setLocationRelativeTo(null);//Ventana centrada
		
		
		ventana1.setSize(200,250);
		ventana1.setBackground(Color.pink);
		ventana2.setBackground(Color.cyan);
		ventana1.setVisible(true);
		ventana2.setVisible(false);
		ventana2.setSize(170,100);
	}
	

	public static void main(String[] args)
	{
		 new BOTONES();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource().equals(btnAceptar)) 
		{ 

			ventana2.setVisible(true);
			
			
		}
		else if(arg0.getSource().equals(btnCancelar)) {
		System.exit(0);
		}	
		else if(arg0.getSource().equals(btnno)) 
		{ 

			ventana1.setVisible(true);
			
			
		}
		else if(arg0.getSource().equals(btnsi)) {
		System.exit(0);
		}	
		
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		//Me gusta renombrar los eventos para que no haya confusiones a posteriori
		if (ventana1.isActive())
		{
			ventana1.setVisible(false);
		}
		else if (ventana2.isActive())
		{
			ventana1.setVisible(true);
			ventana2.setVisible(false);
		}
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

}
