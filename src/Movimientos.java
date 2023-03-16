
public class Movimientos {
	private int retirado;
	private String fecha;
	
	public Movimientos(int retirado, String fecha) {
		super();
		this.retirado = retirado;
		this.fecha = fecha;
	}
	public int getRetirado() {
		return retirado;
	}
	public void setRetirado(int retirado) {
		this.retirado = retirado;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return " Movimientos: \n Retirado: -" + retirado + " \n Fecha: " + fecha + "]";
	}
	
	
}
