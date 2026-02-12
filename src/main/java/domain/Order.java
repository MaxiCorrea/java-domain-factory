package domain;

import java.util.List;

public class Order {

	private final OrderId id;
	private final CustomerId customerId;
	private final List<OrderItem> items;
	private OrderStatus orderStatus;
	private final OrderType orderType;
	
	Order(
			final OrderId id,
			final CustomerId customerId,
			final List<OrderItemData> itemsData,
			final OrderStatus orderStatus,
			final OrderType orderType) {
		
		if(itemsData == null || itemsData.isEmpty())
			throw new IllegalStateException("Order must have at least one item");
		
		this.id = id;
		this.customerId = customerId;
		this.items = itemsData.stream()
				.map(data -> OrderItem.create(data.getSku(), data.getQuantity()))
				.toList();
		this.orderStatus = orderStatus;
		this.orderType = orderType;
		
	}
	
	public OrderId getId() {
		return id;
	}
	
	public CustomerId getCustomerId() {
		return customerId;
	}
	
	public List<OrderItem> getItems() {
		return List.copyOf(items);
	}
	
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	
	public OrderType getOrderType() {
		return orderType;
	}
}
