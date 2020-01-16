package ykSugi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInArray {
	
	//Common Elements in a sorted array

	public static void main(String[] args) {		
		int[] a={1,3,4,6,7,9};
		int[] b={1,2,4,5,9,10};
		String[] common;
		int sizeofCommon=0;
		if(a.length == b.length){
			sizeofCommon=a.length;
		}else if(a.length>b.length){
			sizeofCommon=a.length;
		}else{
			sizeofCommon=b.length;
		}
		common = new String[sizeofCommon];
		for(int i=0; i<sizeofCommon;i++){
			for (int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					common[i]=Integer.toString(a[i]);
				}	
			}			
		}
		for(int i=0;i<sizeofCommon;i++)
			if(common[i]!=null)
				System.out.println(common[i]+",");
	
		
		//O(max(n,m))
		
		List<Integer> result = new ArrayList<Integer>();
				
		int i=0,j =0;
		while((i<sizeofCommon)&&(j<sizeofCommon)){
			if(a[i]==b[j]){
				result.add(a[i]);
				i++;j++;
			}else if(a[i]>b[j]){
				j++;				
			}else{
				i++;
			}
		}
		System.out.println(Arrays.toString(result.toArray()));
	}

}
