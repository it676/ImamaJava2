
class StackOverFlowException extends RuntimeException {

    public StackOverFlowException(String msg) {

        super(msg);
    }

}

class StackUnderFlowException extends RuntimeException {

    public StackUnderFlowException(String msg) {

        super(msg);
    }
}

interface Stack<E> {

    public abstract boolean isEmpty();

    public abstract int size();

    public E top();

    public void push(E element);

    public E pop();
}

class StackArray<E> implements Stack<E> {

    //data 
    E[] stack;
    int top;

    public StackArray(int size) {

        stack = (E[]) new Object[size];
        top = -1;

    }

    @Override
    public boolean isEmpty() {

        return top == -1;

    }

    @Override
    public int size() {

        return top + 1;
    }

    @Override
    public void push(E element) {

        if (top == stack.length - 1) {
            throw new StackOverFlowException("Stack is OverFlow");
        }

        stack[++top] = element;
    }

    @Override
    public E top() {

        if (isEmpty()) {
            throw new StackUnderFlowException("Stack is underflow !");
        }

        return stack[top];

    }

    @Override
    public E pop() {

        if (isEmpty()) {
            throw new StackUnderFlowException("Stack is underflow !");
        }

        return stack[top--];

    }
}

class StackDemo {

    public static void main(String[] args) {

        Stack<String> stack = new StackArray<>(10);

        System.out.println("isEmpty ? " + stack.isEmpty());//true
        System.out.println("size:  " + stack.size());//0

        stack.push("Sara");
        stack.push("Amal");
        stack.push("Reem");
        stack.push("Rayan");

        System.out.println("isEmpty ? " + stack.isEmpty());//false
        System.out.println("size:  " + stack.size());//4

        System.out.println(stack.top());//Rayan

        System.out.println(stack.pop());//Rayan
        System.out.println("size:  " + stack.size());//3

        System.out.println(stack.top());//Reem
        
        stack.push("Anas");
        
        System.out.println("size:  " + stack.size());//4

         System.out.println(stack.top());//Anas

    }
}
