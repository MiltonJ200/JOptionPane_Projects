import javax.swing.JOptionPane;

class Porcentaje_hm
{
	public static void main (String[] args)
	{ float nh, nm, ta, ph, pm;//Variables
	
	nh=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cuantos hombres hay en el grupo"));
	nm=Float.parseFloat(JOptionPane.showInputDialog("Ingrese cuantas mujeres hay en el grupo"));
	ta=(float)(nh+nm);
	ph=(float)(nh*100/ta);
	pm=(float)(nm*100/ta);	
	JOptionPane.showMessageDialog(null, "El porcentaje de hombres en el grupo son: "+ph);
	JOptionPane.showMessageDialog(null, "El porcentaje de mujeres en el grupo son: "+pm);
    }//Modulo
}//Clase