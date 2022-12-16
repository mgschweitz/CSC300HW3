enum NodeState{
	empty_since_start, //0
	empty_after_delete, //1
	regular; //2
}

public class Steve {
	public HashNodeTwo[] buckets;
	public int Size;
	public int Count;
	private final float Threashold = 0.7f;
	private final int initialSize = 10;
	
	public Steve() {
		this.buckets = new HashNodeTwo[initialSize];
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = HashNodeTwo.emptySinceStartNode(i);
		}
	}
	
	private int GetHash(int key) {
		int hashValue = Integer.hashCode(key);
		return hashValue % this.Size;
	}
	
	//add
	public void HashInsert(int key, int value) throws Exception {
		int hashCode = this.GetHash(key);
		HashNodeTwo newNode = new HashNodeTwo(0, 0, hashCode);
		HashNodeTwo bucket = this.buckets[hashCode];
		if (bucket.State == NodeState.empty_since_start ||
			bucket.State == NodeState.empty_after_delete) {
			this.buckets[hashCode] = newNode;
			this.Count++;
			//resize if needed
		} else {
			int nextkey = hashCode;
			do {
				nextkey = (hashCode) + 1 % this.Size;
				bucket = this.buckets[nextkey];
			} while (bucket.State == NodeState.regular &&
					nextkey != hashCode);
			if (nextkey != hashCode) {
				this.buckets[nextkey] = newNode;
				this.Count++;
				//resize if needed
			} else {
				throw new Exception("The hash table is full.");
			}
		}
	}
	
	
	//get
	public HashNodeTwo Get(int key) {
		//get hash code
		int hashCode = this.GetHash(key);
		//look up on the array
		HashNodeTwo curr = this.buckets[hashCode];
		int nextKey = hashCode;
		if (curr.State == NodeState.empty_since_start) {
			return null;
		} else if (curr.State == NodeState.empty_after_delete || 
				curr.Key != key) {
			//we need to check the next opening address
			nextKey = (nextKey + 1) % this.Size;
			curr = this.buckets[nextKey];
			while (curr.State != NodeState.empty_since_start && 
					nextKey != hashCode) {
				if (curr.State == NodeState.empty_after_delete ||
						curr.Key != key) {
					nextKey = (nextKey + 1) % this.Size;
					curr = this.buckets[nextKey];
				} else {
					return curr;
				}
			}
			return null;
		} else {
			return curr;
		}
		//check the key and the key on the bucket
		//if not, look at the next position
		//keep on searching until we searched all the positions or
		//until we meet empty-since-start
	}
	
	
	//remove
	public void Remove(int key) {
		int hashCode = this.GetHash(key);
		int nextkey = hashCode;
		HashNodeTwo curr = this.buckets[nextkey];
		if (curr.State == NodeState.empty_since_start) {
			return;
		} else if (curr.State == NodeState.regular &&
				curr.Key == (key)) {
			this.buckets[nextkey] = HashNodeTwo.emptyAfterDeleteNode(nextkey);
			return;
		} else {
			nextkey = (nextkey + 1) % this.Size;
			curr = this.buckets[nextkey];
			while (curr.State == NodeState.empty_after_delete ||
					(curr.State == NodeState.regular && curr.Key
					!= key) || nextkey == hashCode){
				nextkey = (nextkey + 1) % this.Size;
				curr = this.buckets[nextkey];
			}
			if (nextkey == hashCode) {
				return;
			} else if (curr.State == NodeState.empty_since_start) {
				return;
			} else {
				this.buckets[nextkey] = HashNodeTwo.emptyAfterDeleteNode(nextkey);
				return;
			}
		}
	}
	
	
	//resize
	void Resize() throws Exception {
		if (!this.IsChuncky()) {
			return;
		}
		HashNodeTwo[] originalBuckets = this.buckets;
		this.Count = 0;
		this.Size = this.Size * 2;
		this.buckets = new HashNodeTwo[this.Size];
		for(int i = 0; i < this.Size; i++) {
			this.buckets[i] = HashNodeTwo.emptySinceStartNode(i);
		}
		for(int i = 0; i < originalBuckets.length; i++) {
			HashNodeTwo curr = originalBuckets[i];
			if (curr.State == NodeState.regular) {
				this.HashInsert(curr.Key, curr.Value);
			}
		}
	}
	
	
	//check the capacity
	private boolean IsChuncky() {
		return (float)this.Count / (float)this.Size >= this.Threashold;
	}
}