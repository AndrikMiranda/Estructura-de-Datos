package app;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Metodos {

	private int [] arreglo;
	private int [] tempArray;
	
	private boolean cambios;
	int aux;
	Random numAleatorio;
	
	public Metodos() {
		
	}
	
	public void generarArregloAleatorio(int tamaño) {
		
		numAleatorio = new Random();
		arreglo = new int [tamaño];
		
		for (int i = 0; i < arreglo.length; i++) {
			arreglo [i] = numAleatorio.nextInt();
		}
		
	}
	
	public void shell() {
		tempArray = Arrays.copyOf(arreglo, arreglo.length);
		
		for( int gap = tempArray.length / 2; gap > 0; gap = gap == 2 ? 1 : (int) ( gap / 2.2 ) ){ 
			for( int i = gap; i < tempArray.length; i++ ){ 
			int tmp = tempArray[ i ]; 
			int j; 
			for(j = i; j >= gap && tmp < tempArray[ j - gap ] ; j -= gap ){ 
				tempArray[ j ] = tempArray[ j - gap ]; 
			} 
			tempArray[ j ] = tmp; 
			} 
			} 
		
	}
	
	public void arregloOriginal(String opc) {
		
		System.out.println("El arreglo original es :");
		
		if(opc.equals("fila"))
			for (int i = 0; i < arreglo.length; i++) {
				if (i < arreglo.length-1)
					System.out.print( arreglo [i] + " < " );
				else
					System.out.print( arreglo [i] );
			}
		
		if(opc.equals("columna"))
			for (int i = 0; i < arreglo.length; i++) {
				System.out.println( arreglo[i] );
			}
	}
	
	public void imprimirArregloOrdenado(String opc) {
		
		System.out.println("\n\nEl arreglo ordenado es :");
		
		if(opc.equals("fila"))
			for (int i = 0; i < tempArray.length; i++) {
				if (i < tempArray.length-1)
					System.out.print( tempArray [i] + " < " );
				else
					System.out.print( tempArray [i] );
			}
		
		if(opc.equals("columna"))
			for (int i = 0; i < tempArray.length; i++) {
				System.out.println( tempArray[i] );
			}
		
	}
	
}
