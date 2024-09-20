package Model;

public class Utilitary extends Vehicle{
    private Double kgMax;
    private Double height;

    public Utilitary(){

    }

    public Utilitary(Double kgMax, Double height) {
        this.kgMax = kgMax;
        this.height = height;
    }

    public Utilitary(String name, Double price, VehicleType type, Integer id, Double kgMax, Double height) {
        super(name, price, type, id);
        this.kgMax = kgMax;
        this.height = height;
    }

    public Double getKgMax() {
        return kgMax;
    }

    public void setKgMax(Double kgMax) {
        this.kgMax = kgMax;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Utilitary{" +
                "kgMax=" + kgMax +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", id=" + id +
                '}';
    }
    public void actualicePrice (Vehicle vehicle){
        vehicle.setPrice((vehicle.getPrice()*1.1));
    }
}
