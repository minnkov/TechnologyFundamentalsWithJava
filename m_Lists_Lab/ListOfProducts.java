package o_Lists_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            productList.add(product);
        }

        int productCounter = 1;

        Collections.sort(productList);

        for (String product : productList) {
            System.out.printf("%d.%s%n", productCounter, product);
            productCounter++;
        }
    }
}
