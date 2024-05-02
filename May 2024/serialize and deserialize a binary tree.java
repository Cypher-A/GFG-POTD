class Tree {
    class Passing {
        int index;
    }

    public void serializeUtil(Node root, ArrayList<Integer> A) {
        if (root == null) {
            A.add(-1);
            return;
        }

        A.add(root.data);

        serializeUtil(root.left, A);
        serializeUtil(root.right, A);
    }

    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        serializeUtil(root, list);

        return list;
    }

    public Node kewl(ArrayList<Integer> A, Passing ps) {
        // base case if there are no more elements in list.
        if (ps.index == A.size() || A.get(ps.index) == -1) {
            ps.index += 1;
            return null;
        }
        Node root = new Node(A.get(ps.index));
        ps.index += 1;

        root.left = kewl(A, ps);
        root.right = kewl(A, ps);
        return root;
    }

    public Node deSerialize(ArrayList<Integer> A) {
        Passing ps = new Passing();
        ps.index = 0;
        // returning the tree.
        return kewl(A, ps);
    }
}

