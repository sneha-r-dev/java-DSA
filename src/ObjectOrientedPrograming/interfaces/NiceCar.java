package ObjectOrientedPrograming.interfaces;

public class NiceCar {
    private Engine engine;
    private Media musicPlayer;

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void engine(){
        engine.start();
    }
    public void stop(){
        engine.start();
    }
    public void acc(){
        engine.start();
    }

    public void musicStart(){
        musicPlayer.start();
    }
    public void musicStop(){
        musicPlayer.stop();
    }
    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
