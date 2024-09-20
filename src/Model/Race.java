package Model;

public class Race extends Vehicle implements RaceInterface{
    private Double maxVelocity;

    public Race(){

    }

    public Race(Double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public Race(String name, Double price, VehicleType type, Integer id, Double maxVelocity) {
        super(name, price, type, id);
        this.maxVelocity = maxVelocity;
    }

    public Double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(Double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    @Override
    public void competeInPista() {
        System.out.println("Soy un auto re veloz y corro en pista...");
    }

    @Override
    public String toString() {
        return "Race{" +
                "maxVelocity=" + maxVelocity +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", id=" + id +
                '}';
    }

    public void actualicePrice (Vehicle vehicle){
        vehicle.setPrice((vehicle.getPrice()*1.2));
    }
}
