import java.util.TreeSet;

class Convidado {

}

public class Festa {
	private TreeSet convidados = new TreeSet();

	public void novoConvidado(Convidado c) {
		convidados.add(c);
	}

	public Festa(Convidado c) {
		convidados.add(c);
	}
}
