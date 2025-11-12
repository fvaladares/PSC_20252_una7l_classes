package org.example;

public class Retangulo {
    // Atributos da classe (características)
    private double base;
    private double altura;

    /**
     * Construtor da classe - utilizado na inicialização do objeto.
     * @param base
     * @param altura
     */
    public Retangulo(double base,
                     double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     *
     * @return o valor do perímeto do retângulo
     */
    public double perimetro() {
        // realiza o cálculo e retorna o valor
        double resultado = 0;

        resultado = (base + altura) * 2;

        return resultado;
    }

    public double area() {
        // realiza o cálculo e retorna o valor
        return 0;
    }

    public double diagonal() {
        // realiza o cálculo e retorna o valor
        return 0;
    }

}
