package src.transito;

public class Principal {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Paulo";
        eu.cpf = "111.111.111-11";
        eu.anoNascimento = 1994;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 1994;
        meuCarro.modelo ="HB20";
        meuCarro.cor = "Branco";
        meuCarro.fabricante = "Hyundai";
        meuCarro.precoCompra = 40000;
        meuCarro.proprietario = eu;

        double ipva = meuCarro.calcularIpva();
        System.out.printf("Cobrança do IPVA %6.2f%n", ipva);

        meuCarro.imprimirResumoDepreciacao();

    }
}
