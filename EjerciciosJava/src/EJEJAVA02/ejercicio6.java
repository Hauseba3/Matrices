/**
 * 
 */
package EJEJAVA02;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int a�o;
		
		System.out.println("Introduce un a�o:");
		a�o = entrada.nextInt();
		
		if (a�o%4==0) {
			if ( ((a�o%100)==0)&&((a�o%400)!=0) ){
				System.out.println("El a�o " + a�o + " no es bisiesto");
			}
			else {
				System.out.println("El a�o " + a�o + "  es bisiesto");
			}
			System.out.println("El a�o " + a�o + " es bisiesto");
		}
		else {
			System.out.println("El a�o " + a�o + " no es bisiesto");
		}
		
		entrada.close();

	}

}
