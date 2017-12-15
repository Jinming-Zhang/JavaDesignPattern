package composite;

import java.util.ArrayList;

public class Tree<T> implements TreeComponent<T>{ 
    private Tree<T> left, right;
    private T root;
    public Tree(){};
	public Tree(T value){
            this.root = value; 
            left = new Leaf<T>();
            right = new Leaf<T>();
	}
    
	public Tree(Tree<T> left, T value){
	        this.left = left;
            this.root = value;
            this.right = new Leaf<T>();
	}
    
	public Tree(T value, Tree<T> right){
	        this.left = new Leaf<T>();
            this.root = value;
            this.right = right;
	}
    
	public Tree(Tree<T> left, T value, Tree<T> right){
	        this.left = left;
            this.root = value;
            this.right = right;
	}
    
    public Integer getSize(){
        Integer size = 1;

            size += this.left.getSize();
        
       
            size += this.right.getSize();
        
        return size ;
    }
    
    public Integer getHeight(){
        Integer lleft = -1;
        Integer lright = -1;

            lleft = this.left.getHeight();
        

            lright = this.right.getHeight();
        
        return Math.max(lleft, lright) + 1;
    }
    
    public ArrayList<T> flatten(){
        ArrayList<T> result = new ArrayList<T>();
        //if (this.left != null){
            result = this.left.flatten();
        //}
        result.add(this.root);
       // if (this.right != null){
            result.addAll(this.right.flatten());
        //}
        return result;
    }
}