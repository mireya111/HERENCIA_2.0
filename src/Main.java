import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Nivel padre
        //Creacion de objetos de cada clase sin valores
        FigurasGeometricas miFguras = new FigurasGeometricas();
        Circulos mifiguras2 = new Circulos();
        Triangulos mifiguras3 = new Triangulos();
        Cuadrilateros mifiguras4 = new Cuadrilateros();
        //Creacion de objetos de cada clase con valores
        Circulos mifiguras5 = new Circulos(3.00);
        Triangulos mifuguras6 = new Triangulos(6.00, 8.00);
        Cuadrilateros mifiguras7 = new Cuadrilateros(5.00, 5.00);
        Cuadrilateros mifiguras8 = new Cuadrilateros(5.00, 10.00);
        //Metodos
        mifiguras2.setNombre("Pileta del CEC");
        System.out.println(mifiguras2.getNombre());
        System.out.println("La nueva Pileta del CEC tendrá un radio de");
        mifiguras2.setRadio(4.00);
        System.out.println(mifiguras2.getRadio());
        System.out.println("Y su area sera");
        //  Seteo
        mifiguras3.setAltura(3.7);
        mifiguras3.setBase(4.5);
        System.out.println("El area es: ");
        System.out.println(mifiguras3.calcularArea());

        mifiguras4.setAncho(9.8);
        mifiguras4.setLargo(7.8);
        System.out.println("El area es: ");
        System.out.println(mifiguras4.area());

        System.out.println("El area es: ");
        System.out.println(mifiguras5.calcularArea());

        System.out.println("El area es: ");
        System.out.println(mifuguras6.calcularArea());
        System.out.println("Hola");
        Hola hola1 = new Hola("Maria", 12,23.4);
        System.out.println(hola1.getNombre());
        System.out.println(hola1.getEdad());
        System.out.println(hola1.getPeso());
        System.out.println("Hola x2");
        //hOLA CAMBIO 1176357653
        //Cambio supervisado 1
        //Cambio supervisado 2

    }
}