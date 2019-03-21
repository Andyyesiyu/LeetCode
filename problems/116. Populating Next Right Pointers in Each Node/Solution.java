/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            int numNode = queue.size();
            for (int i = 0; i < numNode - 1; i++) {
                Node node = queue.remove();
                node.next = queue.element();
                if (node.left != null) {
                    // Perfect binary tree, must have left AND right.
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            Node node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return root;
    }
}