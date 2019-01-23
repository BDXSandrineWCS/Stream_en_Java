import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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

        //  Ne retourner que les nombres pairs.

        //TODO ints = filter(ints, i -> (0 == i % 2));

        // Multiplier par 2 chaque élément de la liste.

       //TODO ints = map(ints, i -> i * 2);
        for (Integer i : ints) System.out.println(i);

        // Ne retourner que les Strings contenant au moins 2 lettres t.

        String exp = "(.*[t].*){2,}";
        //TODO strs = filter(strs, s -> s.matches(exp));

        //Passer en majuscule toutes les Strings

        //TODO strs = map(strs, String::toUpperCase);

        for (String s : strs) System.out.println(s);

    }


}
