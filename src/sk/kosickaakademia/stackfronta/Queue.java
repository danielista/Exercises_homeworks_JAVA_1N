package sk.kosickaakademia.stackfronta;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private int capacity;
    private List<T> array;

    public Queue (int c){
        this.capacity=c;
        array=new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize(){
        return array.size();
    }

    public boolean isEmpty(){
        return array.isEmpty();
    }

    public boolean isFull(){
        return capacity==array.size();
    }

    public void enqueue(T value) throws QueueException {
        if(isFull()){
          //  System.out.println("Queue is full");
            throw new QueueException("Queue is FULLLL!!!");
        }
        else{
            array.add(value);
        }
    }

    public void dequeue() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Queue is empty!!!");
        }
        else
            array.remove(0);
    }

    public T front() throws QueueException {
        if(isEmpty()){
           // System.out.println("Queue is empty");
            throw new QueueException("Queue is empty!!!");
           // return null;
        }
        else
            return array.get(0);

    }

    public void print(){
        System.out.println();
        for(T t:array)
            System.out.print(t+"  ");
    }

    public void clear(){
        array.clear();
    }

}