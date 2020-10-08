
// a node class is used for creating new nodes along with next pointer and data
class Node {
    Node next;
    int data;
    public Node(int d){
        this.data = d;
    }
}

// here a class linked is created inorder to perform the add remove operations
class LinkedList{
    // initially headNode is created
    // when adding new node it will check whether headNode exist or not
    // if not then headNode is created and data is stored at that node
    Node head;
    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        // else new node is create and will iterate till it reaches end of the node
        // and new node is created at that point with data
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    // inorder add new head create new headNode with data and point its next to head and then update head pointer with newHead
    
    public void appendAtHead(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void addAt(int position , int data){
        Node node = new Node(data);
        Node curr = head;
        // here head will start at 0 always
        int index =0;
        // traversing through list inorder to add node specific location
        while(index < position - 1){
            curr = curr.next;
            index++;
        }
        // when we reach the position move the curr node to next
        // then insert the node at curr location and point to next node i.e the node you moved previously
        node.next = curr.next;
        curr.next = node;

    }

    public void deleteAt(int position){
        Node curr = head;
        int index =0;
        if(position == 0){
            head = head.next;
        }
        while(index < position -1){
            System.out.println(index);
            curr = curr.next;
            index++;
        }
        curr.next = curr.next.next;
        curr = curr.next;
    }


    public void deleteData(int data){

        // inorder to delete the data check whether head is null or not
        if(head == null) return;

        // check whether data is at head or not if then set pointer to next node
        if(head.data == data){
            head = head.next;
            return;
        }

        //else go though the nodes till null and check for node with the data

        Node current = head;
        while(current.next != null){

            // found just update next pointer to its next node

            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }

            // else continue iterating

            current = current.next;
        }
    }

    public void print(){
        Node tail = head;
        while(tail.next != null){
            System.out.println(tail.data);
            tail = tail.next;
        }
        System.out.println(tail.data);
    }

    public void printReverse(){
        Node prev = null;
        Node curr_node = head;
        while(curr_node != null){
            // here next_node acts as temp_node to save next of curr node
            // then replacing prev with null
            //prev with the actual node
            //last upating curr node with next_node
            Node next_node = curr_node.next;
            curr_node.next = prev;
            prev = curr_node;
            curr_node = next_node;

        }
        while(prev != null ){
            System.out.println(prev.data);
            prev = prev.next;
        }
    }
}

public class SlinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(25);
        ll.append(16);
        ll.append(19);
        ll.append(14);
        ll.append(55);

        ll.appendAtHead(78);
        ll.appendAtHead(12);

        ll.print();

        ll.addAt(3,99);
        System.out.println();
        ll.print();

        System.out.println();
        ll.deleteAt(5);
        System.out.println();
        ll.print();
        System.out.println();
        ll.printReverse();
    }
}
