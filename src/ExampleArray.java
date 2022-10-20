
public class ExampleArray {

	public static void main(String[] args) {
		int[] marks = new int[5];
		marks[0] = 98;
		marks[1] = 99;
		marks[2] = 97;
		marks[3] = 96;
		marks[4]= 93;
		
//		for(int i=0; i<marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		for(int i: marks) {
			System.out.println(i);
		}

	}

}
