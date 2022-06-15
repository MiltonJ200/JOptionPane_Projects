import javax.swing.JOptionPane;

class Convercion 
{ 
	public static void main (String[] args) 
	{float Pesos, Dolares ;//variables
	 
	 Pesos=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cantidad de pesos"));
	 Dolares=(float)(Pesos/19.32);
	 JOptionPane.showMessageDialog(null,"La a dolares es de $. "+Dolares);
    
    }//Module
}//Clase
