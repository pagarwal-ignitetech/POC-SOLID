public class CarServer {

    private ICar car;
    private ICarNew carNew;

    public void setBrand(ICar car) {
        this.car = car;
    }

    public void setBrandNew(IDrivable car) {
        carNew = (ICarNew) car;
        car.drive();
    }

    public ICar getCar() {
        return car;
    }

    public ICarNew getCarNew() {
        return carNew;
    }
}
