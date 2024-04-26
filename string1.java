public class string1 {
    public static void main(String[] args) {
        String name = "Abrar";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        String name1 = name.replace('r','s');  //replace
        System.out.println(name1);
        String name2 = "Abrar and Gohona";
        System.out.println(name2.substring(10, 16));  //substring
    }
}
