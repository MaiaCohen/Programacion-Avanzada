
public class Cajero {
	private int dinerodisp;
	private String mov;
	private double a, b, c;

	

	public Cajero(int dinerodisp, String mov, double a, double b, double c) {
		super();
		this.dinerodisp = dinerodisp;
		this.mov = mov;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getDinerodisp() {
		return dinerodisp;
	}

	public void setDinerodisp(int dinerodisp) {
		this.dinerodisp = dinerodisp;
	}
	

	public String getMov() {
		return mov;
	}

	public void setMov(String mov) {
		this.mov = mov;
	}
	

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Cajero [dinerodisp=" + dinerodisp + "]";
	}
	
	
}
