package dio._5coding_future_Stream_API._3FunctionExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();
        numerosDobrados.forEach(System.out::println);
    }
}
