
public class Patrat extends Figura {

	private double l;

	public Patrat(String culoare, double l) {
		super(culoare);
		this.l = l;
	}

	public double perimetru() {
		return l * 4;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

}
