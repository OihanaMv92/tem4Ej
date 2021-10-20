import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio3 implements WindowListener,
ActionListener
{

	Frame ventana= new Frame("Aficiones");
	Checkbox uno = new Checkbox("Correr");
	Checkbox dos = new Checkbox("Nadar");
	Checkbox tres = new Checkbox("Andar");
	Checkbox cuatro = new Checkbox("Leer");
	Checkbox cinco = new Checkbox("Ir al Cine");
	Checkbox seis = new Checkbox("Bailar");
	Checkbox siete = new Checkbox("Fútbol");
	Checkbox ocho = new Checkbox("Tenis");
	Checkbox nueve = new Checkbox("Baloncesto");
	Checkbox diez = new Checkbox("Deportes de Vela");
	Button btnComprobar = new Button("Comprobar");
	String resultado = new String("");
	public Ejercicio3()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setTitle("Aficiones");
		ventana.add(uno);
		ventana.add(dos);
		ventana.add(tres);
		ventana.add(cuatro);
		ventana.add(cinco);
		ventana.add(seis);
		ventana.add(siete);
		ventana.add(ocho);
		ventana.add(nueve);
		ventana.add(diez);
		ventana.add(btnComprobar);
		ventana.addWindowListener(null);

		ventana.setSize(400,150);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio3();
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		resultado = "";
		if(uno.getState()==true)
		{
			resultado = resultado + "Correr\n";
		}
		if(dos.getState()==true)
		{
			resultado = resultado + "Nadar\n";
		}
		if(tres.getState()==true)
		{
			resultado = resultado + "Andar\n";
		}
		if(cuatro.getState()==true)
		{
			resultado = resultado + "Leer\n";
		}
		if(cinco.getState()==true)
		{
			resultado = resultado + "Ir al Cine\n";
		}
		if(seis.getState()==true)
		{
			resultado = resultado + "Bailar\n";
		}
		if(siete.getState()==true)
		{
			resultado = resultado + "Fútbol\n";
		}
		if(ocho.getState()==true)
		{
			resultado = resultado + "Tenis\n";
		}
		if(nueve.getState()==true)
		{
			resultado = resultado + "Baloncesto\n";
		}
		if(diez.getState()==true)
		{
			resultado = resultado + "Deportes de vela\n";
		}
		System.out.println(resultado);
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

