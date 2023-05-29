 class Cinema {

    public static void main(String[] args) {
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