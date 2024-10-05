interface Nadador {
    void nadar();
}

interface Corredor{
    void correr();
}

class Atleta implements Nadador, Corredor {
    public void nadar(){
        System.out.println("El atleta esta nadando");
    }

    public void correr(){
        System.out.println("El atleta esta corriendo");
    }
}

public class MainDos{
    public static void main(String[] args){
        Atleta atleta = new Atleta();
        atleta.nadar();
        atleta.correr();
    }
}
