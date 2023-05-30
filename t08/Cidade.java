public class Cidade {
	private Pais[] pais;

	public Capital(Pais country) {
		if (country) {
			pais[0] = country;
		}
	}
}
