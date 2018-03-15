package listasEncadeadas;

public class ListaItem {
	
	int quantidadeElementos;
	Item primeiro, ultimo;
	
	public ListaItem() {
		this.quantidadeElementos = 0; // O QUATIDADEELEMENTOS RECEBE 0 E O PRIMEIRO E O ULTIMO SE INICIA COM O VALOR NULO, PARA PODER INICIAR A LISTA VAZIA
		this.primeiro = null;
		this.ultimo = null; 
	}
	
	public void inserirNoComeco(int valor) {
		if (this.quantidadeElementos == 0) {
			Item novo = new Item();
			novo.setValor(valor);
			novo.setProximo(primeiro);
			this.primeiro = novo;
			this.quantidadeElementos += 1;
		} else {
			Item novo2 = new Item();
			novo2.setValor(valor);
			novo2.setProximo(primeiro);
			this.primeiro = novo2;
			this.quantidadeElementos += 1;
		}
	}
	
	public void inserirNoFinal(int valor) {
		Item novo = new Item();
		novo.setValor(valor);
		if (this.quantidadeElementos == 0) {
			novo.setProximo(ultimo);
			this.primeiro = novo;
			this.ultimo = novo;
		} else {
			ultimo.setProximo(novo);
			ultimo = novo;
		}
		this.quantidadeElementos++;
	}
	
	public void status() {
		System.out.println("Quatidade Atual De Elementos: " + this.quantidadeElementos);
		if(this.quantidadeElementos == 0) {
			System.out.println("Elementos: [ ]");
			System.out.println("");
		} else {
			System.out.print("Elementos: [");
			Item aux = this.primeiro;
			for (int i = 0; i < this.quantidadeElementos; i++) {
				System.out.print(" " + aux.getValor() + " ");
				aux = aux.getProximo();
			}
			System.out.println("]");
			System.out.println("");
		}
	}

}