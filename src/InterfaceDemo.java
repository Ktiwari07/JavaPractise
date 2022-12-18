public class InterfaceDemo  {
    public static void main(String[] args) {

        Engine engine;

        engine=new ElectricCar();
        engine.start();
        engine.stop();
        engine.musicStart();
        engine.musicStop();
        engine=engine.changeEngine(new PetrolCar());

        engine.stop();
        engine.musicStart();
        engine.musicStop();
    }
}
