
public class ArrayExample {

	public static void main(String[] args) {
		int[] numbers = {55, 123, 23, 11, -37, 98};
		
		int sum = 0;
		for(int i = 0 ; i < numbers.length; i++){
			sum += numbers[i];
			//sum = sum + numbers[i];					
		}
		
		System.out.println("������ �� ���������� � " + sum);
	
		double sredno = (double)sum / numbers.length;
		
		System.out.println("������ ����������� "  + sredno);
		
		System.out.println("������ ����������� "  + 
				(double)sum / numbers.length);

	}

}
