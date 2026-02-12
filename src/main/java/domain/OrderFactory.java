package domain;

import java.util.List;

public class OrderFactory {

	public Order createOnlineOrder(
			final CustomerId customerId,
			final List<OrderItemData> items) {
		return new Order(
				OrderId.newId(),
				customerId,
				items,
				OrderStatus.PENDING_PAYMENT,
				OrderType.ONLINE);
	}
	
	public Order createBackofficeOrder(
			final CustomerId customerId,
			final List<OrderItemData> items) {
		return new Order(
				OrderId.newId(),
				customerId,
				items,
				OrderStatus.PENDING_APPROVAL,
				OrderType.BACKOFFICE);
	}
	
}
