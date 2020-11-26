import java.util.*;

public class RedBlackTreeMap<TKey extends Comparable<TKey>, TValue> {
	private class Node {
		private TKey mKey;
		private TValue mValue;
		private Node mParent;
		private Node mLeft;
		private Node mRight;
		private boolean mIsRed;

		public Node(TKey key, TValue data, boolean isRed) {
			mKey = key;
			mValue = data;
			mIsRed = isRed;

			mLeft = NIL_NODE;
			mRight = NIL_NODE;
      mParent = null;
		}

		@Override
		public String toString() {
			return mKey + " : " + mValue + " (" + (mIsRed ? "Red)" : "Black)");
		}
	}

	private Node mRoot;
	private int mCount;

	private final Node NIL_NODE = new Node(null, null, false);

	public int getCount() {
		return mCount;
	}

	public TValue find(TKey key) {
		Node n = bstFind(key, mRoot); 
		if (n == null || n == NIL_NODE)
			throw new RuntimeException("Key not found");
		return n.mValue;
	}

	public void add(TKey key, TValue data) {
		Node n = new Node(key, data, true); // nodes start red

		boolean insertedNew = bstInsert(n, mRoot);
		if (!insertedNew)
			return;

		checkBalance(n);
	}


	private void checkBalance(Node n) {
		if (n == mRoot) {
			n.mIsRed = false;
			return;
		}

		Node p = n.mParent;
		if (p.mIsRed == false) {
			return;
		} else {

			Node unc = getUncle(n);
			Node grandP = getGrandparent(n);

			if (unc.mIsRed == true) {
				p.mIsRed = false;
				unc.mIsRed = false;
				grandP.mIsRed = true;

				if (grandP == mRoot || grandP.mParent.mIsRed == true)
					checkBalance(getGrandparent(n));

			} else if (getUncle(n).mIsRed == false) {
				if (grandP == null) {
					return;
				}

				if (grandP.mLeft.mRight == n) {
					singleRotateLeft(p);
				} else if (grandP.mRight.mLeft == n) {
					singleRotateRight(p);
				}

				if (grandP.mLeft == n || grandP.mLeft.mLeft == n) {
					singleRotateRight(grandP);
					grandP.mParent.mIsRed = false;
					grandP.mIsRed = true;

				} else if (grandP.mRight == n || grandP.mRight.mRight == n) {
					singleRotateLeft(grandP);
					grandP.mParent.mIsRed = false;
					grandP.mIsRed = true;
				}
			}
		}
	}

	public boolean containsKey(TKey key) {

		Node n = bstFind(key, mRoot); 
		return (n == null) ? false : true;

	}


	public void printStructure() {
		printStructure(mRoot);

	}

	private void printStructure(Node n) {
		if (n == null || n == NIL_NODE)
			return;
		System.out.println(n.toString());
		printStructure(n.mLeft);
		printStructure(n.mRight);
	}

	private Node bstFind(TKey key, Node currentNode) {
		if (currentNode == null || currentNode == NIL_NODE)
			return null;

		int compare = currentNode.mKey.compareTo(key);
    
		if (compare > 0) {
      return bstFind(key, currentNode.mLeft);

		} else if (compare < 0) {
      return bstFind(key, currentNode.mRight);

		} else if (compare == 0) {
			return currentNode;

		} else {
			return null;
		}
	}

	private Node getGrandparent(Node n) {
		if (n.mParent.mParent != null)
			return (n.mParent.mParent);

		else
			return null;
	}

	private Node getUncle(Node n) {
		Node grandP = getGrandparent(n);
		if (grandP == null)
			return null;
		else if (grandP.mLeft == n.mParent)
			return grandP.mRight;
		else
			return grandP.mLeft;
	}

	private void singleRotateRight(Node n) {
		Node l = n.mLeft, lr = l.mRight, p = n.mParent;
		n.mLeft = lr;
		lr.mParent = n;
		l.mRight = n;
		n.mParent = l;

		if (p == null) { // n is root
			mRoot = l;
		} 
    else if (p.mLeft == n) {
			p.mLeft = l;
		}
    else {
			p.mRight = l;
		}

		l.mParent = p;
	}

	private void singleRotateLeft(Node n) {
		Node r = n.mRight, rl = r.mLeft, p = n.mParent;
		n.mRight = rl;
		rl.mParent = n;
		r.mLeft = n;
		n.mParent = r;

		if (p == null) { // n is root
			mRoot = r;
		} 
    else if (p.mLeft == n) {
			p.mLeft = r;
		} 
    else {
			p.mRight = r;
		}

		r.mParent = p;
	}


	private boolean bstInsert(Node newNode, Node currentNode) {
		if (mRoot == null) {
      mCount++;
			mRoot = newNode;
			return true;
		}
    else {
			int compare = currentNode.mKey.compareTo(newNode.mKey);
			if (compare < 0) {

				if (currentNode.mRight != NIL_NODE) {
					return bstInsert(newNode, currentNode.mRight);
				} 
        else {
					currentNode.mRight = newNode;
					newNode.mParent = currentNode;
					mCount++;
					return true;
				}
			} 
      else if (compare > 0) {
				if (currentNode.mLeft != NIL_NODE) {
					return bstInsert(newNode, currentNode.mLeft);
				} 
        else {
					currentNode.mLeft = newNode;
					newNode.mParent = currentNode;
					mCount++;
					return true;
				}
			} 
      else {
				currentNode.mValue = newNode.mValue;
				return false; 
			}
		}
	}
}