package cr.una.prueba;

public class Prueba4 {
    public int ced;

    public Prueba4(int ced) {
        this.ced = ced;
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    @Override
    public String toString() {
        return "Prueba4{" +
                "ced=" + ced +
                '}';
    }
}
