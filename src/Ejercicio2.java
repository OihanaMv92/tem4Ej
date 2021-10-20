import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class Ejercicio2 implements WindowListener,
ActionListener
{

	Frame ventana = new Frame("Calcular Iva");
	Panel PanelIVA= new Panel();
	Label lblCantidad = new Label("Introduzca Cantidad");
	Label lblPorcentaje = new Label("Introduzca porcentaje");
	Label lblResultado = new Label("Resultado");
	TextField txtCantidad = new TextField(20);
	TextField txtporcentaje = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	TextField txtResultado = new TextField(30);
	



	public Ejercicio2()
	{
		ventana.setLayout(new FlowLayout());
		
		ventana.add(lblCantidad);
		ventana.add(txtCantidad);
		ventana.add(lblPorcentaje);
		ventana.add(txtporcentaje);
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		ventana.add(txtResultado);
		ventana.setSize(380,170);
		ventana.setResizable(false);
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}


	public static void main(String[] args)
	{
		new Ejercicio2();
	}


	@Override
	public void actionPerformed(ActionEvent arg0)
	{

		if(arg0.getSource().equals(btnCalcular))
		{
		// Calculamos el porcentaje
		float resultado =

		Float.parseFloat(txtCantidad.getText())*Float.parseFloat(txtporcentaje.getText())/(float)100.0;
		// Colocamos el resultado en el Textfield correspondiente
		// Sumar "" a un número lo transforma en CADENA
		txtResultado.setText(resultado+"");
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
		System.exit(0);
		
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