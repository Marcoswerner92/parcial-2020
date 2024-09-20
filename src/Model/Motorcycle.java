package Model;

public class Motorcycle extends Vehicle implements RaceInterface{
    private Double Cilin;

    public Motorcycle(Double Cilin) {
        this.Cilin = Cilin;
    }

    public Motorcycle(String name, Double price, VehicleType type, Integer id, Double Cilin) {
        super(name, price, type, id);
        this.Cilin = Cilin;
    }

    public Double getCilin() {
        return Cilin;
    }

    public void setCilin(Double Cilin) {
        this.Cilin = Cilin;
    }

    @Override
    public void competeInPista() {
        System.out.println("Soy una moto veloz y corro en pista y tiro corte...");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "Cilin=" + Cilin +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", id=" + id +
                '}';
    }

    public void actualicePrice (Vehicle vehicle){
        vehicle.setPrice((vehicle.getPrice()*1.05));
    }
}
