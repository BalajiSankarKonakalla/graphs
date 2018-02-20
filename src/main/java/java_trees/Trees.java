package java_trees;

public class Trees {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(4,new BinaryTree(2,new BinaryTree(1), new BinaryTree(3)),new BinaryTree(6, new BinaryTree(5), new BinaryTree(7)));
        inOrder(tree);
    }

    private static void inOrder(BinaryTree t){
        if(t.is_leaf())
            System.out.println("-->" + t.value);
        else {
            inOrder(t.left);
            System.out.println("-->" + t.value);
            inOrder(t.right);
        }
    }
}
