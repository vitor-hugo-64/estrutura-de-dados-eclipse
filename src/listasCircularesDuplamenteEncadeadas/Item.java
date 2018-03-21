package listasCircularesDuplamenteEncadeadas;

public class Item {
	
	private int valor;
	private Item anterior;
	private Item proximo;
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Item getAnterior() {
		return anterior;
	}
	public void setAnterior(Item anterior) {
		this.anterior = anterior;
	}
	public Item getProximo() {
		return proximo;
	}
	public void setProximo(Item proximo) {
		this.proximo = proximo;
	}
	
	

}
