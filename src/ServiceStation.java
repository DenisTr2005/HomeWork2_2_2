public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("\nОбслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
            transport.checkEngine();
            transport.checkTrailer();
    }
}