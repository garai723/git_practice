
public class BubbleSort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = {4,1,2,5,3};
		for(int i=0; i<data.length; i++){
			for(int j=0; j<data.length-1; j++){
				if(data[j]>data[j+1]){
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}

			}
		}
		for(int k=0; k<data.length; k++){
			System.out.println(data[k]+"");
		}
	}

}
