package ddz6;
import java.util.Arrays;
import java.util.*;



public class Teem4Zavd4_21 {
	static class Massiv {
		 int[] list;
		 
		 public Massiv(int[] list) {
		      this.list = list;
		  }
		 public int[] bulbachka() {
			 boolean isSorted = false;
		        int buf;
		        while(!isSorted) {
		            isSorted = true;
		            for (int i = 0; i < list.length-1; i++) {
		                if(list[i] > list[i+1]){
		                    isSorted = false;
		 
		                    buf = list[i];
		                    list[i] = list[i+1];
		                    list[i+1] = buf;
		                }
		            }
		        }
		        return list;
			 
		 }


	
	public int[] Sheiker() {
		int leftSide = 0;
        int rightSide = list.length - 1;
        int temp;

        do {

            for (int i = leftSide; i < rightSide; i++) {


                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
            rightSide--; 
            for (int i = rightSide; i > leftSide; i--) {
                if (list[i] < list[i - 1]) {
                    temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                }
            }
            leftSide++; 
            
        } while (leftSide < rightSide); 

       return list;
	}
	 public int[] SortProstVubor() {
	        for (int i = 0; i < list.length; i++) {    
	            int pos = i;
	            int min = list[i];
	            for (int j = i + 1; j < list.length; j++) {
	                if (list[j] < min) {
	                    pos = j;    
	                    min = list[j];
	                }
	            }
	            list[pos] = list[i];
	            list[i] = min;    
	        }
	        return list;
	    }
	 public int[] SortObAd()
	    {
	        int[] output = new int[list.length];
	 
	        int k = 0;
	        
	        for (int i = 0; i < list.length; i++) {    
	                if (list[i] > k) {
	                        k = list[i];
	                        
	                }
	        }
	        int[] freq = new int[k + 1];
	 
	       
	        for (int i: list) {
	            freq[i]++;
	        }
	 
	        
	        int total = 0;
	        for (int i = 0; i < k + 1; i++)
	        {
	            int oldCount = freq[i];
	            freq[i] = total;
	            total += oldCount;
	        }
	 
	        
	        for (int i: list)
	        {
	            output[freq[i]] = i;
	            freq[i]++;
	        }
	 
	        
	        Arrays.setAll(list, i -> output[i]);
	        return list;
	    }
	 public int[] Vstavka(){
		 for (int left = 0; left < list.length; left++) {
				int value = list[left];
				int i = left - 1;
				for (; i >= 0; i--) {
					if (value < list[i]) {
						list[i + 1] = list[i];
					} else {
						break;
					}
				}
				list[i + 1] = value;
			}
		 return list;
	 }
	 public int[]  SortBinZlit() {
		 int n = list.length;
		 if (n < 2) return list;

	        int mid = n / 2;
	        int[] left = new int[mid];
	        int[] right = new int[n - mid];

	        System.arraycopy(list, 0, left, 0, mid);
	        System.arraycopy(list, mid, right, 0, n - mid);
	        
	        Massiv leftt = new Massiv(left);
	        Massiv rightt = new Massiv(right);

	        leftt.SortBinZlit();
	        rightt.SortBinZlit();

	        merge(list, left, right, mid, n - mid);
	        return list;
	    }
	 public int[]  SortShell() {
		 int gap = list.length / 2;
		 int prr=0;
		while (gap >= 1) {
		    for (int right = 0; right < list.length; right++) {
		       for (int c = right - gap; c >= 0; c -= gap) {
		           if (list[c] > list[c + gap]) {
		        	   prr = list[c];
		               list[c] = list[c+gap];
		               list[c+gap] = prr;
		           }
		        }
		    }
		    gap = gap / 2;
		}
		return list;
	 }
	
	 	
	    public static void merge(int[] src, int[] left, int[] right, int leftLength, int rightLength) {
	        int k = 0, i = 0, j = 0;

	        while (i < leftLength && j < rightLength) {
	            if (left[i] <= right[j]) src[k++] = left[i++];
	            else src[k++] = right[j++];
	        }

	        while (i < leftLength) {
	            src[k++] = left[i++];
	        }

	        while (j < rightLength) {
	            src[k++] = right[j++];
	        }
	 }
	    
}
	public static void main(String[] args) {
		int []k= {1,3,4,6,7,2,5};
		Massiv per = new Massiv(k);
		Massiv por = new Massiv(k);
		Massiv pol = new Massiv(k);
		Massiv pom = new Massiv(k);
		Massiv pon = new Massiv(k);
		Massiv poo = new Massiv(k);
		Massiv poq = new Massiv(k);
		System.out.println(Arrays.toString(per.bulbachka()));
		System.out.println(Arrays.toString(por.Sheiker()));
		System.out.println(Arrays.toString(pol.SortProstVubor()));
		System.out.println(Arrays.toString(pom.SortObAd()));
		System.out.println(Arrays.toString(pon.Vstavka()));
		System.out.println(Arrays.toString(poo.SortBinZlit()));
		System.out.println(Arrays.toString(poq.SortShell()));
	}
	
}
