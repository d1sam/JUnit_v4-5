import java.util.List;

public class LinkedOrArrayList {
    public static void remove(List<String> list, String element) {
        System.out.print(list.getClass().getSimpleName() + " :\t");
        long start = System.nanoTime();
        list.remove(element);
        long stop = System.nanoTime();
        System.out.println("took "+ (stop-start)+" nanos.");
    }
}
