/**
 * 
 */
package EJEJAVA04;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int vector1[], vector2[], vector_suma[];
		int tama�o, tama�o2;
		
		System.out.println("Introduce el tama�o del primer vector");
		tama�o = entrada.nextInt();
		vector1 = new int[tama�o];
		Vectores.pedir_valores(vector1, tama�o);
		
		System.out.println("Introduce el tama�o del segundo vector");
		tama�o2 = entrada.nextInt();
		vector2 = new int[tama�o2];	
		Vectores.pedir_valores(vector2, tama�o2);
		
		vector_suma = new int[tama�o+tama�o2];
		for(int i=0; i<vector1.length;i++)
		  	vector_suma[i] = vector1[i];
		  
		for(int i=0; i<vector2.length;i++)
		  	vector_suma[tama�o+i] = vector2[i];
		
		//OTRA FORMA DE HACERLO
		/*vector_suma = new int[tama�o+tama�o2];
		int x = 0;
		for (int i = 0; i < vector_suma.length; i++) {
			
			if(tama�o>i) {
				vector_suma[i] = vector1[i];
			} else {
				vector_suma[i] = vector2[x];
				x++;
			}
		}*/
		
		Vectores.mostrar_valores(vector_suma, tama�o2);
		
		entrada.close();

	}

}
