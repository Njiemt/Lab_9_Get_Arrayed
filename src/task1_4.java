import java.util.Random;
import java.util.Scanner;
public class task1_4 {
    void main() {
        int[] dataPoints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
                , 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        double avg;
        int sum = 0;
        int matches = 0;
        int chosenNum;
        int MaxNum = 0;
        int MinNum = 100;
        boolean found = false;

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < dataPoints.length; i++) {

            dataPoints[i] = rnd.nextInt(100) + 1;

        }
        for (int i = 0; i < dataPoints.length; i++) {

            IO.print(dataPoints[i] + " | ");
        }
        for (int i = 0; i < dataPoints.length; i++) {

            sum = sum + dataPoints[i];

        }

        avg = getAverage(dataPoints);

        IO.println("\n" + "the sum of this series of numbers is " + sum);
        IO.println("the average of this series of numbers is " + avg);


        chosenNum = SafeInput.getRangedInt(input, "enter an integer", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {

            if (dataPoints[i] == chosenNum) {
                matches++;
            }

        }
        if (matches != 0) {
            IO.println("the number you chose appears " + matches + " times");
        } else {
            IO.println("this number does not appear in this dataset");
        }

        chosenNum = SafeInput.getRangedInt(input, "enter an integer", 1, 100);

        for (int i = 0; i < dataPoints.length; i++) {

            if (dataPoints[i] == chosenNum) {
                IO.println("The value " + chosenNum + " was found at array index " + i);
                found = true;
                break;
            }

        }
        if (!found) {
            IO.println("This value does not exist in this array");

            for (int i = 0; i < dataPoints.length; i++) {

                if (dataPoints[i] > MaxNum) {
                    MaxNum = dataPoints[i];
                }
                if (dataPoints[i] < MinNum) {
                    MinNum = dataPoints[i];
                }

            }
            IO.println(MaxNum);
            IO.println(MinNum);

        }
    }
    public static double getAverage(int values[]) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}