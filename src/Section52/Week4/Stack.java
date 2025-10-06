public class Stack {
    private String[] data;
    private int top;  // points to the next open slot
    private int capacity;

    // Constructor
    public Stack(int size) {
        capacity = size;
        data = new String[capacity];
        top = 0;
    }

    // Push operation
    public void push(String value) {
        if (isFull()) {
            System.out.println("Error: Stack overflow");
            return;
        }
        data[top] = value;
        top++;
    }

    // Pop operation
    public String pop() {
        if (isEmpty()) {
            System.out.println("Error: Stack underflow");
            return null;
        }
        top--;
        return data[top];
    }

    // Peek (view top element)
    public String peek() {
        if (isEmpty()) {
            System.out.println("Error: Stack is empty");
            return null;
        }
        return data[top - 1];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == 0;
    }

    // Check if full
    public boolean isFull() {
        return top == capacity;
    }

    // Size of stack
    public int size() { return top; }

    // Print stack contents
    public void printStack() {
        System.out.print("Stack (bottom → top): ");
        for (int i = 0; i < top; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
