public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.check();
        System.out.println("Обслуживание " + transport.getModelName() + " закончено \n");
    }
}