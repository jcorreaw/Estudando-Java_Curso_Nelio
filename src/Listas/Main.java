package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Joao");
        list.add("Vitoria");
        list.add("Augusto");
        list.add("Mousa");
        list.add(2, "Marco");
        System.out.println(list.size());

        for (String obj : list){
            System.out.println(obj);
        }
        System.out.println();

        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String obj : list){
            System.out.println(obj);
        }

        System.out.println("Joao: " + list.indexOf("Joao"));
        System.out.println();

        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

        for (String obj : resultado){
            System.out.println(obj);
        }

        System.out.println();

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
