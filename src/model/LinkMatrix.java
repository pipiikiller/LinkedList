package model;

public class LinkMatrix {
	
	private Node head;
	private int size;
	
	public void add(Object data){
		
		Node temp= new Node(data);
		Node current= head;
		
		if(head==null){
			head=temp;
		}else{
			
			while(current.getNext()!=null){
				current= current.getNext();
				
			}
			current.setNext(temp);
		}
				
		this.size++;
	}
	public int getSize(){
		
		return this.size;
	}
	
	public String toString() {
	    String list = "";
	    list += "[" + this.head.getData() + "]";

	    Node curr = head.getNext();
	    while (curr != null){
	        list += "[" + curr.getData() + "]";
	        curr = curr.getNext();
	    }

	    return list;

	}

		
	}
	
