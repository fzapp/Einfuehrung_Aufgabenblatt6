package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static boolean isMirrorArray(int[] a, int [] b) {
		if(a.length != b.length) {
			return false;
		}
		for (int i=0; i<a.length; i++) {
			if(a[i] != b[b.length -i -1]) {
				return false;
			}
		}
		return true;
	}
}
