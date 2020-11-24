package sk.kosickaakademia.stackfronta;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(3);
        Queue<Integer> rad = new Queue<>(2);
        try {
            stack.push(45);
            stack.push(9);
            stack.print();
            stack.push(12);
            stack.print();


            rad.enqueue(5);

            rad.enqueue(3);
            rad.print();


        }catch(StackException ex){
            ex.printStackTrace(); //System.out.println(ex.getMessage());
        }catch (QueueException eq){
            eq.printStackTrace(); //System.out.println(ex.getMessage());
        }
    }
}