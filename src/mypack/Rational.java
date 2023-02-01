package mypack;

public class Rational implements Number {

	private int p,q;
	
	public Rational(int p, int q) {
		super();
		this.p = p;
		this.q = q;
	}

	@Override
	public void display() {
		System.out.println(p+"/"+q);

	}

	@Override
	public Number add(Number n) {
		Rational r = (Rational)n;
		int p = this.p * r.q +this.q * r.p;
		int q = this.q * r.q;
		return new Rational(p, q);
	}

}








