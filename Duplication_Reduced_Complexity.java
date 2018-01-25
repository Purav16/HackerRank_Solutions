
public class One_To_N_Duplication {
	public static void main(String[] args){
		int[] array = { 1,2,3,4,5,6,7,8,9,1};
		for ( int i = 0 ; i < array.length ; i++ ){
			for ( int j = i + 1 ; j < array.length ; j++ ){
				if (array[i] == array[j]){
					System.out.println("Duplication at: " + array[i] +  " and " + array[j]);
					System.out.println(i + " " + j);
				}
			}
		}
	}

}
