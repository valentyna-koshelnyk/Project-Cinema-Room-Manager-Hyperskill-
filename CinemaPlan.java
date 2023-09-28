public class CinemaPlan {
    public static void printsFirstTwoRows() {
        System.out.print("Cinema:" + "\n");
        int size = 8; // Adjust the size of the square as needed
        // Print column headers with indexes
        System.out.print("  ");
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
    }
    public static void printsTheRest(){
        char[] row2 = new char[8];
        String row3 = new String();
        for (int i = 0; i < row2.length - 1; i++){
            System.out.print(i + 1 + " ");
            for (int j = 0; j < row2.length; j ++){
                System.out.print("S ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printsFirstTwoRows();
        printsTheRest();
    }
}