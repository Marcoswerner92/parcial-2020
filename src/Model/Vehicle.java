package Model;

public abstract class Vehicle {
    protected String name;
    protected Double price;
    protected VehicleType type;
    protected Integer id;

    public Vehicle(){

    }

    public Vehicle(String name, Double price, VehicleType type, Integer id) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", id=" + id +
                '}';
    }
}


