import java.util.ArrayList;

public class ScenaGrafica {

	private int nrFiguri = 0;
	static ArrayList<Figura> scenaGrafica = new ArrayList<Figura>(10);

	public static void main(String[] args) {
		Cerc c1 = new Cerc("Verde", 2.5);
		Patrat p1 = new Patrat("Albastru", 3.7);
		Triunghi t1 = new Triunghi("Gri", 2.5, 5.2, 6.3);

//		System.out.println(c1.toString());
//		System.out.println(p1.toString());
//		System.out.println(t1.toString());

		scenaGrafica.add(t1);
		scenaGrafica.add(c1);
		scenaGrafica.add(p1);
		System.out.println(scenaGrafica.toString());
		scenaGrafica.remove(t1);
		System.out.println(scenaGrafica.toString());

	}
}