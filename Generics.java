
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {

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

        //je garde la reafectation de ints et strs dans le code afin de conserver la logique de modification des variables en plus de l'impression
        // meme si pour imprimer la reafectation n'est pas necessaire
        //de plus sinon, je n'est meme pas besoin d'utiliser collect ce qui est un des buts de la quete

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strs = Arrays.asList("tout", "titi", "ototo", "jean", "tous", "taratata");

        //  Ne retourner que les elements pairs multiplier par 2.


        ints= ints
                .stream()
                .filter(i -> (0 == i % 2))
                .map(i -> i * 2)
                .collect(Collectors.toList());

        for (Integer i : ints) System.out.println(i);

        // Ne retourner en majuscule que les Strings contenant au moins 2 lettres t.

        String exp = "(.*t.*){2,}";
        strs= strs
                .stream()
                .filter(s -> s.matches(exp))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
      
       for (String s : strs) System.out.println(s);

    }

}
