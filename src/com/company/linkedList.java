package com.company;

public class linkedList {

    Node head;


    public void add(toDo data, int index){
        Node newNode = new Node();
        Node current = head;
        newNode.data = data;
        if(head == null){
            head = newNode;
        } else if(index > size() || size() < 3){
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
        count++;
        return count;
    }

    public boolean delete(int index){
int currentSize = size();
        Node current = head;
        for(int i = 0; i< index; i++){
            current = current.next;

        }

        current.next = current.next.next;
        int sizeAfter = size();
        if(currentSize > sizeAfter){
            return true;
        }else{
            return false;
        }
    }

    public void completed(int index){

    }

    public void list(){
        Node current = head;
        int count = 0;
        if(size() == 0) {
        System.out.println("list is empty right now :(");
        }
       else if(size() == 1){
            System.out.println("Index " + count + ": " + "Title: " + "'" + current.data.title + "'" + ", " + "Description: " + "'" + current.data.desc + "'");

        }else {
            while (current.next != null) {
                System.out.println("Index " + count + ": " + "Title: " + "'" + current.data.title + "'" + ", " + "Description: " + "'" + current.data.desc + "'");
                count++;
                current = current.next;
            }

            System.out.println("Index " + count + ": " + "Title: " + "'" + current.data.title + "'" + ", " + "Description: " + "'" + current.data.desc + "'");
        }


    }

}
