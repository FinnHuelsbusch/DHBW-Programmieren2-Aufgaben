public class stack<D> {

    Node<D> topNode = null;

    // lege ein Element auf den Stack
    public void push(D data){
        if (topNode == null) {
            topNode = new Node<D>(data);
        } else {
            Node workingNode = new Node<D>(data);
            workingNode.setNextNode(topNode);
            topNode = workingNode;
        }
    }

    // nehme das oberste Element vom Stack runter
    public D pop(){
        Node<D> workingNode = topNode;
        topNode = topNode.nextNode;
        return workingNode.getData();
    }

    // zeige das oberste Element vom Stack
    public D peek(){
        return topNode.getData();
    }


    private class Node<D>{

        private D data;
        private Node<D> nextNode;

        public Node(D data){
            this.data = data;
        }

        public Node<D> getNextNode(){
            return this.nextNode;
        }

        public D getData(){
            return this.data;
        }

        public void setNextNode(Node<D> node) {
            nextNode = node;
        }


    }
}