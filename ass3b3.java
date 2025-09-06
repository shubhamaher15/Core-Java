import java.util.*;
class LanguageList {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<String>();
        languages.add("CPP");
        languages.add("Java");
        languages.add("Python");
        languages.add("PHP");

        System.out.println("Languages using Iterator:");
        Iterator<String> itr = languages.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nLanguages in Reverse using ListIterator:");
        ListIterator<String> listItr = languages.listIterator(languages.size()); 
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}
