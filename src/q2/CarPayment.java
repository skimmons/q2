package q2;
import java.lang.Math;
public class CarPayment {
	private double cost;
	private double down;
	private int length;
	private double interest;
	
	public CarPayment(double cost, double down, int length, double interest) {
		super();
		this.cost = cost;
		this.down = down;
		this.length = length;
		this.interest = interest;
	}
	
	public double monthly() {
		double monIntr = this.interest/12;
		return (this.cost-this.down)*(monIntr*Math.pow(1+monIntr, this.length))/(Math.pow(1+monIntr, this.length)-1);
	}
	
	public double totalInterest() {
		return (((double)this.monthly()*(double)this.length)-(double)(this.cost-this.down));
	}

}
