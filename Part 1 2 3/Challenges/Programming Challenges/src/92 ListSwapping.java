import java.util.Arrays;
import java.util.List;

class ListSwapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,12,13,14,15,16,17,18);
        System.out.println(list);
        swap(list,2,7);
        System.out.println(list);

    }
    public static void swap(List<Integer> list, int x, int y)    {
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y,swap);
    }
}
