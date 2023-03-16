import javax.swing.JOptionPane;

public class Encargado extends Persona {
		
	private int PINE;
	
	public Encargado(String nombre, String apellido, int pINE) {
		super(nombre, apellido);
		PINE = pINE;
	}
	public int getPINE() {
		return PINE;
	}
	public void setPINE(int pINE) {
		PINE = 1010;
	}
	
	@Override
	public String toString() {
		return "Encargado [PINE=" + PINE + "]";
	}	
	
	public boolean IngresoEncargado(){
		int piningresado;
		piningresado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su PIN"));		
		if (piningresado==PINE) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "PIN incorrecto");
			return false;
	}
	}
	
	
	
}
