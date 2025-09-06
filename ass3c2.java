import java.util.*;
class ColorList {
    public static void main(String[] args) {
    LinkedList<String> colors = new LinkedList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        System.out.println("Colors using Iterator:");
        Iterator<String> itr = colors.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\nColors in Reverse using ListIterator:");
        ListIterator<String> listItr = colors.listIterator(colors.size());
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

    
        LinkedList<String> newColors = new LinkedList<String>();
        newColors.add("pink");
        newColors.add("green");

        int insertIndex = colors.indexOf("yellow"); 
        colors.addAll(insertIndex, newColors);

        System.out.println("\nFinal List after Insertion:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
