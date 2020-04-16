package Tree;


import java.util.Set;

public class Tree<D extends Comparable<D> > {

    private Node<D> root = null;

    public Node<D> getRoot() {
        return root;
    }

    public void add(D data){
        if (data == null) {
            System.out.println("Keine validen Daten");
            return;
        }
        if (root == null) {
            root = new Node<D>(data);
        }

        Node<D> workingNode = root;
        while (workingNode != null) {
            if (workingNode.getData().equals(data)) {
                return;
            }else if (workingNode.getData().compareTo(data) > 0) {
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

    public void balance() {
        Node<D>[] list = findAllElements(root);
        sort(list,0,list.length-1);
        root = buildTreeUtil(list, 0, list.length - 1);
    }

    private Node buildTreeUtil(Node<D>[] nodes, int start,int end)
    {
        if (start > end)
            return null;


        int mid = (start + end) / 2;
        Node node = nodes[mid];


        node.setLeftNode(buildTreeUtil(nodes, start, mid - 1));
        node.setRightNode(buildTreeUtil(nodes, mid + 1, end));

        return node;
    }

    private int partition(Node<D>[] arr, int low, int high)
    {
        Node<D> pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j].getData().compareTo(pivot.getData()) <0)
            {
                i++;
                Node<D> temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Node temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    private void sort(Node<D> arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);


            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }


    public Node<D>[] findAllElements(Node<D> node) {
        Node<D>[] left = null;
        Node<D>[] right = null;
        if (node.getLeftNode() != null) {
            left = findAllElements(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
             right = findAllElements(node.getRightNode());
        }
        Node<D>[] returnList;

        if (left != null) {
            if (right != null) {
                returnList = new Node[left.length + right.length + 1];
                for ( int i = 0; i < left.length; i++ ) {
                    returnList[i] = left[i];
                }
                for ( int i = left.length, j = 0; i < right.length + left.length; i++, j++ ) {
                    returnList[i] = right[j];
                }
                returnList[returnList.length - 1] = node;
            } else {
                returnList = new Node[left.length + 1];
                for ( int i = 0; i < left.length; i++ ) {
                    returnList[i] = left[i];
                }
                returnList[returnList.length - 1] = node;
            }
        } else {
            if (right != null) {
                returnList = new Node[right.length + 1];
                for ( int i = 0; i < right.length; i++ ) {
                    returnList[i] = right[i];
                }
                returnList[returnList.length - 1] = node;
            } else {
                returnList = new Node[1];
                returnList[returnList.length - 1] = node;
            }
        }
        return returnList;
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

    public void printLeafNodes(Node<D> node) {
        if (node == null) {
            return;
        }

        if (node.getLeftNode() == null && node.getRightNode() == null) {
            System.out.printf("%d ", node.getData());
        }

        printLeafNodes(node.getLeftNode());
        printLeafNodes(node.getRightNode());
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
