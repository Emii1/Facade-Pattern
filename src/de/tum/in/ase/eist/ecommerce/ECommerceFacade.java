package de.tum.in.ase.eist.ecommerce;

public  class ECommerceFacade extends AdvertisementController {
    private AdvertisementController advertisementController;
    private OrderController orderController;
    private ShippingController shippingController;

    public OrderController getOrderController() {
        return orderController;
    }

    public void setOrderController(OrderController orderController) {
        this.orderController = orderController;
    }

    public AdvertisementController getAdvertisementController() {
        return advertisementController;
    }

    public void setAdvertisementController(AdvertisementController advertisementController) {
        this.advertisementController = advertisementController;
    }

    public ShippingController getShippingController() {
        return shippingController;
    }

    public void setShippingController(ShippingController shippingController) {
        this.shippingController = shippingController;
    }

    public ECommerceFacade(AdvertisementController advertisementController, OrderController orderController,
                           ShippingController shippingController) {
        this.advertisementController = advertisementController;
        this.orderController = orderController;
        this.shippingController = shippingController;
    }

    public ECommerceFacade() {
          this.advertisementController = new AdvertisementController();
          this.shippingController = new ShippingController();
          this.orderController = new OrderController();
    }



    public void processOrder(Order order, String number) {
        orderController.processOrder(order, number);

    }

    public void processOrder(Order order) {
        orderController.processOrder(order);
    }


    public Order retrieveLatestOrder(int id) {
       return orderController.retrieveLatestOrder(id);
    }


    public void playAdvertisement(int ageRestriction) {
        advertisementController.playAdvertisement(ageRestriction);
    }

    public void shipOrder(Order order, String address) {
        order.setShipping(shippingController.createShipping(address));
        shippingController.shipOrder(order);
    }

}
