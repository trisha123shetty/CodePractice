package Problems;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,33,42,51};
		int b[]= {26,54,69,81};
		int n=a.length+b.length;
		int c[]= new int[n];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
			}else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
		for(int ele:c) {
			System.out.println(ele);
		}
		

	}

}
