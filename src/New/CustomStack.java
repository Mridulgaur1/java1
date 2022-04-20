package New;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE =10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }
    public boolean push (int item) {
        if(isFull()){
            System.out.println("STACK IS FULL");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;

    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek  from an empty stack!");
        }
        return data[ptr];
    }

    private boolean isFull() {
       return ptr ==data.length-1; // ptr is at last index
    }
    private boolean isEmpty(){
        return ptr==-1;
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
