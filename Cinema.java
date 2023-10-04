import java.util.Scanner;

public class Cinema {

    public static int numberRows;
    public static int numberSeats;
    public static int choseSeat;
    public static int inputRow;

    public int getNumberRows() {
        return numberRows;
    }

    public void setNumberRows(int numberRows) {
        Cinema.numberRows = numberRows;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        Cinema.numberSeats = numberSeats;
    }

    public static char[][] buildCinema() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        numberRows = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the number of seats in each row: ");
        numberSeats = Integer.parseInt(sc.nextLine());
        System.out.println();
        System.out.println("Cinema: ");

        char[][] cinema = new char[numberRows + 1][numberSeats + 1];

        for (int i = 1; i <= numberRows; i++) {
            for (int j = 1; j <= numberSeats; j++) {
                cinema[i][j] = 'S';
            }
        }

        for (int j = 1; j <= numberSeats; j++) {
            cinema[0][j] = (char) ('0' + j);
        }

        for (int i = 1; i <= numberRows; i++) {
            cinema[i][0] = (char) ('0' + i);
        }

        cinema[0][0] = ' ';

        for (char[] row : cinema) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        return cinema;
    }

    public static void buyTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a row number: ");
        inputRow = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a seat number in that row: ");
        choseSeat = Integer.parseInt(sc.nextLine());

        int totalSeats = numberSeats * numberRows;

        if (totalSeats < 60) {
            System.out.println("Ticket price: $10");
        } else {
            int halfRows = numberRows / 2;
            if (inputRow <= halfRows) {
                System.out.println("Ticket price: $10");
            } else {
                System.out.println("Ticket price: $8");
            }
        }
    }

    public static void findPlace(char[][] cinema) {
        System.out.println();
        cinema[inputRow][choseSeat] = 'B';
        System.out.println("Cinema: ");
    }

    public static void main(String[] args) {
        char[][] cinema = buildCinema();
        // Print the contents of the grid with row and column numbers

        buyTicket();
        findPlace(cinema);

        // Print the updated cinema layout with the booked seat
        for (char[] row : cinema) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
