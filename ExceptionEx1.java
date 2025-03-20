
public class ExceptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		try {
			int result=5/0;

		System.out.println(arr[8]);

		}
		
		catch (ArrayIndexOutOfBoundsException |ArithmeticException e) {
			System.out.println("Error");
		}
		System.out.println("end of example");

	}

}
