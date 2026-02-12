package domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class OrderFactoryTest {

	@Test
	void shouldCreateOnlineOrderWithPendingPaymentStatus() {
		CustomerId customerId = new CustomerId("customer-0");
		Order order = new OrderFactory().createOnlineOrder(customerId, List.of( new OrderItemData("sku-1", 10)));
		assertNotNull(order);
		assertNotNull(order.getId());
		assertEquals(OrderStatus.PENDING_PAYMENT, order.getOrderStatus());
		assertEquals(OrderType.ONLINE, order.getOrderType());
		assertEquals(1, order.getItems().size());
	}

}
