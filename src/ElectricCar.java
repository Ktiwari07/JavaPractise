public class ElectricCar implements Engine{
    Engine engine;
    @Override
    public void start() {
        System.out.println("Electric car started");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stopped");
    }

    @Override
    public Engine changeEngine(Engine engine) {
        this.engine=engine;
        return engine;

    }

    @Override
    public void musicStart() {
        System.out.println("Electric car's music started");
    }

    @Override
    public void musicStop() {
    System.out.println("Electric car's music stopped");
    }
}
