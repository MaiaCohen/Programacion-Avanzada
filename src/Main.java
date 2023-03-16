import javax.swing.JOptionPane;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		int caje, m=0;
		Cliente cliente = new Cliente("Maia", "Cohen", 1234, 5000);
		Cajero cajero = new Cajero (50000, "", 1000, 1000, 1000);
		LinkedList<Movimientos> movimiento = new LinkedList<Movimientos>();
		Movimientos mov = new Movimientos (0, "");
		Encargado enc = new Encargado ("Joaquin", "Diaz", 1010);
		
		
		
		do {
			JOptionPane.showMessageDialog(null, "Bienvenido al Cajero");
			caje=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si es cliente, 2 si es encargado"));
			switch (caje) {
			case 1:
				MenuCliente(cliente, cajero, mov, movimiento);
				
				break;
			case 2:
				MenuEncargado(cajero, enc);
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opcion invalida");
				break;
			}
			m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 9 para salir, cualquier otro numero para continuar"));	
		} while (m!=9);
		
		
	}
	
	
	public static void MenuCliente(Cliente cliente, Cajero cajero, Movimientos mov, LinkedList<Movimientos> movimientos ) {
		String op;
		int a, mt=0;
		do {
		if (cliente.Ingresar()) {
			
			JOptionPane.showMessageDialog(null, "Bienvenido al Cajero");
			JOptionPane.showMessageDialog(null, "Seleccione el cajero que desea usar");
			op=JOptionPane.showInputDialog("A    B    C");
			
			switch (op.toLowerCase()) {
			case "a":
				JOptionPane.showMessageDialog(null, "Bienvenido al Cajero A");
				a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea realizar: \n 1- Retirar Dinero \n 2- Cambiar su PIN \n 3- Conusltar Movimientos"));
				switch (a) {
				case 1:
					RetirarDineroA(cliente, cajero, mov, movimientos);
					
					break;
				case 2:
					CambiarPin(cliente, cajero);	
					break;
				case 3:
					Movimientos(movimientos);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
					break;
				}
				
				break;
			case "b":
				JOptionPane.showMessageDialog(null, "Bienvenido al Cajero B");
				a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea realizar: \n 1- Retirar Dinero \n 2- Cambiar su PIN \n 3- Conusltar Movimientos"));
				switch (a) {
				case 1:
					RetirarDineroB(cliente, cajero, mov, movimientos);
					
					break;
				case 2:
					CambiarPin(cliente, cajero);	
					break;
				case 3:
					Movimientos(movimientos);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
					break;
				}
				break;
				
			case "c":
				JOptionPane.showMessageDialog(null, "Bienvenido al Cajero C");
				a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desea realizar: \n 1- Retirar Dinero \n 2- Cambiar su PIN \n 3- Conusltar Movimientos"));
				switch (a) {
				case 1:
					RetirarDineroC(cliente, cajero, mov, movimientos);
					
					break;
				case 2:
					CambiarPin(cliente, cajero);	
					break;
				case 3:
					Movimientos(movimientos);
					break;

				default:
					JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
					break;
				}
				break;
				
				
			default:
				JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
				break;
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Intentelo nuevamente");
		}
		
		mt=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 9 para salir, cualquier otro numero para continuar"));
		} while (mt!=9);
	}
	
	public static void MenuEncargado(Cajero cajero, Encargado enc) {
		String op;
		int a;
		if (enc.IngresoEncargado()) {
			JOptionPane.showMessageDialog(null, "Bienvenido al Cajero");
			JOptionPane.showMessageDialog(null, "Ingreso validado");
			op=JOptionPane.showInputDialog("Desea agregar billetes?");
			if (op.equalsIgnoreCase("si")) {
				AgregarBilletes(enc, cajero);
			} else {
				JOptionPane.showMessageDialog(null, "Se ha cerrado el sistema");
			}
			
		}
	}
	
	public static void RetirarDineroA(Cliente cliente, Cajero cajero, Movimientos mov, LinkedList<Movimientos> movimientos) {
		int extraer, m;
		String js;
		m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 9 para salir, cualquier otro numero para continuar"));
		do {
			js=JOptionPane.showInputDialog("Ingrese la fecha de hoy");
			mov.setFecha(js);
			extraer=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dinero a extraer"));
			
			if (cajero.getA()>extraer) {
				if (cliente.getSaldo()>extraer) {
					JOptionPane.showMessageDialog(null, "Dinero retirado con exito");
					JOptionPane.showMessageDialog(null, "Se entregan " + extraer + " pesos");
					cliente.setSaldo(cliente.getSaldo()-extraer);
					cajero.setA(cajero.getA()-extraer);
					JOptionPane.showMessageDialog(null, "Dinero restante en cuenta: " + cliente.getSaldo());
					Movimientos movimiento = new Movimientos (extraer, js);
					movimientos.add(movimiento);
					// comento el dinero restante en el cajero porque ningun cajero te dice cuanta plata tiene
					//		JOptionPane.showMessageDialog(null, "Dinero restante en cajero: " + cajero.getSaldo());
				} else {
					JOptionPane.showMessageDialog(null, "El monto pedido excede el saldo de su cuenta");
					JOptionPane.showMessageDialog(null, "El dinero en cuenta es: " + cliente.getSaldo());
					
				}
			} else {
				JOptionPane.showMessageDialog(null, "El cajero no tiene suficiente dinero");
			}
		m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 9 para ir hacia atras"));
		} while (m!=9);
	}
	
	public static void RetirarDineroB(Cliente cliente, Cajero cajero, Movimientos mov, LinkedList<Movimientos> movimientos) {
		int extraer, m;
		String js;
		m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 9 para salir, cualquier otro numero para continuar"));
		do {
			js=JOptionPane.showInputDialog("Ingrese la fecha de hoy");
			mov.setFecha(js);
			extraer=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dinero a extraer"));
			
			if (cajero.getB()>extraer) {
				if (cliente.getSaldo()>extraer) {
					JOptionPane.showMessageDialog(null, "Dinero retirado con exito");
					JOptionPane.showMessageDialog(null, "Se entregan " + extraer + " pesos");
					cliente.setSaldo(cliente.getSaldo()-extraer);
					cajero.setB(cajero.getB()-extraer);
					JOptionPane.showMessageDialog(null, "Dinero restante en cuenta: " + cliente.getSaldo());
					Movimientos movimiento = new Movimientos (extraer, js);
					movimientos.add(movimiento);
					
				} else {
					JOptionPane.showMessageDialog(null, "El monto pedido excede el saldo de su cuenta");
					JOptionPane.showMessageDialog(null, "El dinero en cuenta es: " + cliente.getSaldo());
					
				}
			} else {
				JOptionPane.showMessageDialog(null, "El cajero no tiene suficiente dinero");
			}
		m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 9 para ir hacia atras"));
		} while (m!=9);
	}
	
	public static void RetirarDineroC(Cliente cliente, Cajero cajero, Movimientos mov, LinkedList<Movimientos> movimientos ) {
		int extraer, m;
		String js;
		m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 9 para salir, cualquier otro numero para continuar"));
		do {
			js=JOptionPane.showInputDialog("Ingrese la fecha de hoy");
			mov.setFecha(js);
			extraer=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dinero a extraer"));
			
			if (cajero.getC()>extraer) {
				if (cliente.getSaldo()>extraer) {
					JOptionPane.showMessageDialog(null, "Dinero retirado con exito");
					JOptionPane.showMessageDialog(null, "Se entregan " + extraer + " pesos");
					cliente.setSaldo(cliente.getSaldo()-extraer);
					cajero.setC(cajero.getC()-extraer);
					JOptionPane.showMessageDialog(null, "Dinero restante en cuenta: " + cliente.getSaldo());
					Movimientos movimiento = new Movimientos (extraer, js);
					movimientos.add(movimiento);
				} else {
					JOptionPane.showMessageDialog(null, "El monto pedido excede el saldo de su cuenta");
					JOptionPane.showMessageDialog(null, "El dinero en cuenta es: " + cliente.getSaldo());
					
				}
			} else {
				JOptionPane.showMessageDialog(null, "El cajero no tiene suficiente dinero");
			}
		m=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 9 para ir hacia atras"));
		} while (m!=9);
	}
	
	
	public static void CambiarPin(Cliente cliente, Cajero cajero){
			int a, c=0;
			
			
				JOptionPane.showMessageDialog(null, "Tiene 3 intentos");
			a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su pin actual"));
			
			if (cliente.getPIN()==a) {
				JOptionPane.showMessageDialog(null, "Pin validado.");
				a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo PIN"));
				cliente.setPIN(a);
				JOptionPane.showMessageDialog(null, "Pin modificado. El pin actual es: " + cliente.getPIN());
			} else {
				do {
				c++;
				JOptionPane.showMessageDialog(null, "Pin incorrecto.");
			 } while (c!=3);
			}
			
	}
	
	public static void Movimientos(LinkedList<Movimientos> movimientos) {
		JOptionPane.showMessageDialog(null, movimientos);
	}
	
	public static void AgregarBilletes(Encargado enc, Cajero caj) {
		String asd;
		double agregar;
		JOptionPane.showMessageDialog(null, "Podra agregar billetes al cajero");
		asd=JOptionPane.showInputDialog("Seleccione a que cajero desea agregarle dinero    A    B    C");
		switch (asd.toLowerCase()) {
		case "a":
			JOptionPane.showMessageDialog(null, "CAJERO A TIENE $ " + caj.getA() );
			agregar=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a agregar"));
			JOptionPane.showMessageDialog(null, "El monto agregado es de: " + agregar);
			caj.setA(caj.getA()+agregar);
			break;
			
		case "b":
			JOptionPane.showMessageDialog(null, "CAJERO B TIENE $ " + caj.getB() );
			agregar=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a agregar"));
			JOptionPane.showMessageDialog(null, "El monto agregado es de: " + agregar);
			caj.setB(caj.getB()+agregar);
			break;
			
		case "c":
			JOptionPane.showMessageDialog(null, "CAJERO C TIENE $ " + caj.getC() );
			agregar=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a agregar"));
			JOptionPane.showMessageDialog(null, "El monto agregado es de: " + agregar);
			caj.setC(caj.getC()+agregar);
			break;
		default:
			break;
		}
		
	}
	
	

}
