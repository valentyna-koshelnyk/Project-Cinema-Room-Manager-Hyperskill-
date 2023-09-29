import java.util.Scanner;
public class Sold {
//
 
public static void sellTickets() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int numberRows = Integer.parseInt(sc.nextLine());
    System.out.println("Enter the number of seats in each row: ");
    int numberSeats = Integer.parseInt(sc.nextLine());
    int totalSeats = numberSeats * numberRows;
    int firstHalf = 0;
    int secondHalf = 0;
    int priceFirstHalf = 10;
    int priceSecondHalf = 8;


    if (totalSeats < 60){
        System.out.println("$" + totalSeats * priceFirstHalf);
    } else if (totalSeats > 60 && numberRows % 2 == 0){
        for (int i = 0; i < numberRows / 2; i++) {
             firstHalf++;
        }
        for (int i = numberRows / 2; i < numberRows ; i++) {
            secondHalf++;
        }
        firstHalf = numberSeats * firstHalf * priceFirstHalf;
        secondHalf = numberSeats * secondHalf * priceSecondHalf;
        int sum = firstHalf + secondHalf;
        System.out.println("$" + sum);
    } else if (totalSeats > 60 && numberRows % 2  == 1) {
        for (int i = 0; i < numberRows / 2; i++) {
            firstHalf++;
        }
        for (int i = (numberRows / 2) + 1; i <= numberRows; i++) {
            secondHalf++;
        }
        firstHalf = numberSeats * firstHalf * priceFirstHalf;
        secondHalf = numberSeats * secondHalf * priceSecondHalf;
        int sum = firstHalf + secondHalf;
        System.out.println("$" + sum);
    }




}
    public static void main(String[] args) {
        sellTickets();

    }


    }




