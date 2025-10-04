import java.util.*;

public class arrays {
    public static void main(String[] args) {
        // int arr[] = {1, 43, 6, 23, 11, 77};
        // int n = arr.length;

        // Arrays.sort(arr);
        // int idx = Arrays.binarySearch(arr, 5);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(idx);

        // int sum = 0;
        // int a[] = new int[5];

        // Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < 5; ++i) {
        //     a[i] = sc.nextInt();
        // }
        // for(int i = 0; i < 5; ++i) sum += a[i];

        // System.out.println(sum);
        // sc.close();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(1);
        arr.add(3);
        arr.add(9);
        arr.add(7);

        // arr.remove(1);
        System.out.println(arr.toString());
        
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr.toString());

        arr.forEach(i -> {
            i = i + 10;
            System.out.print(i + " ");
        });
        System.out.print('\n');

        // System.out.println(arr.toString());
    }
}
