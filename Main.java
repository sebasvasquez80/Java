
class vehiculo {

    Double VelocidadMaxima;

    public vehiculo(Double VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }

    public void mostrarInfo() {
        System.out.println("Velocidad máxima: " + VelocidadMaxima + "Km/h");
    }
}

class Coche extends vehiculo {

    String tipoDeCombustible;

    public Coche(Double VelocidadMaxima, String tipoDeCombustible) {
        super(VelocidadMaxima);
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de combustible: " + tipoDeCombustible);
    }
}

public class Main {

    public static void main(String[] args) {
        Coche cocheuno = new Coche(150.90, "Electrico");
        cocheuno.mostrarInfo();
    }
}