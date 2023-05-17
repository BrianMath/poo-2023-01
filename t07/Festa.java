import java.util.TreeSet;

public class Festa {
	private TreeSet<Convidado> convidados = new TreeSet<>();

	public void novoConvidado(Convidado convidado) {
		convidados.add(convidado);
	}

	public Festa(Convidado convidado) {
		convidados.add(convidado);
	}
}
