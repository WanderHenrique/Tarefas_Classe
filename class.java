public class Caneta {

    private String cor;
    private double ponta;
    private int carga;

    public Caneta(String cor, double ponta, int carga) {
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
    }

    public void escrever(String texto) {
        System.out.println(texto);
        this.carga -= texto.length();
    }

    public void recarregar() {
        this.carga = 100;
    }

    public int getCarga() {
        return this.carga;
    }

}

public class Main {

    public static void main(String[] args) {
        Caneta caneta = new Caneta("azul", 0.7, 50);

        caneta.escrever("Olá, mundo!");

        caneta.recarregar();

        System.out.println(caneta.getCarga()); // 100
    }

}
