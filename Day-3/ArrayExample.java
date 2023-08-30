import java.util.Scanner;
class ArrayExample{

	public static void main(String[] args){

		Scanner sr = new Scanner(System.in);
		int arr[] = new int[5];


		int a[] = {14,15,16,25,10};
		

		for(int i=0; i< a.length; i++){
			System.out.println(a[i]);

}
		for(int i=0; i< arr.length; i++){

			arr[i] = sr.nextInt();

}
			int max = 0;
		for(int i=0; i< arr.length; i++){

			if(max < arr[i]){
				max = arr[i];

}
}
		System.out.println(max);
}


}