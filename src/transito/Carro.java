package src.transito;
public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa proprietario;

    void imprimirResumoDepreciacao() {
        double valorRenvendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        if (precoCompra <= 0){
            System.out.println("Carro com preço de compra zerado." +
                    "Não foi possível imprimir resumo de depreciação.");
            return;
        }

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRenvendaMeuCarro );
    }

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularIpva() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        int limiteMaxCobrancaEmAnoIpva = 10;
        int isento = 0;

        if (tempoDeUsoEmAnos >= limiteMaxCobrancaEmAnoIpva) {
            return isento;
        }

        return calcularValorRevenda() * 0.04;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAno = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAno) * (vidaUtilEmAno - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}
