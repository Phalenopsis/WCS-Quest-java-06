public class Classroom {
    public static void main(String[] args) {
        Wilder johann = new Wilder("Johann", true);
        Wilder bob = new Wilder("bob", false);

        System.out.println(johann.whoAmI());
        System.out.println((bob.whoAmI()));
    }
}
