package bak_lab1_var2;

public class Drone2 {

    

    
    private String type;
    private boolean camera;
    private String version;

    public Drone2() {
        type = "simple";
        camera = false;
        version = "RTF";
    }
    
    public Drone2(String version) {
        this.version = version;
    }
    
    public Drone2(String type, String version) {
        this.type = type;
        this.version = version;
    }

    public Drone2(boolean camera, String version) {
        this.camera = camera;
        this.version = version;
    }
    
    public Drone2(String type, boolean camera, String version) {
        this.type = type;
        this.camera = camera;
        this.version = version;
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
    
    @Override
    public String toString() {
        return "Drone2{" + "type=" + type + ", camera=" + camera + ", version=" + version + '}';
    }

    
}
