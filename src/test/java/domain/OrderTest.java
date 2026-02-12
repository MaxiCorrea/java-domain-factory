package domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void shouldNotAllowOrderWithoutItems() {
		CustomerId customerId = new CustomerId("id-customer");
		assertThrows(IllegalStateException.class, () -> {
			new Order(OrderId.newId(), customerId, List.of(), OrderStatus.PENDING_PAYMENT, OrderType.ONLINE);	
		});
	}

}
