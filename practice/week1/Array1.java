import java.util.*;
public class Array1 {
    public static void main (String[] args) {

        Scanner nii = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mul = -1;

        for (int i = 0; i <= numbers.length -1; i++) {
            System.out.println(numbers[i]);
        }
            System.out.println ("Enter a nmuber: ");
            int chosen = nii.nextInt();

        for (int i = 0; i <= numbers.length -1; i++){
            if (numbers[i] == chosen){
                System.out.println(numbers[i]);
            }
        }
    }
}