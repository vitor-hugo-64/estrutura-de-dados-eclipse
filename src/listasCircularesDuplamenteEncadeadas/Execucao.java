package listasCircularesDuplamenteEncadeadas;

public class Execucao {
	
	public static void main(String[] args) {
		ListaItem l = new ListaItem();
		l.inserir(1);
		
		l.inserir(2);
		l.inserir(3);
		l.mostrarValores();
		
		System.out.println(l.inicio.getProximo().getValor());
	}

}
