package j_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());

        int minSequenceIndex = Integer.MAX_VALUE;
        int maxSequenceCounter = 0;
        String bestDNAString = "";
        int sampleCounter = 0;
        int totalOnesCounter = 0;


        while (true) {

            String inputString = scanner.nextLine();
            if (inputString.equals("Clone them!")) {
                break;
            }

            int[] dnaArray = Arrays.stream(inputString.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sequenceIndex = 0;
            int onesCounter = 0;

            for (int i = 0; i < dnaArray.length; i++) {
                int sequenceCounter = 0;

                for (int j = i; j < dnaArray.length; j++) {
                    if (dnaArray[i] == 1 && dnaArray[j] == 1) {
                        sequenceCounter++;
                        if (sequenceCounter >= maxSequenceCounter) {
                            maxSequenceCounter = sequenceCounter;
                            sequenceIndex = i;
                            onesCounter++;
                            if (sequenceIndex < minSequenceIndex) {
                                minSequenceIndex = sequenceIndex;
                                if (onesCounter > totalOnesCounter) {
                                    totalOnesCounter = onesCounter;
                                    bestDNAString = inputString;
                                }
                            }

                        }
                    } else {
                        sequenceCounter = 0;
                        minSequenceIndex = Integer.MAX_VALUE;
                        break;
                    }
                }

            }
            sampleCounter++;

        }

        String[] output = bestDNAString.split("!+");
        int[] sumElements = Arrays.stream(output)
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;

        for (int sumElement : sumElements) {
            if (sumElement == 1) {
                sum += sumElement;
            }

        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", sampleCounter, sum);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
