package poo;

public class Numero {

    private double x;

    private double getX() {
        return x;
    }

    private void setX(double result) {
        this.x = result;
    }

    public double soma(double x, double y) {
        setX(x + y);
        return getX();
    }

    public double subtracao(double x, double y) {
        setX(x - y);
        return getX();
    }

    public double mutplicacao(double x, double y) {
        setX(x * y);
        return getX();
    }

    public double divisao(double x, double y) {
        setX(x / y);
        return getX();
    }
}