// Let's Find Next Greater Element
//[5,2,6,3,8,0] => [6,6,8,8,-1,-1]
// Learn Datastructure in Java - Ariharasudhan

class NextGreaterElement {
	int[] arr;
	int[] res;
	NextGreaterElement(int[] arr) {
		this.arr = arr;
		this.res = new int[arr.length];
	}
	public int[] NextList() {
		int k = 0;
		for(int i=0;i<arr.length;i++){
			int flag = 0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					flag = 1;
					res[k] = arr[j];
					k++;
					break;
				}
			}
			if(flag==0){
				res[k] = -1;
				k++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		NextGreaterElement nge = new NextGreaterElement(new int[] {4,7,3,4,8,1});
		int[] arr = nge.NextList();
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
	}

}