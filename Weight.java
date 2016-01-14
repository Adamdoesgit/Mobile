//Alexander Bulanov, Adam Barszczak

public class Weight implements Structure {
	public double weight;

	public Weight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
	
	public boolean isBalanced() {
		return true;
	}
}
