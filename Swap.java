public class Swap{
	public static void main(String []args){

		float first = 1.20f, second = 2.45f;
		
		System.out.println("before swap");
		System.out.println("first =" +first);
		System.out.println("second ="+second);

		float temp = first;
		first = second;
		second = temp;

		System.out.println("after swap");
		System.out.println("first ="+first);
		System.out.println("second ="+second);


}
}
