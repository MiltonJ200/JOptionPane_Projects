import javax.swing.JOptionPane;

class Masa_del_aire
{
	public static void main (String[] args) 
	{ float presion, volumen, temperatura, masa;//variables
	
	presion=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la Presion"));
	volumen=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el volumen"));
	temperatura=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la Temperatura"));
	masa=(float)((presion*volumen)/(0.37*(temperatura+460)));
	JOptionPane.showMessageDialog(null, "La masa es de: "+ masa);
    }//modulo
}//clase