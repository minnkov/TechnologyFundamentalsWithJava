package w_MapsLambdaStreamAPI_Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceSides = new LinkedHashMap<>();

        while (true) {

            String initialInput = scanner.nextLine();

            String[] input = initialInput.split(" -> ");
            String command = "->";

            if (input[0].equals("Lumpawaroo")) {
                break;
            }

            if (input.length == 1) {
                input = initialInput.split(" \\| ");
                command = "|";
            }

            String side = input[0];
            String name = input[1];

            if (command.equals("|")) {

                if (!forceSides.containsKey(side)) {
                    forceSides.put(side, new ArrayList<>());
                    forceSides.get(side).add(name);

                } else {
                    if (!forceSides.get(side).contains(name)) {
                        forceSides.get(side).add(name);
                    }
                }

            } else if (command.equals("->")) {
                name = input[0];
                side = input[1];

                String currentSide = "";

                for (String tempSide : forceSides.keySet()) {
                    if (!tempSide.equals(side)) {
                        currentSide = tempSide;
                    }
                }

                if (forceSides.get(currentSide).contains(name)) {
                    forceSides.get(currentSide).remove(name);
                }

                if (!forceSides.containsKey(side)) {
                    forceSides.put(side, new ArrayList<>());
                    forceSides.get(side).add(name);
                    System.out.printf("%s joins the %s side!\n", name, side);

                } else if (!forceSides.get(side).contains(name)) {
                    forceSides.get(side).add(name);
                    System.out.printf("%s joins the %s side!\n", name, side);

                }

            }

        }

        forceSides.entrySet()
                .stream()
                .sorted((left, right) -> {
                    int sort = Integer.compare(right.getValue().size(), left.getValue().size());

                    if (sort == 0) {
                        sort = left.getKey().compareTo(right.getKey());
                    }

                    return sort;
                })
                .forEach(e -> {
                    if (e.getValue().size() != 0) {
                        Collections.reverse(e.getValue());
                        System.out.printf("Side: %s, Members: %d\n", e.getKey(), e.getValue().size());
                        for (String name : e.getValue()) {
                            System.out.printf("! %s\n", name);
                        }
                    }
                });
    }
}
