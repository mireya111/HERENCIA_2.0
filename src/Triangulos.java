public class Triangulos extends FigurasGeometricas{
    double base;
    double altura;
    public Triangulos () {}
    public Triangulos(double base, double altura){}
    public double calcularArea(){
        return base*altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
