package JavaBasics;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int i = 10;
		int j = --i;// i will be one minus 1st then it will be assigned to j
		System.out.println(i);// 9
		System.out.println(j);// 9

		int k = 20;
		int l = k--;// k will be assigned to l 1st, then the value of k will be one minus
		System.out.println(k);// 19
		System.out.println(l);// 20
	}

}
