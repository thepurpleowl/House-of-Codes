
class Stacks {
    int capacity;
    int [] arr;
    int top;

    Stacks(int x){
        arr = new int[x];
        capacity = x;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public void pushTo(int element){
        if(!isFull()){
            arr[++top] = element;
        }
        else{
            System.out.println("StackOverflow");
            System.exit(1);
        }
    }

    public void popFrom(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        top--;
    }

    public int peek(){
        return arr[top];
    }

    public int sizeOf(){
        return top + 1;
    }

    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.println("| "+arr[top-i]+" |");
            System.out.println(" ____ ");
        }
    }

    public static void main(String[] args) {

        Stacks st = new Stacks(5);

        System.out.println("Checking before inserting elements onto Stack : "+st.isEmpty());
        System.out.println("Checking Whether is Full or not : "+st.isFull());

        st.pushTo(14);
        st.pushTo(25);
        st.pushTo(10);
        st.pushTo(5);
        st.pushTo(56);

        System.out.println("Checking after inserting elements onto Stack : "+st.isEmpty());

        System.out.println(st.sizeOf());

        System.out.println(st.isFull());

        System.out.println("Peek : "+st.peek());
        System.out.println();

        System.out.println("Before Pop Operation");
        st.printStack();
        System.out.println();
        System.out.println("After Pop Operation");

        st.popFrom();

        st.printStack();

    }

}

