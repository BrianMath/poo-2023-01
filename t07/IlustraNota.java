import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IlustraNota {
	public static void main(String[] args) {
		Prova fisica = new Prova();
        Nota n1 = new Nota(fisica, 3.2);
        Nota n2 = new Nota(fisica, 10);
        Nota n3 = new Nota(fisica, 8.9);

        List<Nota> lista = new ArrayList<>();
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);
	}
}
