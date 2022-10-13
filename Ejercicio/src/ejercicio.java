import javax.swing.JOptionPane;

class ejercicio {

	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Aca empieza el programa");
		
		int	numero = 10;
		 Autor cortazar = new Autor("Julio","Cortazar","1914","masculino","Cortazar321@gmail.com");
		 
		JOptionPane.showMessageDialog(null, cortazar);
		
	    Libro rayuela = new Libro ("Rayuela","1940",10,100,cortazar);
	    JOptionPane.showMessageDialog(null, rayuela);
		
		
	}

}
