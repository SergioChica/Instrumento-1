import javax.swing.JOptionPane;

public class Trabajo2 {
	
	public Trabajo2(){
		numeros();
	}
	
	public void numeros() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para su arreglo 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para su arreglo 1"));
		
		suma(num1,num2);
	}
	
	public void suma(int n1,int n2) {
		int array1 [] = new int [1];
		int array2 [] = new int [1];
		int array3 []= new int [1];
		
		array1[0]=n1;
		array2[0]=n2;
		array3[0]= array1[0] + array2[0];
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println("Arreglo numero 1: "+ array1[i] +" Arreglo numero 2: "+ array2[i] +" Resultado: "+array3[i]);
		}
		
		
	}
	


}
