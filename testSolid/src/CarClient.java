public class CarClient {


    public static void main(String args[]) {
        CarServer server = new CarServer();
        server.setBrand(new ICar() {
            @Override
            public void drive() {
                System.out.println("Drive this car");
            }

            @Override
            public void repair() {
                System.out.println("Repair this car");
            }
        });
        server.getCar().repair();

        server.setBrandNew(new ICarNew() {
            @Override
            public void drive() {
                System.out.println("Drive this car new");
            }

            @Override
            public void repair() {
                System.out.println("Repair this car new");
            }
        });
        server.getCarNew().repair();
    }
}
