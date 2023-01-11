package com.company;

public class linkedList {

    Node head;


    public void add(toDo data, int index){
        Node newNode = new Node();
        Node current = head;
        newNode.data = data;
        if(head == null){
            head = newNode;
        }else if(index > size()){
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }else{

            for(int i = 0; i< index;i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

    }

    public int size(){
        Node current = head;
        int count = 0;
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void delete(int index){

    }

    public void completed(int index){

    }

}
