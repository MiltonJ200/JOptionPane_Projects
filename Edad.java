import javax.swing.JOptionPane;

class edad
{
	public static void main (String[] args)
	{float fnac, fact, edad;//variables
	
	fnac=Float.parseFloat(JOptionPane.showInputDialog("Ingrese año de nacimiento"));
	fact=Float.parseFloat(JOptionPane.showInputDialog("Ingrese fehca actual"));
	edad=(float)(fact-fnac);
	JOptionPane.showMessageDialog(null, "Su edad es de "+ edad );
    
    }//Modulo
}//Clase