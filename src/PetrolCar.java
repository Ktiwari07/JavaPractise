public class PetrolCar implements Engine,Music{
    Engine engine;

    @Override
    public void start() {
        System.out.println("Petrol car started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol car stopped");
    }

    @Override
    public Engine changeEngine(Engine engine) {
        this.engine=engine;
        return engine;
    }

    @Override
    public void musicStart() {
        System.out.println("Petrol car's music started");
    }

    @Override
    public void musicStop() {
        System.out.println("Petrol car's music stopped");
    }
}
