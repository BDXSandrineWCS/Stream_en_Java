import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {

    interface Predicate<T> {

        boolean filter(T obj);
    }

    interface Mapper<T, U> {

        U map(T obj);
    }

    /**
     * Java entry point
     */
    public static void main(String... args) {

        new Generics();

    }

    /**
     * Class Constructor
     */
    private Generics() {

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strs = Arrays.asList("tout", "titi", "ototo", "jean", "tous", "taratata");

        //TODO  Ne retourner que les elements pairs multiplier par 2.

        ints= ints
                .stream()
                .filter(i -> (0 == i % 2))
                .map(i -> i * 2)
                .collect(Collectors.toList());

        for (Integer i : ints) System.out.println(i);

        //TODO Ne retourner en majuscule que les Strings contenant au moins 2 lettres t.

        String exp = "(.*[t].*){2,}";
        strs= strs
                .stream()
                .filter(s -> s.matches(exp))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        for (String s : strs) System.out.println(s);

    }


}
