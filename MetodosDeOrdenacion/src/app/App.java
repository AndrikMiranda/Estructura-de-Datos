package app;

public class App {

	public static void main(String[] args) {
		
		Metodos arreglo = new Metodos();
		
		arreglo.generarArregloAleatorio(3);//Define el tamaño del arreglo y lo genera.
		arreglo.shell();//Ordena el arreglo
		arreglo.arregloOriginal("fila");
		arreglo.imprimirArregloOrdenado("fila");//Lo imprime en modo columna o en fila [renglon]
	    
		
	}
	
}
