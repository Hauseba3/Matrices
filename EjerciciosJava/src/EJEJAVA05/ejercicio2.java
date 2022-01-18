/**
 * 
 */
package EJEJAVA05;
import java.util.Scanner;
/**
 * @author Jose
 *
 */
public class ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		boolean cero = true;
		
		int matriz[][];
		int filas, columnas;
		
		System.out.println("Introduce el numero de filas:");
		filas = entrada.nextInt();
		System.out.println("Introduce el numero de columnas:");
		columnas = entrada.nextInt();
		
		matriz = new int[filas][columnas];
		matrices.pedir_valores(matriz, filas, columnas);
		
		matrices.mostrar_matriz(matriz, filas, columnas);
		
		for (int i = 0; i < filas&&cero; i++) {
			
			for(int j=0; j<columnas; j++) {
				
				if(matriz[i][j]!=0) {
					cero = false;
				}
			}
		}
		
		if(cero) {
			System.out.println("Todos los numeros de la matriz son 0");
		} else {
			System.out.println("Algun valor de la matriz es distinto de 0");
		}
		
		entrada.close();

	}

}
