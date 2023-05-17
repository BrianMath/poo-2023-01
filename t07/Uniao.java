import java.util.ArrayList;
import java.util.Objects;

public class Uniao {
	private ArrayList<Pessoa> filhos;
	private Pessoa[] parceiros;

	private void novoFilho(Pessoa filho) {
		filhos.add(filho);
	}

	public Uniao(Pessoa a, Pessoa b) {
		Objects.requireNonNull(a);
		Objects.requireNonNull(b);
		parceiros = new Pessoa[] { a, b };
	}
}
