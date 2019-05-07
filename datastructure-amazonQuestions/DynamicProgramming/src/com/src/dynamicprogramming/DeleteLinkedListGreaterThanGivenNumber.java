package com.src.dynamicprogramming;

import org.omg.CORBA.Current;

public class DeleteLinkedListGreaterThanGivenNumber {
    
    Node head;
    
    class Node {
           int data;
           Node next;
           Node(int d) {
                  data = d;
                  next = null;
           }
    }
    
    
    Node curr = null;
    private void push(int new_data) {
           
           Node new_node = new Node(new_data);
           if(head == null) {
                  head = new_node;
                  curr = head;
           } else {
                  curr.next = new_node;
                  curr = curr.next;
           }
    }
    
    void printList() {
           Node tNode = head;
           while(tNode != null) {
                  System.out.print(tNode.data+",");
                  tNode = tNode.next;
           }
    }
    

    public static void main(String[] args) {
           
           DeleteLinkedListGreaterThanGivenNumber list = new DeleteLinkedListGreaterThanGivenNumber();
           
           
                  list.push(5);
                  list.push(4);
                  list.push(76);
                  list.push(3);
                  list.push(2);
                  list.push(1);
                  list.push(3);
                  list.push(7);
                  list.push(10);
                  //list.printList();
                  
                  //Node node = list.printMiddle();
           
                  list.printList();
                  System.out.println();
                  delete(list.head,7);
                  list.printList();

    }

    private static void delete(Node head, int val) {
           Node prev = null;
           Node curr = head;
           boolean flag= false;
           while(curr != null){
                  if(curr.data > val){
                        if(prev == null){
                               head = head.next;
                        }else{
                               prev.next = curr.next;


                        }
                        //curr = curr.next;
                        flag= true;
                  }
                 
                	if(!flag) 
                	{
                		prev = curr;
                		
                	}
                	flag=false;
               
                  curr = curr.next;
                  
           }
           
    }
    

}
