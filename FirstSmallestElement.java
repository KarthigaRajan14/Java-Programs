import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 1; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int max = arr[1];
        int index = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            } else {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}