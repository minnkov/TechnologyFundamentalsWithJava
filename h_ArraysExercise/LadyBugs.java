package j_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] initialIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] initialField = new int[fieldSize];

        for (int occupiedFieldsIndex : initialIndexes) {
            initialField[occupiedFieldsIndex] = 1;
        }

        while (true) {
            String ladybugDetailsInput = scanner.nextLine();

            if (ladybugDetailsInput.equals("end")) {
                break;
            }

            String[] ladybugMovement = ladybugDetailsInput.split(" ");
            int[] newIndexes = new int[ladybugMovement.length - 1];
            boolean movementToTheRight = true;

            for (int i = 0; i < ladybugMovement.length; i++) {
                if (i != 1 && i < 1) {
                    newIndexes[i] = Integer.parseInt(ladybugMovement[i]);
                } else if (i != 1 && i > 1) {
                    newIndexes[i - 1] = Integer.parseInt(ladybugMovement[i]);
                }

            }
            if (ladybugMovement[1].equals("left")) {
                movementToTheRight = false;
            }
            int movementStartIndex = newIndexes[0];
            int movementRange = newIndexes[1];

            if (movementStartIndex < 0 || movementStartIndex >= initialField.length) {
                continue;
            }

            if (initialField[movementStartIndex] == 0) {
                continue;
            } else {
                initialField[movementStartIndex] = 0;
            }
            int movementRangeMultiplier = 1;
            if (movementToTheRight) {
                if (initialField.length - movementStartIndex > movementRange) {
                    if (initialField[movementStartIndex + movementRange] == 0) {
                        initialField[movementStartIndex + movementRange] = 1;
                    } else {
                        movementRangeMultiplier++;
                        for (int i = 0; i < (initialField.length - (movementStartIndex + movementRange * movementRangeMultiplier)); i++) {
                            if (initialField[movementStartIndex + movementRange*movementRangeMultiplier] == 0) {
                                initialField[movementStartIndex + movementRange*movementRangeMultiplier] = 1;
                                break;
                            } else {
                                movementRangeMultiplier++;
                            }
                        }
                    }
                }
            } else { // works perfectly for right movement direction
                if (movementStartIndex > movementRange) {
                    if (initialField[movementStartIndex - movementRange] == 0) {
                        initialField[movementStartIndex - movementRange] = 1;
                    } else {
                        movementRangeMultiplier++;
                        for (int i = 0; i < (movementStartIndex - movementRange * movementRangeMultiplier); i++) {
                            if (initialField[movementStartIndex - (movementRange * movementRangeMultiplier)] == 0) {
                                initialField[movementStartIndex - (movementRange * movementRangeMultiplier)] = 1;
                                break;
                            } else {
                                movementRangeMultiplier ++;
                            }
                        }
                    }
                }
            }
        }
        for (int i : initialField) {
            System.out.print(i + " ");
        }
    }
}
