import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio4 extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	Panel panel3 = new Panel();
	Label etiqueta = new Label ("¿Tipo de motorización?");
	CheckboxGroup grupoMotor = new CheckboxGroup();
	Checkbox uno = new Checkbox("Gasolina", false, grupoMotor);
	Checkbox dos = new Checkbox("Diésel", false, grupoMotor);
	Checkbox tres = new Checkbox("Hibrido", false, grupoMotor);
	Checkbox cuatro = new Checkbox("Eléctrico", false, grupoMotor);
	Label etiqueta2 = new Label("¿Número de puertas?" );
	CheckboxGroup grupoPuertas = new CheckboxGroup();
	Checkbox cinco = new Checkbox("3 puertas", false, grupoPuertas);
	Checkbox seis = new Checkbox("4 puertas", false, grupoPuertas);
	Checkbox siete = new Checkbox("5 puertas", false, grupoPuertas);
	Label etiqueta3 = new Label("¿Pintura Metalizada?" );
	CheckboxGroup grupoMetal = new CheckboxGroup();
	Checkbox ocho = new Checkbox("Si", false, grupoMetal);
	Checkbox nueve = new Checkbox("No", false, grupoMetal);
	Button calcular = new Button("Calcular presupuesto");
	public Ejercicio4()
	{
		setLayout(new FlowLayout());
		setTitle("Vehículos");
		panel1.add(etiqueta);
		panel1.add(uno);
		panel1.add(dos);
		panel1.add(tres);
		panel1.add(cuatro);
		add(panel1);
		panel2.add(etiqueta2);
		panel2.add(cinco);
		panel2.add(seis);
		panel2.add(siete);
		add(panel2);
		panel3.add(etiqueta3);
		panel3.add(ocho);
		panel3.add(nueve);
		add(panel3);
		add(calcular);
		// Añadir el Listener a la ventana
		addWindowListener(this);
		//Añadir Listener al botón
		calcular.addActionListener(this);
		setSize(450,250);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Ejercicio4();
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
	public void actionPerformed(ActionEvent ae)
	{
		int presupuesto=0;
		if(uno.getState()==true)
		{
			presupuesto = presupuesto + 7000;
		}
		if(dos.getState()==true)
		{
			presupuesto = presupuesto + 8000;
		}
		if(tres.getState()==true)
		{
			presupuesto = presupuesto + 9000;
		}
		if(cuatro.getState()==true) // comprueba el estado de chekbox si esta marcado hacer
		{
			presupuesto = presupuesto + 8500; // presupuesto + la cantidad guardar en presupuesto
		}
		if(cinco.getState()==true)
		{
			presupuesto = presupuesto + 2000;
		}
		if(seis.getState()==true)
		{
			presupuesto = presupuesto + 3000;
		}
		if(siete.getState()==true)
		{
			presupuesto = presupuesto + 2500;
		}
		if(ocho.getState()==true)
		{
			presupuesto = presupuesto + 1500;
		}
		System.out.println(presupuesto+" €");
	}
}
