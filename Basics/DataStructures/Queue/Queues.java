
class  Queues {
    int size;
    int [] que_Arr;
    int front , rear;

    Queues(int x){
        size = x;
        que_Arr = new int[x];
        front = -1;
        rear = -1;
    }

    boolean isEmpty(){
        return front == -1;
    }

    boolean isFull(){
        return rear == size - 1 && front == 0;
    }

    void enque(int value){
        if(isFull()){
            System.out.println("Queue is Full");
        }else{
                if(front==-1){
                    front=0;
                }
                rear++;
                que_Arr[rear] = value;
                //System.out.println(rear);
        }
    }

    int deque(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return (-1);
        }else{
            element = que_Arr[front];
            if(front>=rear){
                front = -1;
                rear = -1;
            }
            else{
                front++;
            }
        }
        return element;
    }

    int qpeek(){
        return que_Arr[front];
    }

    void qprint(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            System.exit(1);
        }else{
            for(int i =front;i<=rear;i++){
                System.out.print(i+" ");
                System.out.println(que_Arr[i]+" ");
            }
        }
    }

    public static void main(String[]args){
        Queues que = new Queues(5);

        System.out.println(que.isEmpty());

        //System.out.println(que.deque());

        que.enque(20);
        que.enque(3);
        que.enque(1);
        que.enque(54);
        que.enque(12);

        que.qprint();
        System.out.println();
        System.out.println(que.qpeek());

        que.deque();

        System.out.println();

        System.out.println(que.qpeek());

        System.out.println();
        que.qprint();
    }
}
