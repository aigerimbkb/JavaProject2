package bak_lab1_var2;

public class Drone4 extends Drone3 {

   
    public Drone4() {
    }
    
    public Drone4(String type) {
        super(type);
    }

    public Drone4(int speed) {
        super(speed);
    }

    public Drone4(String type, boolean camera, int speed) {
        super(type, camera, speed);
    }

    public Drone4(String type, String version, int speed) {
        super(type, version, speed);
    }
    public Drone4(String type, boolean camera, String version, int speed) {
        super(type, camera, version, speed);
    }

    @Override
    public void slowDown(String function) {
        System.out.println("Убавить скорость");
    }
    
  
    
    
    
}
