package Model;

public class Urban extends Vehicle{
    private Integer cantMaxPassanger;
    private Integer aribag;

    public Urban (){

    }

    public Urban(Integer cantMaxPassanger, Integer aribag) {
        this.cantMaxPassanger = cantMaxPassanger;
        this.aribag = aribag;
    }

    public Urban(String name, Double price, VehicleType type, Integer id, Integer cantMaxPassanger, Integer aribag) {
        super(name, price, type, id);
        this.cantMaxPassanger = cantMaxPassanger;
        this.aribag = aribag;
    }

    public Integer getCantMaxPassanger() {
        return cantMaxPassanger;
    }

    public void setCantMaxPassanger(Integer cantMaxPassanger) {
        this.cantMaxPassanger = cantMaxPassanger;
    }

    public Integer getAribag() {
        return aribag;
    }

    public void setAribag(Integer aribag) {
        this.aribag = aribag;
    }

    @Override
    public String toString() {
        return "Urban{" +
                "cantMaxPassanger=" + cantMaxPassanger +
                ", aribag=" + aribag +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", id=" + id +
                '}';
    }
    public void actualicePrice (Vehicle vehicle){
        vehicle.setPrice((vehicle.getPrice()*1.15));
    }
}
