package C_For_Ex01;

public class Tabuada {

    private int numero;
    private String imprimir = "";

    public String calcularTabuada(int numero) {
        this.numero = numero;

        for (int i = 0; i <= 10; i++) {
            this.imprimir = this.imprimir + "\n"
                    + // pega oq eu gravei pulo uma linha e faço a estrutura da tabuada;
                    i + " x " + this.numero + " = " + i * this.numero;
        }
        return this.imprimir;
    }

}
