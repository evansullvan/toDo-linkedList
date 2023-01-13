package com.company;

import java.util.List;

public class toDoSystem {

    private linkedList books = new linkedList();

    public static void main(String []args){
        toDoSystem td1 = new toDoSystem();

        td1.run();
    }

    public int MainMenu(){
        System.out.println("      toDo System menu");
        System.out.println("  ***************");
        System.out.println("1) add");
        System.out.println("2) delete");
        System.out.println("3) list all toDos");
        System.out.println("3) completed");

        System.out.println("  0) Exit");
        System.out.println("");

        int choice = EasyScanner.nextInt();
        return choice;
    }

    public void run(){
        int option = MainMenu();

        while(option != 100 ){
            switch(option){

                case 1:
                    addToDo();

                    break;

                case 2:
                    deleteToDo();
                    break;

                case 3:
                    ListToDos();
                    break;

                case 4:
                    // completeToDo();
                    break;
                case 0:
                    sure();
                    break;

                default:System.out.println("error.. number selected does not exist");

            }
            option = MainMenu();
        }
    }

    public void sure(){
        int choice2;
        System.out.println("Are you sure you saved the files?");
        System.out.println("1) No");
        System.out.println("2) Yes");
        choice2 = EasyScanner.nextInt();

        if(choice2 == 1){
            System.out.println("Save the files");
            MainMenu();

        }
        else if(choice2 == 2){
            System.out.println("Are you SURE YOUR SURE??!!");
            System.out.println("1) Yes");
            System.out.println("2) No");
            int choice4 = EasyScanner.nextInt();
            if(choice4 == 1){
                System.out.println("ok");
                System. exit(0);
            }else if(choice4 == 2){
                System.out.println("Your lucky I asked you twice...");
                MainMenu();
            }

        }
    }

  public void  addToDo(){
      System.out.println("Add to ToDo list");
      System.out.println("Enter Title: ");
      String title = EasyScanner.nextString();
      System.out.println("Enter Description");
      String desc = EasyScanner.nextString();
      System.out.println("Enter index to put toDo in: ");
     // ListToDos();
      int index = EasyScanner.nextInt();
      toDo toDo1 = new toDo(title,desc);
      books.add(toDo1,index);
  }

   public void ListToDos(){
        books.list();
    }


    public void deleteToDo(){


        books.list();
        System.out.println("enter the index you wish to delete: ");
        int index = EasyScanner.nextInt();
        if(books.delete(index)){
            System.out.println("todo deleted successfully");
        }else{
            System.out.println("todo deleted unsuccessfully");
        }
    }
}


