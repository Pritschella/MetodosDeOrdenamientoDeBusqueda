import java.util.Random;
import java.util.Scanner;

class BusquedaSecuencial{
	public void BusquedaSecuencial(int[] numeros) {
		Scanner leer =  new Scanner(System.in);
		boolean existe =  false;
		
		System.out.println("Ingrese el número a buscar");
		int numBuscado = leer.nextInt();
		
		for(int b = 0; b < numeros.length; b++) {
			if(numeros[b] == numBuscado) {
				System.out.println("El número si existe, en la posición " + (b + 1));
				break;
			}else
				existe =  false;
		}
		
		if(existe == false) {
			System.out.println("El número no existe");
		}
	}
}//Class


public class PruebaBusquedaSecuencial {

	public static void main(String[] args) {
		
		Random r =  new Random();
		Scanner e = new Scanner(System.in);
		
		BusquedaSecuencial bs =  new BusquedaSecuencial();
		
		int[] vector = {1, 5, 8, 2, 10, 4, 3};
		bs.BusquedaSecuencial(vector);
		
		
	}//main

}//class

