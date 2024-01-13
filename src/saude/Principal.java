package src.saude;

public class Principal {
    public static void main(String[] args) {

        CalculadoraImc calculadoraImc = new CalculadoraImc();

        double peso = 175;
        double altura = 1.82;

        IndiceMassaCorporal imc = calculadoraImc.calcular(peso, altura);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura %.2f e peso de %.2f Kg " +
                    "Está com obesidade.%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC %.2f%n", imc.resultado);

    }
}
