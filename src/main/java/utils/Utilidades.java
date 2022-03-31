package main.java.utils;

public class Utilidades {

	/**
	 * Método genérico que recibe un array de cualquier clase y devuelve un array
	 * del mismo tamaño, pero en orden inverso. Si el objeto que recibe es nulo (null)
	 * se devuelve el mismo objeto. Si está vacío, se devuelve un array del mismo tipo
	 * vacío o sin elementos
	 * @param <T> Tipo genérico que puede utilizarse con cualquier objeto
	 * @param arrayOriginal array a invertir
	 * @return array invertido
	 */
	public static <T> T[] reverse ( T[] arrayOriginal) {
		
		T[] arrayInvertido = null;
		
		if(arrayOriginal !=null) {
			
			arrayInvertido = arrayOriginal.clone();
	
			for(int i =0; i<arrayOriginal.length; i++) {
				arrayInvertido[i] = arrayOriginal[arrayOriginal.length-1-i];
			}
			
			
		}
		
		return arrayInvertido;
	}

}
