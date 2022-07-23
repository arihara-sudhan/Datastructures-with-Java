// Let's implement Array and possible operations
// Learn Datastructure in Java - Ariharasudhan

class Array {
	public int[] arr;
	public Array(int[] arr) {
		this.arr = arr;
		this.arr[0] = 3;
		this.arr[1] = 2;
		this.arr[2] = 1;
	}
	public void insBeg(int data){

	}
	public void insEnd(int data){

	}
	public void insPos(int data,int pos){

	}
	public void delBeg(int data){

	}
	public void delEnd(int data){

	}
	public void delPos(int data,int pos){

	}

	public int min(int[] arr) {
		int Min = arr[0];
		for(int x:arr)
			if(x<Min) 
				Min = x;
		return Min;
	}

	public int max(int[] arr) {
		int Max = arr[0];
		for(int x:arr)
			if(x>Max) 
				Max = x;
		return Max;
	}

	public void sort(){
		for(int x=0;x<arr.length;x++)
			for(int y=x+1;y<arr.length;y++){
				if(arr[x]>arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp; 
				}
			}
	}

	public int[] moveZeroesToEnd(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0 && arr[j]==0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j]!=0){
				j++;
			}
		}
		return arr;
	}

	public int[] reverse(int[] arr){
		int[] rev = new int[arr.length];
		int start = 0;
		int last = arr.length-1;
		while(start<last){
			int temp = arr[start];
			rev[start] = arr[last];
			rev[last] = temp;
			start++;
			last--;
		}
		return rev;
	}
	public int[] removeEven(int[] arr) {
		int ODDcount = 0;
		for(int x:arr)
			if(x%2==1) ODDcount++;
		int[] res = new int[ODDcount];
		int j=0;
		for(int x:arr){
			if(x%2==1) {
				res[j] = x;
				j++;
			}
		}
		return res;
	}
	public void print(int[] arr){
		System.out.print("[");
		for(int x:arr)
			System.out.print(x+",");
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		Array obj = new Array(arr);
		obj.print(arr);
		obj.sort();
		obj.print(arr);
		obj.print(obj.removeEven(arr));
		obj.print(obj.reverse(new int[] {1,2,3,4}));
		System.out.println(obj.min(new int[] {1,2,3}));
		System.out.println(obj.max(new int[] {1,2,3}));
		obj.print(obj.moveZeroesToEnd(new int[] {0,0,1,2,3}));
	}
}