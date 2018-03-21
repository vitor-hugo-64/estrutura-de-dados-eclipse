package listasCircularesDuplamenteEncadeadas;

public class ListaItem {
	
	public Item inicio;
	
	public ListaItem(){
		this.inicio = null;
	}
	
	public Boolean vazio() {
		return (this.inicio == null);
	}
	
	public void inserir(int valor) {
		
		Item lista = new Item();
		lista.setValor(valor);
		
		if(this.vazio()) {
			
			lista.setAnterior(lista);
			lista.setProximo(lista);
			this.inicio = lista;
			
		} else {
			
			Item lista2 = this.inicio;
			while (lista2.getProximo() != this.inicio) {
				lista2 = lista2.getProximo();				
			}
			lista2.setProximo(lista);
			lista.setAnterior(lista2);
			lista.setProximo(inicio);
		}
	}
	
	public void mostrarValores() {
		
		Item lista3;
		lista3 = this.inicio;
		
		do {
			System.out.println("Valor: " + lista3.getValor());
			lista3 = lista3.getProximo();
		} while (lista3 != this.inicio);

	}
}
