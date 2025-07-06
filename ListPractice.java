import java.util.*;

class ListPractice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // ✅ Basic Additions
        list.add("is");
        list.add("a");
        list.addLast("list");
        list.addFirst("this");
        list.add(3, "linked"); // Insert at index 3
        System.out.println("Initial list: " + list);

        // ✅ Accessing Elements
        System.out.println("First element: " + list.get(0));
        System.out.println("Size: " + list.size());

        // ✅ Removals
        list.remove(3); // Remove "linked"
        list.removeFirst(); // Remove "this"
        list.removeLast(); // Remove "list"
        System.out.println("After removals: " + list);

        // ✅ More List Methods

        // Add more elements
        list.add("example");
        list.add("practice");
        list.add("linked");
        list.add("list");

        // contains()
        System.out.println("Contains 'linked'? " + list.contains("linked"));

        // indexOf() and lastIndexOf()
        System.out.println("Index of 'linked': " + list.indexOf("linked"));
        System.out.println("Last index of 'list': " + list.lastIndexOf("list"));

        // set(index, element)
        list.set(1, "an");
        System.out.println("After set(): " + list);

        // toArray()
        Object[] array = list.toArray();
        System.out.println("Array version: " + Arrays.toString(array));

        // subList()
        List<String> sub = list.subList(1, 3); // from index 1 to 2
        System.out.println("Sublist (1 to 2): " + sub);

        // isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // clone() (returns Object, needs casting)
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is list empty now? " + list.isEmpty());
    }
}