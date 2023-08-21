package dio._5coding_future_Stream_API._5BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        BinaryOperator<Integer> somar = (num1, num2) -> num1+num2;
        int resultado = numeros.stream()
                .reduce(0, somar);

        System.out.println("SOMA: " + resultado);
    }
}
