package Stack;

public class stack<T> {
    private T[] valeus;
    private int top;

    public stack(Integer capacity){
        this.valeus = new T[capacity];
        top = 0;
    }

    public boolean isEmpty() {
        for(Integer i : valeus){
            if(i!= null){
                return false;
            }
        }
        return true;
    }

    public void push(T valeu) {
        if (top == valeus.length) {
            throw new IllegalStateException("Stack is full");
        }
        if(!isEmpty()){
            top++;
        }
        valeus[top] = valeu;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Integer NewValeus = valeus[top];
        valeus[top] = null;
        if(top - 1 >= 0 ){
            top--;
        }
        return NewValeus;
    }

    public int peek(){
        if(this.valeus[this.top] == null){
            return 0;
        }
        return this.valeus[this.top];

    }
}
