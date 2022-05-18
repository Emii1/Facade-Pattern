package de.tum.in.ase.eist.store;

import de.tum.in.ase.eist.ecommerce.ECommerceFacade;
import de.tum.in.ase.eist.ecommerce.Order;
import de.tum.in.ase.eist.ecommerce.OrderController;
import de.tum.in.ase.eist.ecommerce.ShippingController;

// TODO 4 remove all associations to the different controllers in all classes of the package store and use the facade
// instead.
public class BookStore {

	private static int count = 1;
	private final String address;
	private final String name;
	private final int id;
	private ECommerceFacade eCommerceFacade;
	//private final OrderController orderController;
	//private final ShippingController shippingController;

	public BookStore(String address, String name) {
		this.address = address;
		this.name = name;
		this.id = generateBookStoreId();
		this.eCommerceFacade = eCommerceFacade;
		//this.orderController = new OrderController();
		//this.shippingController = new ShippingController();
	}

	public void acceptOrder(String shippingAddress, String phoneNumber) {
		System.out.println("Accepting shipping order.");
		Order order = eCommerceFacade.getOrderController().retrieveLatestOrder(id);
		eCommerceFacade.getOrderController().processOrder(order,phoneNumber);
		order.setShipping(eCommerceFacade.getShippingController().createShipping(shippingAddress));
		eCommerceFacade.getShippingController().shipOrder(order);
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Book store " + name + ", located at " + address;
	}

	private int generateBookStoreId() {
		count += 2;
		return count;
	}

}
