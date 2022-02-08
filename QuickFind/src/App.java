public class App {
    public static void main(String[] args) throws Exception {
        Qfind obj = new Qfind();
        System.out.println(obj.connected(3, 6));
        obj.union(4, 5);
        System.out.println(obj.connected(4, 5));
        obj.union(6, 5);
        obj.union(9, 5);

    }
}
