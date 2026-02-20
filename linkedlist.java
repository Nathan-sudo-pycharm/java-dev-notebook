import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

      LinkedList<Integer> linkedlist = new LinkedList<>();
      linkedlist.add(1);
      linkedlist.add(2);
      linkedlist.add(3);
      int add= linkedlist.get(2);
      linkedlist.addLast(5);
      linkedlist.addFirst(10);
      // if in array then thn adding an elemet to the irst then the time cmplexity will be O(n) as theere would be a need to shift all emelents to one space front, but here in lined list the time complexity will be O(1)
        System.err.println(linkedlist);
        System.err.println(add);
    // removing even nu,bers
    linkedlist.removeIf(x->x%2==0);
    System.err.println(linkedlist);



    }
}