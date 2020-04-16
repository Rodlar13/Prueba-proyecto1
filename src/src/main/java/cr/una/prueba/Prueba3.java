package cr.una.prueba;

public class Prueba3 {

    public String ape2;

    public Prueba3(String ape2) {
        this.ape2 = ape2;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    @Override
    public String toString() {
        return "Prueba3{" +
                "ape2='" + ape2 + '\'' +
                '}';
    }
}
