package trees

import scala.collection.mutable

abstract class BinaryTree
case class Node(value: Int, left: BinaryTree, right: BinaryTree) extends BinaryTree
case class Leaf(value: Int) extends BinaryTree

object Trees {

  def main(args: Array[String]): Unit = {
    val t = Node(4, Node(2,Leaf(1),Leaf(3)), Node(6,Leaf(5),Leaf(7)));
    preOrder(t)
  }

  def inOrder(t: BinaryTree) {
    t match {
      case Node(v, left, right) =>
        inOrder(left)
        print(" " + v.toString)
        inOrder(right)
      case Leaf(v) =>
        print(" "+ v.toString)
    }
  }

  def inOrderIterative(t: BinaryTree) {
    val stack = mutable.Stack[BinaryTree]()
    stack.push(t)
    while (stack.nonEmpty)
    stack.pop() match {
      case Node(v, left, right) =>
        stack.push(right)
        stack.push(Leaf(v))
        stack.push(left)
      case Leaf(v) =>
        println( "--> " + v.toString )
    }
  }

  def preOrder(t:BinaryTree): Unit = {
    val stack = mutable.Stack[BinaryTree]()
    stack.push(t)
    while (stack.nonEmpty)
    stack.pop() match {
      case Node(v, left, right) =>
        stack.push(right)
        stack.push(left)
        stack.push(Leaf(v))
      case Leaf(v) =>
        println("---> " + v.toString)
    }
  }
}
