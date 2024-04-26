import java.util.ArrayList;
public class array_list{
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Orange");
        System.out.println(color);
        System.out.println(color.get(2));
        color.set(0, "Purple");
        System.out.println(color);
        color.remove(1);
        System.out.println(color);
    }
}
