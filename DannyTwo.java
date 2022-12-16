
public class DannyTwo 
{
	public HashNodeThree buckets[];
	public int Size; //capacity
	public int Count; //items in the hash table
	public final float threashold = 0.7f;
	private final int initialSize = 10;
	
	public DannyTwo() 
	{
		this.Size = initialSize;
		this.Count = 0;
		this.buckets = new HashNodeThree[this.Size];
	}
	
	//abc
	//value = 0; value = 0 * 256 + a(97) = 97
	//value = 97; value = 97 * 256 + b(98) = 97 * 256 + 98
	//value = 97 * 256 + 98; value = 97 * 256^2 + 98 * 256^1 + c(99)
	public int GetHash(int key) 
	{
		/*int total = key.length();
		int value = 0;
		for(int i = 0; i < total; i++) {
			value = value * 256 + key.charAt(i);
		}*/
		int hash = Integer.hashCode(key);
		if (hash < 0) 
		{
            hash += 2147483648L;
       }
		return hash % this.Size;
	}
	
	public void Add(int key, int value) {
		//use gethash to find the bucket index
		int code = this.GetHash(key);
		//then append it to the tail of the link on the bucket
		HashNodeThree curr = this.buckets[code];
		if (curr == null) {
			HashNodeThree newNode = new HashNodeThree(0, 0, code);
			this.buckets[code] = newNode;
		} else {
			while (curr != null) {
				if (curr.Key == key) {
					curr.Value = value;
					return;
				} else {
					if (curr.Next == null) {
						HashNodeThree newNode = new HashNodeThree(0, 0, code);
						curr.Next = newNode;
						this.Count++;
						this.Resize();
						return;
					}
					curr = curr.Next;
				}
			}
		}
	}
	
	public HashNodeThree Get(int key) {
		int code = this.GetHash(key);
		HashNodeThree tar = this.buckets[code];
		if (tar == null) {
			return null;
		} else {
			HashNodeThree curr = tar;
			while (curr != null) {
				if (curr.Key == key) {
					return curr;
				} else {
					curr = curr.Next;
				}
			}
			return null;
		}
	}
	
	public void Remove(int key) {
		int code = this.GetHash(key);
		HashNodeThree curr = this.buckets[code];
		if (curr == null) {
			return;
		} else {
			if (curr.Key == key) {
				HashNodeThree next = curr.Next;
				this.buckets[code] = next;
				curr.Next = null;
			} else {
				HashNodeThree pre = curr;
				curr = curr.Next;
				while (curr != null) {
					if (curr.Key == key) {
						pre.Next = curr.Next;
						curr.Next = null;
						return;
					} else {
						pre = curr;
						curr = curr.Next;
					}
				}
			}
		}
	}
	
	
	//key: Amy -> 23 % 10 -> 3
	//key: Bob -> 33 % 10 -> 3
	//resize: Amy -> 23 % 20 -> 3
	//bob -> 33 % 20 -> 13
	private void Resize() {
		if (this.Chunky()) {
			this.Size = this.Size * 2;
			this.Count = 0;
			HashNodeThree[] original = this.buckets;
			this.buckets = new HashNodeThree[this.Size];
			for (int i = 0; i < original.length; i++) {
				HashNodeThree curr = original[i];
				while (curr != null) {
					this.Add(curr.Key, curr.Value);
					curr = curr.Next;
				}
			}
		}
	}
	
	private boolean Chunky() {
		return (float)this.Count / (float)this.Size > this.threashold;
	}
}
