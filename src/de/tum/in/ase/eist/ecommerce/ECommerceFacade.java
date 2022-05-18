package de.tum.in.ase.eist.ecommerce;

public  class ECommerceFacade extends AdvertisementController {
    private Order processOrder;
    private Order retrieveLastOrder;
    private int playAdvertisment;

    public Order getProcessOrder() {
        return processOrder;
    }

    public void setProcessOrder(Order processOrder) {
        this.processOrder = processOrder;
    }

    public Order getRetrieveLastOrder() {
        return retrieveLastOrder;
    }

    public void setRetrieveLastOrder(Order retrieveLastOrder) {
        this.retrieveLastOrder = retrieveLastOrder;
    }

    public int getPlayAdvertisment() {
        return playAdvertisment;
    }

    public void setPlayAdvertisment(int playAdvertisment) {
        this.playAdvertisment = playAdvertisment;
    }



    public ECommerceFacade(){

    }
    public void processOrder(Order order, String string){}
    public Order retrieveLatestOrder(Order order){
        Order order1 = order;
        return order;
    }

    @Override
    public void playAdvertisement(int ageRestriction) {
        super.playAdvertisement(ageRestriction);
    }

    public void shipOrder(Order order, String string){}

}
