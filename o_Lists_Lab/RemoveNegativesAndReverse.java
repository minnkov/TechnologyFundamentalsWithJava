package o_Lists_Lab;

import java.util.*;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split(" ");

        List<Integer> numericList = new ArrayList<>();

        for (int i = 0; i < inputString.length; i++) {
            int number = Integer.parseInt(inputString[i]);
            if (number >= 0) {
                numericList.add(number);
            }
        }

        if (numericList.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(numericList);
            for (Integer nums : numericList) {
                System.out.print(nums + " ");
            }
        }
    }
}
