package cr.una.prueba;

public class Prueba2 {
    public String Ape;

    public Prueba2(String ape) {
        Ape = ape;
    }

    public String getApe() {
        return Ape;
    }

    public void setApe(String ape) {
        Ape = ape;
    }

    @Override
    public String toString() {
        return "Prueba2{" +
                "Ape='" + Ape + '\'' +
                '}';
    }
}
