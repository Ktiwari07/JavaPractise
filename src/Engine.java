public interface Engine {
    Engine engine=null;

    public void start();
    public void stop();
    public final static int ENGINECOST=100_000;
    public Engine changeEngine(Engine engine);

    void musicStart();

    void musicStop();
}
