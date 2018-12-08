import java.util.Scanner;

class BusquedaBinaria{
	public int busquedaBinaria(int numeros[], int elemento) {
		int centro, primero, valorCentro, ultimo;
		primero = 0;
		ultimo = numeros.length -1;
		while(primero <= ultimo){
			centro = (primero + ultimo) /2;
			valorCentro = numeros[centro];
			System.out.println("Comparando " + elemento + " con " + numeros[centro]);
			
			
			if(elemento == valorCentro) {
				return centro;
			}else if(elemento < valorCentro) {
				ultimo = centro - 1;
			}else {
				primero =  centro + 1;
			}
		}
		return -1;
	}
	
}//Class

public class PruebaBusquedaBinaria {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		BusquedaBinaria bb =  new BusquedaBinaria();
		
		int[] vector = {1, 5, 8, 10, 20, 50, 80, 100, 120, 150};
		bb.busquedaBinaria(vector, 50);

	}//main

}//Class
