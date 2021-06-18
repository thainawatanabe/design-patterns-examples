package Factory;

public class CarroFactory {
    public Carro buildCar(Double motor, long tamanhoPortaMala) throws Exception {
        boolean isHatch = 1.0 >= motor && motor <= 1.6 && tamanhoPortaMala <= 500;
        boolean isSedan = 1.4 >= motor && motor <= 1.6 && 1000 >= tamanhoPortaMala && tamanhoPortaMala <= 1500;
        boolean isSUV = 1.6 >= motor && motor <= 2.0 && 500 >= tamanhoPortaMala && tamanhoPortaMala <= 1000;
        boolean isWagon = 2.0 >= motor && motor <= 2.5 && tamanhoPortaMala > 1500;

        if (isHatch) {
            return new CarroHatch(motor, tamanhoPortaMala);
        } else if (isSedan) {
            return new CarroSedan(motor, tamanhoPortaMala);
        } else if (isSUV) {
            return new CarroSUV(motor, tamanhoPortaMala);
        } else if (isWagon) {
            return new CarroWagon(motor, tamanhoPortaMala);
        } else {
            throw new UnableToFindCarException();
        }
    }
}
