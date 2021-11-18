package eedd;

public class arraynumrandom {

	public static void main(String[] args) {
		int array[] = new int [20];
		for ( int i =0; i<array.length;i++) {
			array[i]=(int) (Math.random()*10+1);
			System.out.print("\t"+array[i]);
		}
	}

}
