public class exercises2 {

    public static void main(String[] ex){

        int row = 3;
        int elem = 3;

        for (int i = row; i > 0; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
