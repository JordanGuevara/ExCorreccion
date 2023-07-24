package arbol.binario;
import arbol.binario.Nodo;
public class ArbolBinario {
	public Nodo raiz;
	public ArbolBinario(){
		raiz=null;
	}
	
	public void insertar(Object valor){
		raiz=insertaRa(raiz,valor);
	}
	
	private Nodo insertaRa(Nodo nodo, Object valor) {
		if (nodo == null) {
			nodo = new Nodo(valor);
		} else {
			if (nodo.subarbolIzdo() == null) {
				nodo.ramaIzdo(new Nodo(valor));
			} else {
				nodo.ramaDcho(insertaRa(nodo.subarbolDcho(), valor));
			}
		}
		return nodo;
	}
	public static void preorden(Nodo r){
		if(r!=null){
			r.visitar();
			preorden(r.subarbolIzdo());
			preorden(r.subarbolDcho());
		}
	}
	public static void inorden(Nodo r){
		if(r!=null){
			inorden(r.subarbolIzdo());
			r.visitar();
			inorden(r.subarbolDcho());
		}
	}
	public static void posorden(Nodo r){
		if(r!=null){
			posorden(r.subarbolIzdo());
			posorden(r.subarbolDcho());
			r.visitar();
		}
	}
	public int calculo(Nodo nodo) {
		if (nodo == null) {
			return 0;
		} else {
			return calculo( (Nodo) nodo.valorNodo())+ calculo(nodo.subarbolIzdo()) + calculo(nodo.subarbolDcho());
		}
	}
	public int contar(Nodo nodo){
		if(nodo==null){
			return 0;
		}
		return 1+contar(nodo.izdo)+contar(nodo.dcho);
	}
	public boolean esVacio(){
		return raiz==null;
	}

}
