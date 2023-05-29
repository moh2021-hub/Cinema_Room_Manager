import java.util.Scanner;

// stage 2/5
 class Cinema {

    public static void main(String[] args) {
        System.out.println(price());
    }
    public static String price() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int userInputA = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the number of seats in each row: ");
        int userInputB = scanner.nextInt();

        int solution = userInputB * userInputA;

        if (solution <= 60) {
            System.out.println("Total income:");
            return "$" + (solution * 10);
        } else {
            int a = (userInputA / 2);
            int b = userInputA - a;

            int soultionA = a * 10 * userInputB;
            int soultionB = b * 8 * userInputB;
            System.out.println("Total income:");
            return "$" + (soultionA + soultionB);

        }
    }

    public static void viewSteats(){
        // Write your code here
        char[][] cinema = new char[7][8]; // create a 2D array with 7 rows and 8 columns

        // set all elements to 'S' for 'available seat'
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[i][j] = 'S';
            }
        }

        // print the header
        System.out.println("Cinema:");

        // print the column numbers
        System.out.print("  ");
        for (int i = 1; i <= cinema[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // print the cinema
        for (int i = 0; i < cinema.length; i++) {
            // print the row number
            System.out.print((i+1) + " ");
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }

    }
}