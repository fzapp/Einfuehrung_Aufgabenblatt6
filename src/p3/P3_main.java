package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {1,5,3,7};
		System.out.println(methode(test));
		
	}

	public static int methode(int[] a) {
		int max = a[0];
		int zweitMax = -1;
		if (a.length >= 2) {
			for (int i =1; i < a.length; i++) {
				if (Math.abs(a[i]) != max) {
					zweitMax = a[i];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (Math.abs(a[j]) > Math.abs(a[i])) {
					max = a[j];
					zweitMax = a[i];
				}
			}
		}
		return zweitMax;
	}

}
