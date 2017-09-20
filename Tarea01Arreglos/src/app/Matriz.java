package app;

public class Matriz {

	private int [] [] arreglo;
	private int [] vector;
	private int mayor;
	private int menor;
	
	
	public Matriz() {
		
	}
	
	
	
	public void genMatriz(int a, int x, int y) {
		
		if(a == 1) {//Diagonal principal con 1's
			
			arreglo = new int [x] [x];
						
			for (int i = 0; i < arreglo.length; i++) {//Eje Y
				for (int j = 0; j < arreglo.length; j++) {//Eje X
					if (i == j) 
						arreglo [i] [j] = 1;
				}
			}
		}//Final del if  1
		
		if(a == 2) {//Diagonal triangular superior con 0´s.
			
			arreglo = new int [x] [x];
			
			for (int i = 0; i < arreglo.length; i++) {//Eje Y
				for (int j = 0; j < arreglo.length; j++) {//X
					
					arreglo [i] [j] = 1;
					
					if (i <= j)
						arreglo [i] [j] = 0;
				}
			}
		}//Final del if  2
		
		if(a == 3) {//Genéro arreglo con números aleatorios y genéro vector a partir de numeros pares de cada fila.
			
			arreglo = new int [x] [x];
			vector = new int [x];
			int aux =0;
			
			for (int i = 0; i < arreglo.length; i++) {
				for (int j = 0; j < arreglo.length; j++) {
					arreglo [i] [j] = (int) (Math.random()*9+1);
					if(arreglo [i] [j] %2 == 0 ) {
						aux = arreglo [i] [j] + aux;
					}
					vector [i] = aux;
				}
				aux =0;//Reset a la variable, para pasar ala siguiente fila sin arrastlar valores.
			}
		}//Final del if  3
		
		if(a == 4) {
			
			arreglo = new int [x] [y];
			mayor =0;
			menor =1;
			
			for (int i = 0; i < arreglo.length; i++) {
				for (int j = 0; j < arreglo[i].length; j++) {
					arreglo [i] [j] = (int) (Math.random()*9+1);//Números aleatorios 1-10
					
					if(arreglo [i] [j] > mayor ) 
						mayor = arreglo [i] [j];
					if(arreglo [i] [j] < menor)
						menor = arreglo [i] [j];	
				}
			}
			
		}//Final del if  4
		
	}//Final del método generarMatriz
	
	public void imprimirMatriz(Matriz m) {
		
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				System.out.print( arreglo [i] [j] +" ");
			}//Fin 2do for
			System.out.print("\n");
		}//Fin 1er for
		
	}
	
	public void imprimirMatrizCuadrada(Matriz m) {
		
			for (int i = 0; i < arreglo.length; i++) {
				for (int j = 0; j < arreglo.length; j++) {
					System.out.print( arreglo [i] [j] +" ");
				}//Fin 2do for
				System.out.print("\n");
			}//Fin 1er for
		
	}
	
	public void imprimirVector() {
		for(int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
	
	public void mayorMenor() {
		System.out.println("El número mayor es : " + mayor
										   +"\nEl número menor es : " + menor);
	}
	
}
