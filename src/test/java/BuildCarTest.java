import Factory.CarroFactory;

public class BuildCarTest {
    public static void main(String[] args) throws Exception {
        CarroFactory factory = new CarroFactory();
        double motor = 1.4;
        long tamanhoPortaMala = 400;
        factory.buildCar(motor, tamanhoPortaMala);
    }
}
