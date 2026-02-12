package domain;

import java.util.UUID;

public class OrderId {

	public static OrderId newId() {
		return new OrderId(UUID.randomUUID());
	}
	
	private UUID id;
	
	public OrderId(
			final UUID id) {
		this.id = id;
	}
	
	public UUID getId() {
		return id;
	}
	
}
