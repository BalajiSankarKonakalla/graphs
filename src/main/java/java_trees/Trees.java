package java_trees;

public class Trees {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(4,new BinaryTree(2,new BinaryTree(1), new BinaryTree(3)),new BinaryTree(6, new BinaryTree(5), new BinaryTree(7)));
        BinaryTree.inOrder(tree);
    }
}
