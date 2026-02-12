package domain;

public class OrderItem {

	private final String sku;
	private final int quantity;
	
	public static OrderItem create(
			final String sku, 
			final int quantity) {
		return new OrderItem(sku, quantity);
	}

	OrderItem(
			final String sku,
			final int quantity) {
		if(quantity < 1)
			throw new IllegalStateException("Quantity must be positive");
		this.sku = sku;
		this.quantity = quantity;
	}
	
	public String getSku() {
		return sku;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
}
