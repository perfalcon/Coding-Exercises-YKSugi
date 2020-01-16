package ykSugi;

public class ArrayRotationOfAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
    /*    System.out.println(isRotation(array1, array2a));// should return false
        
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(isRotation(array1, array2b));// should return true
        
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        System.out.println(isRotation(array1, array2c));// should return false.
        
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        System.out.println(isRotation(array1, array2d));// should return false.
*/        
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        //System.out.println(isRotation(array1, array2e));// should return false.
        System.out.println(isRotationActual(array1, array2e));// should return false.
        
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(isRotation(array1, array2f));// should return true.
        
        
        
	}
	
	public static Boolean isRotation(int[] a, int[] b) {
		boolean result_flag=true;
		if(a.length!=b.length)			
			result_flag= false;
		else{
			boolean flag=false;
			int pos=0;
			while(pos<b.length){
				if(a[0]==b[pos]){
					flag=true;
					break;
				}
				pos++;
			}	
			System.out.println("flag-->"+flag+"  pos-->"+pos);
			if(flag){
				int end=b.length;
				int j=pos,i=0;
				while(j<end && i<a.length){
						if(a[i]==b[j]){
							i++;j++;
							result_flag=true;
						}else{
							result_flag=false;
							break;
						}
						if(j==end){
							j=0;
							end=pos;
						}
				}				
			}
			
		}
		
		return result_flag;
    }
	
	 // Implement your solution below.
    public static Boolean isRotationActual(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        int key = array1[0];
        int keyLoc = -1;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == key) {
                keyLoc = i;
                break;
            }
        }
        if (keyLoc == -1) return false;
        for (int i = 0; i < array1.length; i++) {
            int j = (keyLoc + i) % array1.length;
            if (array1[i] != array2[j]) return false;
        }
        return true;
    }

}
