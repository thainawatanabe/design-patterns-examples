import Factory.CarroFactory;

public class BuildCarTest {
    public static void main(String[] args) throws Exception {
        CarroFactory factory = new CarroFactory();
        double motor = 3.0;
        long tamanhoPortaMala = 400;
        factory.buildCar(motor, tamanhoPortaMala).toString();
    }
}
