package ejecucion;
import java.util.Scanner;
import arbol.binario.*;
public class Main {
	public static void Main(String[] args){
		ArbolBinario ar= new ArbolBinario();
		Scanner tc= new Scanner(System.in);
		int opc=0;
		do{
			System.out.println("Insertar Nodo");
			System.out.println("Preorden");
			System.out.println("Inorden");
			System.out.println("Posorden");
			System.out.println("Nodos totales");
			System.out.println("Suma total");
			System.out.println("Salir");
			System.out.println("Seleccione: ");
			opc=tc.nextInt();
			switch(opc){
				case 1:
					System.out.println("Ingrese cantidad de nodos: ");
					int numNodo=tc.nextInt();
					for(int i=0;i<=numNodo;i++){
						int valor=tc.nextInt();
						ar.insertar(valor);
					}
					System.out.println("El arbol esta vacio?: "+ar.esVacio());
					break;
				case 2:
					ar.preorden(ar.raiz);
					break;
				case 3:
					ar.inorden(ar.raiz);
					break;
				case 4:
					ar.posorden(ar.raiz);
					break;
				case 5:
					int cant=ar.contar(ar.raiz);
					System.out.println("Cantidad de nodos: "+cant);
					break;
				case 6:
					int sumT=ar.calculo(ar.raiz);
					System.out.println("Suma de nodos: "+sumT);
					break;
				case 7:
					System.out.println("Gracias");
					break;
				default:
					System.out.println("Error: opcion no existe");
					break;
			}
		}while(opc!=7);
	}
}
