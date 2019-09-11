public class Main {
    public static void main(String[] args) {
        LinkerList<Integer> list = new LinkerList<>(1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 4);
        System.out.println(list.size());
        System.out.println(list.contains(2));
        System.out.println(list.indexOf(2));
        System.out.println(list.get(2));
        System.out.println(list.getFisrt());
        System.out.println(list.getLast());
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.clear();
        System.out.println(list);

    }
}
