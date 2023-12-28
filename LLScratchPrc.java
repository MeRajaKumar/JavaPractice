import java.util.*;
// four operations - add, remove, size, and delete
class LLScratchPrc {
   Node head;
   private int size;

   LLScratchPrc () {
       size = 0;
   }

   public class Node {
       String data;
       Node next;

       Node(String data) { // this is a constructor
           this.data = data;
           this.next = null;
           size++;
       }
   }

   // addFisrt
   public void addFirst(String data) {
       Node newNode = new Node(data);
       if(head == null) {
          head = newNode;
          return;
       }

       newNode.next = head;
       head = newNode;
   }

   // addLast
   public void addLast(String data) {
       Node newNode = new Node(data);
       if(head == null) {
           head = newNode;
           return;
       }

       Node lastNode = head;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }

       lastNode.next = newNode;
   }

   // printList
   public void printList() {
       if(head== null){
          System.out.println("List is empty");
          return;
       }
       Node currNode = head;
       while(currNode != null) {
           System.out.print(currNode.data+" -> ");
           currNode = currNode.next;
       }
       System.out.println("null");
   }

   // removeFirst
   public void removeFirst() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
       head = this.head.next;
       size--;
   }

   // removeLast
   public void removeLast() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
       size--;
       if(head.next == null) {
           head = null;
           return;
       }

       Node currNode = head;
       Node lastNode = head.next;
       while(lastNode.next != null) {
           currNode = currNode.next;
           lastNode = lastNode.next;
       }
       currNode.next = null;
   }

   // getSizeOfNode
   public int getSize() {
       return size;
   }
 
   public static void main(String args[]) {
       LLScratchPrc list = new LLScratchPrc();
       list.addLast("is");
       list.addLast("a");
       list.addLast("list");
       list.printList();

       list.addFirst("this");
       list.printList();
       System.out.println(list.getSize()); 

       list.removeFirst();
       list.printList();

       list.removeLast();
       list.printList();
   }
}





// //LinkedList Class
// import java.util.*;

// class LLScratchPrc { 
//    public static void main(String args[]) {
//       LinkedList<String> list = new LinkedList<String>();


//       list.addFirst("shradha");
//       list.addFirst("name");
//       list.addFirst("my");
//       System.out.println(list);
     
//       list.add(2, "is");
//       System.out.println(list);
//    }
// }
