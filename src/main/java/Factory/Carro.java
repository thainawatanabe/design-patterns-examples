package Factory;

public abstract class Carro {
    public String nome;
    public Double motor;
    public long tamanhoPortaMala;

    public void setName(String name) {
        this.nome = name;
    }
    public void setMotor(Double motor) {
        this.motor = motor;
    }
    public void setTamanhoPortaMala(long tamanhoPortaMala) {
        this.tamanhoPortaMala = tamanhoPortaMala;
    }
}

class CarroHatch extends Carro {
    public CarroHatch(Double motor, long tamanhoPortaMala) {
        setName("Hatch");
        setMotor(motor);
        setTamanhoPortaMala(tamanhoPortaMala);
    }
}

class CarroSedan extends Carro {
    public CarroSedan(Double motor, long tamanhoPortaMala) {
        setName("Sedan");
        setMotor(motor);
        setTamanhoPortaMala(tamanhoPortaMala);
    }
}

class CarroSUV extends Carro {
    public CarroSUV(Double motor, long tamanhoPortaMala) {
        setName("SUV");
        setMotor(motor);
        setTamanhoPortaMala(tamanhoPortaMala);
    }
}

class CarroWagon extends Carro {
    public CarroWagon(Double motor, long tamanhoPortaMala) {
        setName("Wagon");
        setMotor(motor);
        setTamanhoPortaMala(tamanhoPortaMala);
    }
}