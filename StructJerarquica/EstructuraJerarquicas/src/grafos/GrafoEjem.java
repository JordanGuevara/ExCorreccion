package grafos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrafoEjem {
    public static void main(String[] args) {
        // We use the HashMap library to create a graph
        Map<String, List<String>> grafo = new HashMap<String, List<String>>();

        // Add vertices Static
        addVertice(grafo, "A");
        addVertice(grafo, "B");
        addVertice(grafo, "C");
        addVertice(grafo, "D");

        // Add edges Static
        addArista(grafo, "A", "B");
        addArista(grafo, "B", "C");
        addArista(grafo, "C", "D");
        addArista(grafo, "D", "A");

        // Print the vertices and edges of the graph
        System.out.println("VŽrtices: " + grafo.keySet());
        System.out.println("Aristas: " + darArista(grafo));
    }

    // Method to add a vertex to the graph
    public static void addVertice(Map<String, List<String>> grafo, String vertice) {
        if (!grafo.containsKey(vertice)) {
            grafo.put(vertice, new ArrayList<String>());
        }
    }

    // Method to add an edge to the graph
    public static void addArista(Map<String, List<String>> grafo, String origen, String destino) {
        if (grafo.containsKey(origen) && grafo.containsKey(destino)) {
            List<String> aristas = grafo.get(origen);
            aristas.add(destino);
        }
    }

    // Method to obtain all the edges of the graph
    public static List<String> darArista(Map<String, List<String>> grafo) {
        List<String> aristas = new ArrayList<String>();

        for (String vertice : grafo.keySet()) {
            List<String> destinos = grafo.get(vertice);
            for (String destino : destinos) {
                String arista = vertice + " -> " + destino;
                aristas.add(arista);
            }
        }

        return aristas;
    }
}
