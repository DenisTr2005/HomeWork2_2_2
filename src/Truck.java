public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку грузовика");
        }
        System.out.println("Проверяем двигатель грузовика");
        System.out.println("Проверяем прицеп грузовика");
    }

}