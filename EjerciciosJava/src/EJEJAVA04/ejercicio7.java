/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int vector1 [], vector2 [];
		int tama�o;
		boolean paralelos = true;
		
		System.out.println("Introduce la cantidad de numeros que quieres que contengan los vectores:");
		tama�o = entrada.nextInt();
		
		vector1 = new int[tama�o];
		Vectores.pedir_valores(vector1, tama�o);
		
		vector2 = new int[tama�o];
		Vectores.pedir_valores(vector2, tama�o);
		
		int division=0, division2=0;
		
		for (int i = 0; i < vector2.length-1 && paralelos; i++) {
			
			division = vector1[i]/vector2[i];
			division2 = vector1[i+1]/vector2[i+1];
			
			if(division!=division2) {
				paralelos = false;
			}
			
		}
		
		if(paralelos) {
			System.out.println("Los vectores son paralelos");
		} else {
			System.out.println("Los vectores no son paralelos");
		}
		
		entrada.close();

	}

}
