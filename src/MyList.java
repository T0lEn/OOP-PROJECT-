import java.util.*;

public class MyList<E> extends ArrayList<E> {

            public void addElement(E element) {
                this.add(element);
                System.out.println("Added: " + element);
            }


            public void addElementAt(int index, E element) {
                this.add(index, element);
                System.out.println("Added at index " + index + ": " + element);
            }


            public E getElement(int index) {
                E element = this.get(index);
                System.out.println("Element at index " + index + ": " + element);
                return element;
            }


            public void setElement(int index, E element) {
                this.set(index, element);
                System.out.println("Set at index " + index + ": " + element);
            }

            public void removeElementAt(int index) {
                E removedElement = this.remove(index);
                System.out.println("Removed from index " + index + ": " + removedElement);
            }

            public void removeElement(E element) {
                this.remove(element);
                System.out.println("Removed: " + element);
            }

            public boolean containsElement(E element) {
                boolean result = this.contains(element);
                System.out.println("Contains " + element + ": " + result);
                return result;
            }

            public int getSize() {
                int size = this.size();
                System.out.println("List size: " + size);
                return size;
            }


            public void clearList() {
                this.clear();
                System.out.println("List cleared.");
            }


            public int indexOfElement(E element) {
                int index = this.indexOf(element);
                System.out.println("Index of " + element + ": " + index);
                return index;
            }


            public void sortList() {
                Collections.sort((List<Comparable>) this);
                System.out.println("List sorted in natural order: " + this);
            }


            public static void main(String[] args) {
                MyList<Integer> list = new MyList<>();

                list.addElement(10);
                list.addElement(5);
                list.addElement(20);
                list.addElementAt(1, 15);

                list.getElement(2);

                list.setElement(2, 25);

                list.removeElementAt(3);
                list.removeElement(10);

                list.containsElement(15);

                list.getSize();


                list.sortList();
            }
        }

