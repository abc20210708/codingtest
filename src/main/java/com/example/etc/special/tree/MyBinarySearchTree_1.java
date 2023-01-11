package com.example.etc.special.tree;

public class MyBinarySearchTree_1 {
    public MyNode root;
    public Integer size;

    public MyBinarySearchTree_1() {
        this.root = null;
        this.size = 0;
    }

    // Function to perform inorder traversal on the BST
    public void inorder(MyNode root)
    {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public boolean insert(Integer data) {
        MyNode newNode = new MyNode(data);
        MyNode cursor = this.root;
        // case 1 :트리가 비어있는 경우
        if (root == null) {
            this.root = newNode;
            size++;
        } else {
            // case 2 : 최소 1개 이상의 노드가 트리에 존재하는 경우
            while (true) {
                // case 2-1 : 커서가 가리키고 있는 노드가 새로운 노드보다 큰 경우
                //            // 				커서를 트리의 왼쪽 방향으로 이동한다
                if (cursor.value > data) {
                    if (cursor.left == null) {
                        cursor.left = newNode;
                        return true;
                    } else {
                        cursor = cursor.left;
                    }
                    // case 2-2 : 커서가 가리키고 있는 노드가 새로운 노드보다 작거나 같은 경우
                    //                //				커서를 트리의 오른쪽 방향으로 이동한다
                } else {
                    if (cursor.right == null) {
                        cursor.right = newNode;
                        return true;
                    } else {
                        cursor = cursor.right;
                    }
                }
            }
        }
        return false;
    }

    public MyNode search(Integer data) {
        MyNode cursor = this.root;

        while(true) {
            if(cursor == null) {
                System.out.println(data+" not exists");
                return null;
            }

            if(cursor.value == data) {
                return cursor;
            } else {
                if(data > cursor.value) {
                    cursor = cursor.right;
                } else {
                    cursor = cursor.left;
                }
            }
        }
    }


    public MyNode remove(MyNode root, int data) {
        MyNode parent = null;
        MyNode cursor = root;

        // 커서가 데이터를 찾거나 종단노드에 닿을때까지 이동
        while (cursor != null && cursor.value != data) {
            parent = cursor;
            if(data < cursor.value) {
                cursor = cursor.left;
            } else {
                cursor = cursor.right;
            }
        }

        // 데이터가 존재하지 않는 경우
        if(cursor == null) {
            System.out.println(data+" not exists");
            return null;
        }

        // 삭제될 노드가 자식노드가 없는 경우
        if(cursor.left == null && cursor.right == null) {
            if(cursor != root) {
                if(parent.left == cursor) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else {
                root = null;
            }
        }

        // 삭제될 노드가 두개의 자식 노드를 지닌 경우
        else if (cursor.left != null && cursor.right != null) {
            // 삭제될 노드와 그 부모노드 사이의 최소 값을 지닌 노드를 찾는다.
            MyNode temp = findMinNode(cursor.right);
            int tempValue = temp.value;

            // 최소값 노드를 삭제 후, 삭제될 노드에 최소값을 삽입한다.
            remove(root, temp.value);
            cursor.value = tempValue;
        }

        // 삭제될 노드가 한개의 자식만 지닌 경우
        else {
            MyNode child = (cursor.left != null) ? cursor.left : cursor.right;

            if(cursor != root) {
                if(cursor == parent.left) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            } else {
                root = child;
            }
        }

        return root;
    }

    MyNode findMinNode(MyNode cursor) {
        while (cursor != null) {
            cursor = cursor.left;
        }
        return cursor;
    }



}

class MyNode {
    public MyNode left;
    public MyNode right;
    public Integer value;

    public MyNode(int data) {
        this.value = data;
        this.left = null;
        this.right = null;
    }

    public void print() {
        System.out.println("--------------------------");
        System.out.println("this node's value is " + this.value);
        if(this.left != null) {
            System.out.println("left side is " + this.left.value);
        } else {
            System.out.println("left side is empty.");
        }
        if(this.right != null) {
            System.out.println("right side is " + this.right.value);
        } else {
            System.out.println("right side is empty.");
        }

        System.out.println("--------------------------");

    }
}