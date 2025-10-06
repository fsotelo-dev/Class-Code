package Section52.Week3;

//List is an Abstract Data Type (ADT): What?
//Ordered sequence of elements
//Operations: add an item, remove an item, iterate through the list, etc.

// How to implement a list? -> Using Data Structure (Array, Linked List)

public class ListExtend {
    // Attributes
    private String[] data;
    private int size;
    public static final int DEFAULT_CAPACITY = 50;

    // Constructor(s)
    public ListExtend(){
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public ListExtend(int capacity){
        data = new String[capacity];
        size = 0;
    }

    //Other Methods
    public boolean isEmpty(){ return size == 0;}

    //Add a new item at the end of the list
    public void append(String s){
        if(size < data.length) {
            data[size++] = s; // incremeant and pass
        } else{
            System.out.println("List is full");
        }
    }

    //Add a new item at a given position
    //0 1 2 3 [Array Index]
    //O A B _
    //O O A B (Example to add an item at location 0)
    //K O A B
    public void insert(String s, int index){
        if(size >= data.length){
            System.out.println("List is full");
        } else if(index < 0 || index > size){
            System.out.println("Invalid index");
        } else{
            //Right
            for(int i = size; i > index; i--){
                data[i] = data[i-1];
            }
            data[index] = s;
            size++;
        }
    }

    //Remove an item given the location
    public void delete(int index){
        if(isEmpty()){
            System.out.println("List is empty");
        } else if(index < 0 || index >= size){ //Invalid Index
            System.out.println("Invalid index");
        } else{
            //Shift left
            for(int i = index; i < size - 1; i++){
                data[i] = data[i + 1];
            }
            //If you are not using an object, set it to null
            data[size - 1] = null;
            size--;
        }
    }

    public String toString(){
        if (isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < size; i++){
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }
}
