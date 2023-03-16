import javax.swing.JOptionPane;

public class Cliente extends Persona {
		
	private int PIN;
	private double saldo;
	
	public Cliente(String nombre, String apellido, int pIN, double saldo) {
		super(nombre, apellido);
		PIN = pIN;
		this.saldo = saldo;
	}
	

	public int getPIN() {
	return PIN;
}

	public void setPIN(int pIN) {
	PIN = pIN;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [PIN=" + PIN + ", saldo=" + saldo + "]";
	}
	
	public boolean Ingresar(){
		PIN = 1234;
		int piningresado;
		piningresado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su PIN"));		
		if (piningresado==PIN) {
			JOptionPane.showMessageDialog(null, "Ingreso validado");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "PIN incorrecto");
			return false;
	}
		
	
		
	
		
	} }
