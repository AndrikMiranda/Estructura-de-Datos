package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int c, x;
		
		Matriz m = new Matriz();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Elige el tipo de matriz a generar."
				+ "\n1 -- Matriz diagonal con 1's."
				+ "\n2 -- Matriz triangular superior con 0´s."
				+ "\n3 -- Matriz M*N. Vector B a partir de la suma de numeros pares de cada fila."
				+ "\n4 -- Numero mayor y menor de un arreglo de numeros aleatorios de orden n"
				+ "\nOpción -----> ");
		
		c = s.nextInt();
		
		switch (c) {
		
		//1 -- Matriz diagonal con 1's.
		case 1:
			System.out.print("Dimensiones."
						   + "\nTamaño -->");
			x=s.nextInt();
			
			System.out.print("\n*********************\n"
											       + " ****** Arreglo ******\n"
											       + "*********************\n");
			
			m.genMatriz(c, x);
			m.imprimirMatriz(m);
			
			break;
			
		case 2:
			System.out.print("Dimensiones."
					   + "\nTamaño -->");
			x=s.nextInt();
		
		
			System.out.print("\n*********************\n"
											       + " ****** Arreglo ******\n"
											       + "*********************\n");
		
			m.genMatriz(c, x);
			m.imprimirMatriz(m);
			
			break;
			
		case 3:
			System.out.print("Dimensiones."
					   + "\nTamaño -->");
			x=s.nextInt();
		
		
			System.out.print("\n*********************\n"
											       + " ****** Arreglo ******\n"
											       + "*********************\n");
		
			m.genMatriz(c, x);
			m.imprimirMatriz(m);
			
			System.out.print("\n*********************\n"
												   + "******* Vector *******\n"
												   + "*********************\n");
			
			m.imprimirVector();

			break;
			
		case 4:
			System.out.print("Dimensiones."
					   + "\nTamaño -->");
			x=s.nextInt();
		
		
			System.out.print("\n*********************\n"
											       + " ****** Arreglo ******\n"
											       + "*********************\n");
		
			m.genMatriz(c, x);
			m.imprimirMatriz(m);
			
			System.out.println("*********************");
			
			m.mayorMenor();
			break;

		default:
			System.exit(0);
			break;
		}
		
	}
	
}
