package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean compareArraysVal(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		int counter;
		int toCount;
		for (int i=0; i<a.length; i++) {
			toCount = a[i];
			counter = 0;
			for (int j=0; j<a.length; j++) {
				if(a[j] == toCount) {
					counter++;
				}
				if(b[j] == toCount) {
					counter--;
				}
			}
			if(counter != 0) {
				return false;
			}
		}
		
		
		
		
		return true;
	}

}
