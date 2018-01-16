/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {
    Stack<Node> st = new Stack<Node>();
    st.push(root);
    while (!st.isEmpty()){
        Node currentNode = st.pop();
        if (currentNode.right != null){
            st.push(currentNode.right);
        }

        if (currentNode.left != null){
            st.push(currentNode.left);
        }

        System.out.print(currentNode.data+" ");
    }
}
