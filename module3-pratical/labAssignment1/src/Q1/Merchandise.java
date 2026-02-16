package Q1;

public class Merchandise {
	private int itemCode;
	private int quantity;
	private double unitPrice;
	
	public Merchandise(int itemCode, int quantity, double unitPrice) {
		this.itemCode=itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	public int getItemCode() {
        return itemCode;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
