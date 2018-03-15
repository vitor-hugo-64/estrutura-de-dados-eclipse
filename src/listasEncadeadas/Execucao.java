package listasEncadeadas;

public class Execucao {
	
	public static void main(String[] args) {
		ListaItem a = new ListaItem();
		a.status();
		a.inserirNoFinal(1);
		a.inserirNoFinal(2);
		a.inserirNoFinal(3);
		a.status();
	}

}
