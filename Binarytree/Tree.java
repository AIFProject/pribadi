package Binarytree;


public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.id != key) {
            if (key < current.id) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id, String data) {
        Node newNode = new Node();
        newNode.id = id;
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.id) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }else if (id > current.id) {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                } else {
                    System.out.println("Duplicate key " + id + " not inserted");
                    return;
                }
            }
        }
    }

    public boolean delete(int key){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.id != key) {
            parent = current;
            if (key < current.id) {
                isLeftChild = true;
                current = current.left;
            } else{
                isLeftChild = false;
                current = current.left;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    private Node getSuccessor(Node delNode){
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    public void traverse(int traverseType){
        switch (traverseType) {
            case 1:
                System.out.print("Preorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("Inorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("Postordes traversal: ");
                postOrder(root);
                break;
            default:
                break;
        }
        System.out.println();
    }

    public void preOrder(Node localRoot){
        if (localRoot != null) {
            System.out.print(localRoot.id + " ");
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }

    public void inOrder(Node localRoot){
        if (localRoot != null) {
            inOrder(localRoot.left);
            System.out.print(localRoot.id + " ");
            inOrder(localRoot.right);
        }
    }
    
    public void postOrder(Node localRoot){
        if (localRoot != null) {
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.print(localRoot.id + " ");
        }
    }

    public int getMaxvalue(){
        return getMaxValue(root);
    }

    private int getMaxValue(Node localRoot){
        if (localRoot == null) {
            throw new IllegalStateException("Tree is Empty");
        }

        while (localRoot.right != null) {
            localRoot = localRoot.right;
        }
        return localRoot.id;
    }

    public int getMinvalue(){
        return getMinValue(root);
    }

    private int getMinValue(Node localRoot){
        if (localRoot == null) {
            throw new IllegalStateException("Tree is Empty");
        }

        while (localRoot.left != null) {
            localRoot = localRoot.left;
        }
        return localRoot.id;
    }

    public void displayTree(){
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j = 0; j < nBlanks; j++){
                System.out.print(' ');
            }
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.id);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    if (temp.left != null || temp.right != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(' ');
                }
            }
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
    }
}
