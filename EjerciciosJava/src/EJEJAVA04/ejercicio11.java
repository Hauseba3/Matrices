/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int vector1[], vector2[], vector_suma[];
		int tama�o;
		
		System.out.println("Introduce el tama�o de los vectores que quieres sumar");
		tama�o = entrada.nextInt();
		
		System.out.println("Valores del primer vector");
		vector1 = new int[tama�o];
		Vectores.pedir_valores(vector1, tama�o);
		
		System.out.println("Valores del segundo vector");
		vector2 = new int[tama�o];	
		Vectores.pedir_valores(vector2, tama�o);
		
		vector_suma = new int[tama�o];
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i] = vector1[i]+vector2[i];
		}
		
		Vectores.mostrar_valores(vector_suma, tama�o);
		
		entrada.close();

	}

}
