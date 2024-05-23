package um.edu.uy.ArbolBinario;

import java.util.ArrayList;
import java.util.List;


public class ArbolBinario <T extends Comparable<T>> implements MyArbolInterface<T>{

    private T value;
    private NodeBST<T> root;

    private NodeBST<T> left;

    private NodeBST<T> right;

    public ArbolBinario(T oValue) {
        this.value = oValue;
    }


    @Override
    public void add(T oElement) {
        NodeBST<T> oElementToAdd = new NodeBST<>(oElement);
        if (root == null) {
            root = oElementToAdd;
        } else {
            root.add(oElement);
        }
    }

    @Override
    public void remove(T oElement) {
        if (root != null) {
            root.remove(oElement);
        }
    }

    @Override
    public boolean contains(T oElement) {
        return contains(oElement, root);
    }
    private boolean contains(T oElementToSearch, NodeBST<T> oTree) {
        boolean bContains = false;
        if (oTree != null) {
            int nValue = oElementToSearch.compareTo(oTree.getValue());
            if (nValue == 0) {
                bContains = true;
            } else if (nValue > 0) {
                bContains = contains(oElementToSearch, oTree.getRight());
            } else {
                bContains = contains(oElementToSearch, oTree.getLeft());
            }
        }
        return bContains;
    }

    @Override
    public T find(T oElement) {
        return find(oElement, root);
    }
    private T find(T oElementToSearch, NodeBST<T> oTree) {
        T oSearchedElement = null;
        if (oTree != null) {
            int nValue = oElementToSearch.compareTo(oTree.getValue());
            if (nValue == 0) {
                oSearchedElement = oTree.getValue();
            } else if (nValue > 0) {
                oSearchedElement = find(oElementToSearch, oTree.getRight());
            } else {
                oSearchedElement = find(oElementToSearch, oTree.getLeft());
            }
        }
        return oSearchedElement;
    }

    @Override
    public List<T> preOrder() {
        List<T> colValues = new ArrayList<T>();
        if (root != null) {
            colValues.addAll(root.preOrderTraverse());
        }
        return colValues;
    }

    @Override
    public List<T> posOrder() {
        List<T> colValues = new ArrayList<T>();
        if (root != null) {
            colValues.addAll(root.postOrderTraverse());
        }
        return colValues;
    }

    @Override
    public List<T> inOrder() {
        List<T> colValues = new ArrayList<T>();
        if (root != null) {
            colValues.addAll(root.inOrderTraverse());
        }
        return colValues;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeBST<T> getLeft() {
        return left;
    }

    public void setLeft(NodeBST<T> left) {
        this.left = left;
    }

    public NodeBST<T> getRight() {
        return right;
    }

    public void setRigth(NodeBST<T> rigth) {
        this.right = rigth;
    }

    public T findMin() {
        T oReturn = value;

        if (left != null) {

            oReturn = left.findMin();

        }

        return oReturn;
    }
}
