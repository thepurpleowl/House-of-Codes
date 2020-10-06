
class NodeS{
    NodeS next;
    int data;
    NodeS(int d){
        this.data = d;
    }
}

public class stackDS {
    private NodeS top;

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        return top.data;
    }

    public void add(int data){
        // here new node is inserted and top will points to that node 
        NodeS node = new NodeS(data);
        node.next = top;
        top = node;
    }

    public int removeS(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public void printS(){
        NodeS nodeS = top;
        while(nodeS != null){
            System.out.println(nodeS.data);
            nodeS = nodeS.next;
        }
    }

    public static void main(String[] args) {
        stackDS sd  = new stackDS();

        sd.add(4);
        sd.add(67);
        sd.add(78);

        sd.printS();
    }
}
