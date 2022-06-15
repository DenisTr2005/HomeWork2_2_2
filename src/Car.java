public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем автомобильную покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }
}