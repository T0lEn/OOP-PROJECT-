package Lab3.task3;

public class Test {
    public static void main(String[] args) {
        MySet set = new MySet();
        MyList list = new MyList();

        set.add(12);
        set.add(13);
        set.add(14);
        set.add(12);
        System.out.println("My Set: " + set.size());

        list.add(19);
        list.add(21);
        list.add(22);
        list.add(22);
        System.out.println("My List: " + list.size());

        list.contains(12);
        list.isEmpty();
        list.remove(19);
        System.out.println("My List: " + list.size());

        System.out.println("My Set: " + set.contains(12));
        System.out.println("My List: " + set.isEmpty());

        System.out.println("My Set: " + set.getElements());
        System.out.println("My List: " + set.getElements());
    }
}
