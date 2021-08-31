import java.util.Scanner;

public class LinkedListUse {
    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while(data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
               tail.next = newNode;
               tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node<Integer> insert(Node<Integer> head, int data, int pos){
        Node<Integer> newNode = new Node<Integer>(data);
        if(pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node<Integer> temp = head;
        int count = 0;
        while(count < pos - 1) {
            count++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insert(head, 80, 0);
        print(head);
    }
}
