package ownwork;

/*The complement of a queue is a stack. It uses first-in, last-out accessing and is often likened
to a stack of plates. The first plate put on the table is the last plate used. Create a stack class
called Stack that can hold characters. Call the methods that access the stack push( ) and
pop( ). Allow the user to specify the size of the stack when it is created. Keep all other
members of the Stack class private. (Hint: you can use the Queue class as a model; just
change the way the data is accessed.)*/

// A stack class for characters.
class Stack {
    private char stck[]; // this array holds the stack
    private int tos; // top of stack
    // Construct an empty Stack given its size.
    Stack(int size) {
        stck = new char[size]; // allocate memory for stack
        tos = 0;
    }
    // Construct a Stack from a Stack.
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
// copy elements
        for(int i=0; i < tos; i++)
            stck[i] = ob.stck[i];
    }
    // Construct a stack with initial values.
    Stack(char a[]) {
        stck = new char[a.length];
        for(int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }
    // Push characters onto the stack.
    void push(char ch) {
        if(tos==stck.length) {
            System.out.println(" –- Stack is full.");
            return;
        }
        stck[tos] = ch;
        tos++;
    }
    // Pop a character from the stack.
    char pop() {
        if(tos==0) {
            System.out.println(" –- Stack is empty.");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}
// Demonstrate the Stack class.
class StDemo {
    public static void main(String args[]) {
// construct 10-element empty stack
        Stack stk1 = new Stack(10);
        char name[] = {'T', 'o', 'm'};
// construct stack from array
        Stack stk2 = new Stack(name);
        char ch;
        int i;
// put some characters into stk1
        for(i=0; i < 10; i++)
            stk1.push((char) ('A' + i));
// construct stack from another stack
        Stack stk3 = new Stack(stk1);
//show the stacks.
        System.out.print("Contents of stk1: ");
        for(i=0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Contents of stk2: ");
        for(i=0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of stk3: ");
        for(i=0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
