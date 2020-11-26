import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

public class BitonicSortTests {

    BitonicSort bitonicSort = new BitonicSort();

    @Test
    void shortList(){
        int a[] = {3, 7, 4, 8, 6, 2, 1, 5};
        int expected[] = {1,2,3,4,5,6,7,8};
        int up = 1;
        bitonicSort.sort(a,a.length ,up);
        Assertions.assertArrayEquals(a, expected);
    }

    @Test
    void longList(){
        int[] a = new int[10000000];
        int[] expected;
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        expected = a;
        Random rnd = new Random();
        for (int i = a.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int newPlace = a[index];
            a[index] = a[i];
            a[i] = newPlace;
        }
        System.out.println(a);
        int up = 1;
        bitonicSort.sort(a,a.length,up);
        Assertions.assertArrayEquals(a, expected);
    }

    @Test
    void negativeNumbers(){
        int a[] = new int[100000];
        int expected[];
        int up = 1;
        for(int i=0; i < a.length; i++){
            a[i]= -50000+i;
        }
        expected = a;
        Random rnd = new Random();
        for (int i = a.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int newPlace = a[index];
            a[index] = a[i];
            a[i] = newPlace;
        }
        bitonicSort.sort(a,a.length,up);
        Assertions.assertArrayEquals(a,expected);
    }
}
