/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class Vectores {
	
	public static void pedir_valores(int vector [], int tama�o) {
		
		Scanner pedir = new Scanner (System.in);
		
		for(int i = 0; i<tama�o; i++) {
			System.out.println("Introduce un numero entero para la posicion " + i);
			vector[i] = pedir.nextInt();
		}
		
	}

	
	public static void mostrar_valores(int vector [], int tama�o) {
		
		for(int i = 0; i<vector.length; i++) {
			System.out.println(vector[i]);
		}
		
	}

}
