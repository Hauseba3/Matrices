/**
 * 
 */
package prueba;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int a�o, dia, mes, suerte;
		
		System.out.println("Introduce tu a�o de nacimiento: ");
		Scanner entrada = new Scanner (System.in);
		a�o = entrada.nextInt();
		
		System.out.println("Introduce el mes de nacimiento: ");
		Scanner entrada2 = new Scanner (System.in);
		mes = entrada2.nextInt();
		
		System.out.println("Introduce tu dia de nacimiento: ");
		Scanner entrada3 = new Scanner (System.in);
		dia = entrada3.nextInt();
		
		suerte = a�o+mes+dia;
		
		System.out.println("Tu numero de la suerte es: " + ((suerte/1000)+((suerte/100)%10)+((suerte/10)%10)+(suerte%10)));
		
		entrada.close();
		entrada2.close();
		entrada3.close();

	}

}
