import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Trabajo1 {
	HashMap<String, ArrayList<String>> mapUsuarios;
	ArrayList<String> listaUsuarios = new ArrayList<String>();

	
	public Trabajo1() {
	    mapUsuarios = new HashMap<>();
	    listaUsuarios = new ArrayList<>();
	    menu();
	}
	
	public void menu () {
		String menu = "1. Ingresar usuario\n";
		menu += "2. Total usuarios\n";
		menu += "3. Cantidad usuarios\n";
		menu += "4. Usuarios mayores de edad\n";
		menu += "5. Usuarios menores de edad\n";
		menu += "6. Salir\n\n";
		int opc = 0;
		do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opc) {
			case 1:
				registro();
				break;
				
			case 2:
				imprimirListaUsuarios();
				break;
				
			case 3:
                cantidadUsuarios();
				break;

			case 4:
                usuariosMayores();
				break;
			
			case 5:
                usuariosMenores();
				break;
				
			case 6:
                System.out.println("Salio");
				break;	
				
			default:
				break;
			}
			
		} while (opc != 6);
	}
	
	public void registro() {
	    int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento del usuario"));
	    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
	    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario"));
	    String profesion = JOptionPane.showInputDialog("Ingrese la profesión del usuario");

	    ArrayList<String> usuario = new ArrayList<>();
	    usuario.add(documento+"");
	    usuario.add(nombre);
	    usuario.add(edad+"");
	    usuario.add(profesion);
	    
	    listaUsuarios.addAll(usuario);
	    guardarDatos(usuario);
	}
	
	public void guardarDatos(ArrayList<String> usuario) {
	    mapUsuarios.put(usuario.get(0), usuario);
	    JOptionPane.showMessageDialog(null, "Registro exitoso!");
	}
	
	public void imprimirListaUsuarios() {		
		for (String documento:mapUsuarios.keySet()) {
			System.out.println(documento + " - "+ mapUsuarios.get(documento));
		}
	}
		
	public void cantidadUsuarios() {
		System.out.println("Cantidad de usuarios ingresados: "+ mapUsuarios.size());
	}
	
	public void usuariosMayores() {
	    for (String documento : mapUsuarios.keySet()) {
	        ArrayList<String> usuario = mapUsuarios.get(documento);
	        int edad = Integer.parseInt(usuario.get(2)); 

	        if (edad >= 18) {
	            System.out.println(documento + " - " + usuario);
	        }
	    }
	}
	
	public void usuariosMenores() {
	    for (String documento : mapUsuarios.keySet()) {
	        ArrayList<String> usuario = mapUsuarios.get(documento);
	        int edad = Integer.parseInt(usuario.get(2)); 

	        if (edad < 18) {
	            System.out.println(documento + " - " + usuario);
	        }
	    }
	}

}
