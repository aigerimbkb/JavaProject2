package bak_lab1_var2;

public class Drone1 {

    private String type;
    private boolean camera;
    
    public Drone1() {
        type = "simple";
        camera = false;
    }

    public Drone1(String type) {
        this.type = type;
    }
    
    public Drone1(boolean camera) {
        this.camera = camera;
    }

    public Drone1(String type, boolean camera) {
        this.type = type;
        this.camera = camera;
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

    @Override
    public String toString() {     
        return "Drone1{" + "type=" + type + ", camera=" + camera + '}';
    }

}
