package de.tum.in.ase.eist.ecommerce;

public abstract class ECommerceFacade {
    public abstract void processOrder(Order order);
    public abstract void processOrder(Order order, String phoneNumber);
    public abstract Order retreiveLatestOrder(int id);
    public abstract void playAdvertisement(int ageRestriction);
    public abstract void shipOrder(Order order, String address);

    public ECommerceFacade(Order order,String phoneNumber,String address,int id, int ageRestriction){

    }



}
