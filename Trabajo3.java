import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Trabajo3 {
	HashMap<String, ArrayList<String>> mapUsuarios;
	ArrayList<String> listaUsuarios =  new ArrayList<String>();
	double porcentajeDescuento,descuento,sueldoActual;

	
	public Trabajo3(){
	    mapUsuarios = new HashMap<>();
	    listaUsuarios = new ArrayList<>();
		menu();
	}
	
	public void menu () {
		String menu = "1. Ingresar empleado\n";
		menu += "2. Consultar descuento del empleado\n";
		menu += "3. Salir\n\n";
		int opc = 0;
		do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opc) {
			case 1:
				registro();
				break;
				
			case 2:
                calcularDescuento();
				break;
			
			case 3:
                System.out.println("Salio");
				break;
				
			default:
				break;
			}
			
		} while (opc != 3);
	}
	
	public void registro() {
	    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
	    double sueldoAntiguo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo actual del empleado"));
	    int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato del empleado"));
	    
	    ArrayList<String> usuario = new ArrayList<>();
	    usuario.add(nombre);
	    usuario.add(sueldoAntiguo+"");
	    usuario.add(estrato+"");
	    
	    listaUsuarios.addAll(usuario);
	    guardarDatos(usuario);
	}
	
	public void guardarDatos(ArrayList<String> usuario) {
	    mapUsuarios.put(usuario.get(0), usuario);
	    JOptionPane.showMessageDialog(null, "Registro exitoso!");
	}
	
	public void calcularDescuento() {		
	    for (String nombre:mapUsuarios.keySet()) {
	        ArrayList<String> usuario = mapUsuarios.get(nombre);
	        String nombreEmpleado = usuario.get(0); 
	        
            String consultaNombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            if (nombreEmpleado.equals(consultaNombre)) {
    	        int estratoEmpleado = Integer.parseInt(usuario.get(2));
    	        double sueldoAntiguoEmpleado = Double.parseDouble(usuario.get(1));
    	        
    	        if (estratoEmpleado == 1 || estratoEmpleado == 2 ) {
					porcentajeDescuento = 0.02;
					descuento = sueldoAntiguoEmpleado * porcentajeDescuento;
					sueldoActual = sueldoAntiguoEmpleado - descuento;
					System.out.println("El empleado: "+consultaNombre+ " Tiene un descuento de: "+descuento+ "\n su sueldo sera de: "+ sueldoActual);
				}else if(estratoEmpleado == 3 || estratoEmpleado == 4 ) {
					porcentajeDescuento = 0.04;
					descuento = sueldoAntiguoEmpleado * porcentajeDescuento;
					sueldoActual = sueldoAntiguoEmpleado - descuento;
					System.out.println("El empleado: "+consultaNombre+ " Tiene un descuento de: "+descuento+ "\n su sueldo sera de: "+ sueldoActual);
				}else if(estratoEmpleado == 5) {
					porcentajeDescuento = 0.08;
					descuento = sueldoAntiguoEmpleado * porcentajeDescuento;
					sueldoActual = sueldoAntiguoEmpleado - descuento;
					System.out.println("El empleado: "+consultaNombre+ " Tiene un descuento de: "+descuento+ "\n su sueldo sera de: "+ sueldoActual);
				}else if(estratoEmpleado == 6) {
					porcentajeDescuento = 0.1;
					descuento = sueldoAntiguoEmpleado * porcentajeDescuento;
					sueldoActual = sueldoAntiguoEmpleado - descuento;
					System.out.println("El empleado: "+consultaNombre+ " Tiene un descuento de: "+descuento+ "\n su sueldo sera de: "+ sueldoActual);
				}else {
					System.out.println("El estrato no esta registrado");
				}

            } else {
            	System.out.println("El empleado no esta registrado.");
            }

	    }
	}
}