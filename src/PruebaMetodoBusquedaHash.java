import java.util.Arrays;

class HashCero{
	
	String[] arreglo;
	int tamaño, contador;
	public HashCero(int tam) {
		tamaño = tam;
		arreglo = new String[tam];
		Arrays.fill(arreglo, "-1");
	}
	
	public void funcionHash(String[] cadenaArreglo, String[] arreglo) {
		int i;
		for(i = 0; i < cadenaArreglo.length; i++) {
			String elemento = cadenaArreglo[i];
			int indiceArreglo = Integer.parseInt(elemento) % 7;
			System.out.println("El indice es " + indiceArreglo + " para el elemento " + elemento);
			
			while(arreglo[indiceArreglo] != "-1") {
				indiceArreglo ++;
				System.out.println("Ocurrió una colision para el indice " + (indiceArreglo - 1) + 
						" cambiar al indice " + indiceArreglo);
				indiceArreglo %= tamaño;
			}
			arreglo[indiceArreglo] = elemento;
		}
	}
	
	//public void mostrar(){
	
	public String buscarClave(String elemento) {
		int indiceArreglo = Integer.parseInt(elemento) %7;
		int contador = 0;
		
		while(arreglo[indiceArreglo] != "-1") {
			if(arreglo[indiceArreglo] == elemento) {
				System.out.println("El elemento " + elemento + " fue encontrado en la posicion: " + indiceArreglo);
				return arreglo[indiceArreglo];
			}
			indiceArreglo ++;
			indiceArreglo %= tamaño;
			contador ++;
			if(contador > 7) {
				break;
			}
		}
		return null;
	}
	
}//Clase

public class PruebaMetodoBusquedaHash {

	public static void main(String[] args) {
		
		HashCero hc =  new HashCero(8);
		String[] elementos = {"20", "33", "21", "10", "12", "14", "56", "100"};
		hc.funcionHash(elementos, hc.arreglo);
		//hc.mostrar();
		String buscado = hc.buscarClave("33");
		if(buscado == null) {
			System.out.println("El elemento 33 no se encuentra en la tabla");
		}
		

	}//main

}//clase
