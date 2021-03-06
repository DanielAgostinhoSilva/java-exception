package br.com.javapilha;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaException e) {
//            String message = e.getMessage();
//            System.out.println("ArithmeticException: " + message);
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo 2");

        throw new MinhaException("Deu errado!");

//        System.out.println("Fim do metodo 2");
    }
}
