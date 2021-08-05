package letters_count;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LettersCount {

    static int lettersCount(List<String> names) {
        return names.stream()
                .filter(name -> name.toLowerCase().startsWith("f"))
                .map(String::length)
                .reduce(0, Integer::sum);

    }

    public static void main(String[] args) {
        List<String> names = List.of("marco", "franco", "federico", "mario");
        System.out.println(lettersCount(names) == 14);
    }
}
