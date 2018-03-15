package listasEncadeadas;

public class Item {
	
	private int valor;
	private Item proximo;
	
	public int getValor() {
		return this.valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public Item getProximo() {
		return this.proximo;
	}
	
	public void setProximo(Item proximo) {
		this.proximo = proximo;
	}

}