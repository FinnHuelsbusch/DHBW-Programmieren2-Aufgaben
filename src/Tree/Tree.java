package Tree;


import java.util.ArrayList;

public class Tree<D extends Comparable<D> > {

    private Node<D> root = null;

    public void add(D data){
        if (root == null) {
            root = new Node<D>(data);
        }
        Node<D> workingNode = root;
        while (workingNode != null) {
            if (workingNode.getData().equals(data)) {
                return;
            } else if (workingNode.getData().compareTo(data) > 0) {
                if (workingNode.getLeftNode() == null) {
                    workingNode.setLeftNode(new Node<D>(data));
                }else
                {
                    workingNode = workingNode.getLeftNode();
                }
            } else {
                if (workingNode.getRightNode() == null) {
                    workingNode.setRightNode(new Node<D>(data));
                }else
                {
                    workingNode = workingNode.getRightNode();
                }
            }
        }
    }

    public boolean contains(D data){
        if (root == null) {
            return false;
        }
        Node<D> workingNode = root;
        while (workingNode != null) {
            if (workingNode.getData().equals(data)) {
                return true;
            } else if (workingNode.getData().compareTo(data) > 0) {
                workingNode = workingNode.getLeftNode();
            } else {
                workingNode = workingNode.getRightNode();
            }
        }
        return false;
    }

    public D find(D data){
        if (root == null) {
            return null;
        }
        Node<D> workingNode = root;
        while (workingNode != null) {
            if (workingNode.getData().equals(data)) {
                return workingNode.getData();
            } else if (workingNode.getData().compareTo(data) > 0) {
                workingNode = workingNode.getLeftNode();
            } else {
                workingNode = workingNode.getRightNode();
            }
        }
        return null;
    }


    int size()
    {
        return size(root);
    }


    int size(Node node)
    {
        if (node == null)
            return 0;
        else
            return(size(node.getLeftNode()) + size(node.getRightNode()) + 1);
    }

    private class Node<D extends Comparable<D>> {

        private D data;
        private Node<D> leftNode;
        private Node<D> rightNode;

        public D getData() {
            return this.data;
        }

        public void setLeftNode(Node<D> leftNode) {
            this.leftNode = leftNode;
        }

        public Node<D> getLeftNode() {
            return this.leftNode;
        }

        public void setRightNode(Node<D> rightNode) {
            this.rightNode = rightNode;
        }

        public Node<D> getRightNode() {
            return this.rightNode;
        }

        public Node(D data) {
            this.data = data;
        }


    }
}
