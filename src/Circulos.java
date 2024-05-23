public class Circulos extends FigurasGeometricas{
    Double radio;
    public Circulos(Double radio){
        this.radio = radio;
    }
    public Circulos(){}

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    public double calcularArea(){
        double area = Math.PI * radio * radio;
        return area;
    }

}
