package arboles;
import arboles.Nodo.*;
public class Arboles {
	public static void main(String[] args) {
        // Create the programming tree
        Nodo raiz = new Nodo("Programa");
        Nodo nodo1 = new Nodo("Funci—n 1");
        Nodo nodo2 = new Nodo("Funci—n 2");
        Nodo nodo3 = new Nodo("Funci—n 3");

        raiz.izquierdo = nodo1;
        raiz.derecho = nodo2;
        nodo2.izquierdo = nodo3;

        // Walk through and display the programming tree
        recorrerArbol(raiz, 0);
    }

    // Recursive method to traverse the programming tree
    public static void recorrerArbol(Nodo nodo, int nivel) {
        if (nodo != null) {
            // Print indentation based on node level
            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }
            // Print node value
            System.out.println(nodo.valor);
            // Loop through child nodes
            recorrerArbol(nodo.izquierdo, nivel + 1);
            recorrerArbol(nodo.derecho, nivel + 1);
        }
    }
}
