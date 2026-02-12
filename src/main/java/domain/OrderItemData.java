package domain;

public class OrderItemData {
	
	private final String sku;
	private final int quantity;
	
	public OrderItemData(
			final String sku,
			final int quantity) {
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
