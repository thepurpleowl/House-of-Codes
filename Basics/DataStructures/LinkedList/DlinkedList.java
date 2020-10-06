
class DNode{
    DNode next;
    DNode prev;
    int data;
    DNode(int d){
        this.data = d;
    }
}

class DLinkedList{
    DNode head;

    public void add(int data){
        DNode node = new DNode(data);
        if(head ==null){
            head = node;
            return;
        }
        DNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        node.prev = current;

    }

    public void addAtHead(int data){
        DNode newhead = new DNode(data);
        newhead.next = head;
        head = newhead;
    }

    public void addAtTail(int data){
        add(data);
    }

    public void print(){
        DNode tail = head;
        while(tail.next != null){
            System.out.println(tail.data);
            tail = tail.next;
        }
        System.out.println(tail.data);
    }

    public void printReverse(){
        DNode node = head;
        while(node.next != null){
            node = node.next;
        }
        while(node != head){
            System.out.println(node.data);
            node = node.prev;
        }
        System.out.println(head.data);
    }

    public void reverseList(){
        DNode temp = head;
        DNode newhead = head;
        while(temp != null){
            DNode pre = temp.prev;
            temp.prev = temp.next;
            temp.next = pre;
            newhead = temp;
            temp = temp.prev;
        }
        while(newhead != null){
            System.out.println(newhead.data);
            newhead = newhead.next;
        }
    }
}

class Dlinked {
    public static void main(String[] args) {
        DLinkedList dl = new DLinkedList();
        dl.add(13);
        dl.add(16);
        dl.add(56);
        dl.add(78);

        dl.print();
        System.out.println();
        dl.printReverse();
        System.out.println();
        dl.reverseList();

    }
}
