package at.htlinn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sortierung sort = new Bubblesortsort();
        int[] arr = {0,2,3,1,8,6};
        System.out.println(Arrays.toString(sort.sortarr(arr)));
    }
}
