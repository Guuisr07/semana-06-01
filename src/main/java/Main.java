import exercicios.Quadrado;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(10.0);
        Quadrado q2 = new Quadrado(15.5);

        q1.setLado(10.5);


        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());

        System.out.println(q2.calcularArea());
        System.out.println(q2.calcularPerimetro());
    }
}
