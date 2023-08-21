package dio._5coding_future_Stream_API._4Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "Javascript");

        Predicate<String> maisDecincoCaracteres = palavra -> palavra.length() >5;
        palavras.stream()
                .filter(maisDecincoCaracteres)
                .forEach(System.out::println);
    }
}
