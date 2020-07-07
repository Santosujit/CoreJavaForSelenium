package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {

		// Static Array or One Dimensional Array.
		// Object Array is used to store different Data types.
		// Collections (HastTable/ArrayList) is used for variable length array. It is
		// called Dynamic Array.

		int a[] = new int[4]; // size of this array is 4, can store only integer values,size can't be
								// increased,so it is static array. a[] is the array
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;

		System.out.println(a[0]);// will give the value at 0th place of the array
		System.out.println(a[1]);
		System.out.println(a[3]);// will give the value at 3rd place of the array

		System.out.println(a.length);// will give the size of the array

		// To print all the values of an Array, you have to use for Loop.
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("*********");

		// Object Array--can store different data types

		Object ob[] = new Object[4];// ob[] is the object array
		ob[0] = "Gopal";
		ob[1] = 1.2;
		ob[2] = 'w';
		ob[3] = 1;

		System.out.println(ob.length);// will give the length of this array

		for (int j = 0; j < ob.length; j++) {
			System.out.println(ob[j]);
		}

	}

}
