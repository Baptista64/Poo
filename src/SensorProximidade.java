public class SensorProximidade {
    
    private boolean activo;
    private double foneLocation;
    
    public double getFoneLocation() {
        return foneLocation;
    }
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public void setFoneLocation(double foneLocation) {
        this.foneLocation = foneLocation;
    }

}
