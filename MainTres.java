class Empleado {
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario (){
        return salarioBase;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salarioBase);
    }
}

class EmpleadoPorHoras extends Empleado {
    int horasTrabajadas;
    double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora){
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public double calcularSalario(){
        return horasTrabajadas * tarifaPorHora;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por hora: $" + tarifaPorHora);
        System.out.println("Salario: $" + calcularSalario());
    }
}

public class MainTres {
    public static void main(String[] args) {
        Empleado empleadouno = new Empleado("Johan", 1000);
        empleadouno.mostrarInformacion();

        System.out.println();

        EmpleadoPorHoras empleadohora = new EmpleadoPorHoras("Andres", 8, 1000);
        empleadohora.mostrarInformacion();
    }
}
