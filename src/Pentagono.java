public class Pentagono extends FigurasGeometricas{
    double apotema;
    double longitudLado;
    public Pentagono(){}
    public Pentagono(double apotema, double longitudLado, int nLados) {
        super (nLados);
    }
    //Metodos
    //Perimetro
    public double perimetro () {
        double per = nLados * longitudLado;
        return per;
    }
    public double area () {
        double area = (apotema * perimetro())/2;
        return area;
    }
    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
}
