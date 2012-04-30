package lab10;

import java.util.Scanner;

public class ApplicationServer {

	private String name;
	private double price = 50;
	private double shippingCost = .5;
	private int amountPurchasing;
	private double total;

	public ApplicationServer(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void changePrice(double price) {
		this.price = price;
	}

	public double getShippingCost() {
		return this.shippingCost;
	}

	public boolean canEarnDiscount() {
		if (amountPurchasing >= 4) {
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		ApplicationServer JBoss = new ApplicationServer("JBoss");
		System.out.println("How many do you want?");
		Scanner in = new Scanner(System.in);
		JBoss.amountPurchasing = in.nextInt();
		System.out.println(JBoss.getPrice());
		System.out.println(JBoss.getShippingCost());
		JBoss.canEarnDiscount();
		if (JBoss.canEarnDiscount()){
			JBoss.total = JBoss.amountPurchasing * JBoss.price + (JBoss.shippingCost * JBoss.price) *.5;
			System.out.println(JBoss.total);
		}else{
			JBoss.total = JBoss.amountPurchasing * JBoss.price + (JBoss.shippingCost * JBoss.price);
			System.out.println(JBoss.total);
		}
	}
}