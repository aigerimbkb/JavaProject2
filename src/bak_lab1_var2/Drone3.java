package bak_lab1_var2;

public abstract class Drone3 implements IDrone {

    private String type;
    private boolean camera;
    private String version;
    private int speed;
    
    public Drone3(String type) {
        this.type = type;
    }
    
    public Drone3() {
        type = "simple";
        camera = false;
        version = "RTF";
        speed = 36;
    }

    public Drone3(int speed) {
        this.speed = speed;
    }

    public Drone3(String type, boolean camera, int speed) {
        this.type = type;
        this.camera = camera;
        this.speed = speed;
    }
    
    public Drone3(String type, String version, int speed) {
        this.type = type;
        this.version = version;
        this.speed = speed;
    }

    public Drone3(boolean camera, String version, int speed) {
        this.camera = camera;
        this.version = version;
        this.speed = speed;
    }
    
    public Drone3(String type, boolean camera, String version, int speed) {
        this.type = type;
        this.camera = camera;
        this.version = version;
        this.speed = speed;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    @Override
    public void speedUp(String function) {
        System.out.println("Добавить скорость");
    }
    
    @Override
    public void goDown(String function) {
        System.out.println("Лететь вниз");
    }

    @Override
    public void goUp(String function){
        System.out.println("Лететь вверх");
    }
    
    @Override
    public String toString() {
        return type  + " {"  + "camera=" + camera + ", version=" + version + ", speed=" + speed + " км/ч" +'}' ;
    }
   
}
