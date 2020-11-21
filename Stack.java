import java.util.LinkedList;

class Test{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("Stack before changes");
        System.out.println("size() "+stack.size());
        System.out.println("isEmpty() "+stack.isEmpty());
        System.out.println(stack.toString());
        System.out.println("peek() "+stack.peek());
        System.out.println("Stack after changes");
        System.out.println("pop() "+stack.pop());
        System.out.println("pop() "+stack.pop());
        System.out.println("pop() "+stack.pop());
        System.out.println("size() "+stack.size());
        System.out.println(stack.toString());
        System.out.println("Stack after calling clear();");
        stack.clear();
        System.out.println("size() "+stack.size());
    }
}
public class Stack<T> {
   private LinkedList<T> storage = new LinkedList<>();
   public void push(T e){
       storage.addFirst(e);
   }
   public T pop(){
      return storage.removeFirst();
   }
    public T peek(){
        return storage.getFirst();
    }
   public int size(){
       return storage.size();
   }
   public boolean isEmpty(){
       return storage.isEmpty();
   }
   public void clear(){
       storage.clear();
   }
   public String toString(){
       return storage.toString();
   }
}
