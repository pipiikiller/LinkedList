package model;

public class Item {

    private String instances;

    Item(String elements){

        this.instances=elements;
    }

    public String getInstances(){

        return instances;
    }
    public String toString(){
    	
    	return ""+this.getInstances();
    }
}
