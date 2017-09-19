package app;

public class Matriz {

	private int [] [] arreglo;
	private int [] vector;
	private int mayor;
	private int menor;
	
	
	public Matriz() {
		
	}
	
	
	public void genMatriz(int a, int x) {
		
		arreglo = new int [x] [x];
		
		if(a == 1) {//Diagonal principal con 1's
			
						
			for (int i = 0; i < arreglo.length; i++) {//Eje Y
				for (int j = 0; j < arreglo.length; j++) {//Eje X
					if (i == j) 
						arreglo [i] [j] = 1;
				}
			}
		}
		
		if(a == 2) {//Diagonal triangular superior con 0�s.
			
			for (int i = 0; i < arreglo.length; i++) {//Eje Y
				for (int j = 0; j < arreglo.length; j++) {//X
					
					arreglo [i] [j] = 1;
					
					if (i <= j)
						arreglo [i] [j] = 0;
				}
			}
		}
		
		if(a == 3) {//Gen�ro arreglo con n�meros aleatorios y gen�ro vector a partir de numeros pares de cada fila.
			
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
		}
		
		if(a == 4) {
			
			mayor =0;
			menor =1;
			
			for (int i = 0; i < arreglo.length; i++) {
				for (int j = 0; j < arreglo.length; j++) {
					arreglo [i] [j] = (int) (Math.random()*9+1);//Nu�meros aleatorios 1-10
					
					if(arreglo [i] [j] > mayor ) 
						mayor = arreglo [i] [j];
					if(arreglo [i] [j] < menor)
						menor = arreglo [i] [j];	
				}
			}
		}
		
	}
	
	
	
	public void imprimirMatriz(Matriz m) {
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
		System.out.println("El n�mero mayor es : " + mayor
										   +"\nEl n�mero menor es : " + menor);
	}
	
}
