
public class FindData {
	public static void main(String[]args){

	int[] data = {4, 3, 5, 1, 2};
		int i=1;
		int x = 5;

		while( x == data[i]){
			i++;
		}
		if(i <= 5){
			System.out.println(data[i]);
		}
	}

}
