package Ispit.PrvaGrupa.Zadatak3;

import java.util.LinkedList;
import java.util.List;


    class Node<T>{
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
public class GenericList<T> {
    private Node<T> head;

    public void addCvorove(T element){
        Node<T> newNode = new Node<>(element);
        if(head==null){
            head=newNode;
        }else{
            Node<T> currentNode= head;
            while(currentNode.next!=null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }
    }

    public void remove(T element){
        if(head==null){
            return;
        }
        if(head.data.equals(element)){
            head=head.next;
            return;
        }
        Node<T> current = head;
        Node<T> prev = null;

        while (current != null && !current.data.equals(element)) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
        }
    }

    public void printAll() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
            System.out.println("\n");

        }
        System.out.println("\n");
    }

    public int findIndex(T element){
        int index=-1;
        int currentIndex=0;
        Node<T> current = head;

        while(current!=null){
            if(current.data.equals(element)){
                index=currentIndex;
            }
            currentIndex++;
            current=current.next;
        }
        return index;
    }

}
