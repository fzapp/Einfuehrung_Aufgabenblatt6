package p2;

public class P2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean pairwiseDifferent (int[] someNumbers) {
		boolean rueckgabe = true;
		for(int i=0; i< someNumbers.length -1; i++) {
			for(int j = i+1; j<someNumbers.length; j++) {
				if (someNumbers[i] == someNumbers[j]){
					
				}
			}
		}
		
		
		return rueckgabe;
	}

}
