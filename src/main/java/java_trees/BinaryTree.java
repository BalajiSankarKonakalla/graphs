package java_trees;

public class BinaryTree {

    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value){
        this.value = value;
        left = null;
        right = null;
    }
    public BinaryTree(int value, BinaryTree left, BinaryTree right){
        this.left = left;
        this.right = right;
        this.value = value;
    }
    public boolean is_leaf(){
        return right == null && left == null;
    }
}
