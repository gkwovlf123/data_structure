package dataStructure;

public class BSTNode <Key extends Comparable<Key>, Value> { 
		private Key id;
		private Value name;
		private BSTNode<Key, Value> left, right;
		
public BSTNode(Key newId, Value newName) { // ��� ������ id = newId;
	name = newName;
	left = right = null; }
	// get�� set �޼ҵ��
public Key getKey() { 
	return id; 
	}

public Value getValue() { 
	return name; 
	}

public BSTNode<Key, Value> getLeft() { 
	return left; 
	}

public BSTNode<Key, Value> getRight() { 
	return right;
	}
public void setKey(Key newId) { 
	id = newId; 
	}

public void setValue(Value newName) { 
	name = newName; 
	}

public void setLeft(BSTNode<Key, Value> newLeft) { 
	left = newLeft; 
	} 

public void setRight(BSTNode<Key, Value> newRight){ 
	right = newRight;
	}
}