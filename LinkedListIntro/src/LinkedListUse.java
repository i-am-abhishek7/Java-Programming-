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

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {

        if (head == null) {
            return null;
        }

        if(pos == 0) {
            return head.next;
        }

        int count = 0;
        Node<Integer> currNode = head;
        while(currNode != null && count < (pos - 1)) {
            currNode = currNode.next;
            count++;
        }

        if (currNode == null || currNode.next == null) {
            return head;
        }

        currNode.next = currNode.next.next;
        return head;
        /*
        if(head == null) {
            return null;
        }

        if(pos == 0) {
            Node<Integer> temp = head;
            temp = temp.next;
            head = temp;
            return head;
        }

        int count = 0;
        Node<Integer> temp = head;
        while(count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if(temp.next.next == null) {
            temp.next = null;
        } else {
            temp.next = temp.next.next;
        }
        return head;
        */
    }

    public static int findNode(Node<Integer> head, int key) {
        if(head == null) {
            return -1;
        }
        Node<Integer> temp = head;
        int count = 0;
        while(temp != null) {
            if(temp.data == key) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to be searched in linked list");
        int n = sc.nextInt();
        int ans = findNode(head, n);
        System.out.println("The node found at position : " + ans);
//        print(head);
    }
}
