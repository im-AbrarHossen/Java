import java.util.LinkedList;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Abrar");
        names.add("Gohona");
        System.out.println(names);
        names.addFirst("Badhon");
        System.out.println(names);
        names.addLast("Suzana");
        System.out.println(names);
        names.removeFirst();
        names.removeLast();
        System.out.println(names);
    }
}
