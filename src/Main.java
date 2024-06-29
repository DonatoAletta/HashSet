import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>(hashSet());

        hashSet().forEach(System.out::println);
        System.out.println("La grandezza del set è: " + hashSet().size());

        String name = "Vanessa";
        names.add(name);

        if(names.contains(name)) {
            System.out.println("L'elemento 'Vanessa' è presente nell'HashSet");
        }
        else {
            System.out.println("L'elemento 'Vanessa' non è presente nell'HashSet");
        }
    }

    public static HashSet<String> hashSet(){
        HashSet<String> names = new HashSet<>();
        names.add("Mario");
        names.add("Giovanni");
        names.add("Simone");

        return names;
    }
}