import java.util.ArrayList;
import java.util.List;

 // find the nearest n elements in an array of integers
 // input : {12, 16, 22, 30, 35, 39, 42,45, 48, 50, 53, 55, 56}
 // search : 35
 // K : 4
 // output : {39, 30, 42, 22}

public class NearestElements {
    static int difference(int i, int search){
        if(search < i)
            return i - search;
        else
            return search - i;
    }
    public static void main(String[] args) {
        int[] arr = {12, 16, 22, 30, 35, 39, 42,45, 48, 50, 53, 55, 56};
        int n = 4, search = 35;

        List<Integer> finalArr = new ArrayList<>();

        for(int i= 0; i<n; i++){
            int difference = 200;
            int item = -1;

            for (int k : arr) {
                int diff = difference(k, search);
                if (diff < difference && k != search) {
                    if (!finalArr.contains(k)) {
                        difference = diff;
                        item = k;
                    }
                }
            }
            finalArr.add(item);
        }
        finalArr.forEach(System.out::println);
    }
}