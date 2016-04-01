package model;

import java.util.Comparator;

public class Node {

    Node next;
    Object data;

    Node(Object data){
        this.data=data;

    }
    Node(Object data, Node next){

        this.data= data;
        this.next=next;
    }
    public void setData(Object data){
        this.data= data;

    }

    public void setNext(Node next){
    this.next= next;


    }
  
    
  
    public Node getNext(){
    	
    return this.next;
    }

    public Object getData(){

        return this.data;
    }
 public String toString(){
    	
    	return  ""+this.data;
    }
}

