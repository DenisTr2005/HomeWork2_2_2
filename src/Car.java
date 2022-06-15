public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку автомобиля");
        }
        System.out.println("Проверяем двигатель машины");
    }

}