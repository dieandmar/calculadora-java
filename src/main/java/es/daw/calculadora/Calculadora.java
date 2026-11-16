
package es.daw.calculadora;

public class Calculadora {

    // sumar dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // restar el segundo número al primero
    public double restar(double a, double b) {
        return a - b;
    }

    // multiplica dos números
    public double multiplicar(double a, double b) {
    return a * b;
    }
    // divide el primer número entre el segundo
    public double dividir(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException(
            "No se puede dividir entre cero"
        );
    }

    return a / b;
    }

    public double potencia(double base, double exponente) {
    return Math.pow(base, exponente);
    }
}

