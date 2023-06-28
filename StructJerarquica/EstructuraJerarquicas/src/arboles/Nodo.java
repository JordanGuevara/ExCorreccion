package arboles;

class Nodo {
    String valor;
    Nodo izquierdo;
    Nodo derecho;
    public Nodo(String valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Nodo getIzquierdo() {
		return izquierdo;
	}
	public void setIzquierdo(Nodo izquierdo) {
		this.izquierdo = izquierdo;
	}
	public Nodo getDerecho() {
		return derecho;
	}
	public void setDerecho(Nodo derecho) {
		this.derecho = derecho;
	}
    
}
