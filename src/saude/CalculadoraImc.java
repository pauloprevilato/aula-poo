package src.saude;

public class CalculadoraImc {
    IndiceMassaCorporal calcular(double peso, double altura) {
        double imcCalculado = peso / (altura * altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = imcCalculado;
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
