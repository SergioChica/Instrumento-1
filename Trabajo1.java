import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Trabajo1 {
	
	public Trabajo1() {
		menu();
	}
	
	public void menu () {
		String menu = "1. Ingresar usuario\n";
		menu += "2. Salir\n\n";
		int opc = 0;
		do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opc) {
			case 1:
				registro();
				break;
				
			case 2:
                System.out.println("Salio");
				break;

			default:
				break;
			}
			
		} while (opc != 2);
	}
	
	public void registro() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
		int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento del usuario"));
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario"));
		String profesion = JOptionPane.showInputDialog("Ingrese la profesion del usuario");
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add(nombre);
		ArrayList<Integer> documentos = new ArrayList<Integer>();
		documentos.add(documento);
		ArrayList<Integer> edades = new ArrayList<Integer>();
		edades.add(edad);
		ArrayList<String> profesiones = new ArrayList<String>();
		profesiones.add(profesion);
		
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println("Total Usuarios"+(i+1)+"\n"+ nombres + documentos + edades + profesiones);
			System.out.println("");
			System.out.println("Cantidad de personas ingresadas: "+ i);
			System.out.println("");
		}
		
		for (int i = 0; i < edades.size(); i++) {
			if ( edades[i] >= 18 ) {
				
			}
			
		}
		
	}

}
