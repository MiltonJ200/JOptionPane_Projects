import javax.swing.JOptionPane;

class Descuento 
{
	public static void main (String[] args) 
	{float total_compra, descuento, total_pagar;//variable
	
	total_compra=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su total de la compra"));
	descuento=(float)(total_compra*0.15);
	total_pagar=(float)(total_compra-descuento);
	JOptionPane.showMessageDialog(null, "Su total a pagar es de $."+total_pagar);
    
    }//modulo
}//clase
	