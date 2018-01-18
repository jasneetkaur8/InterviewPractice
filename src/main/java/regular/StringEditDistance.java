package regular;

public class StringEditDistance {

	public static void main(String[] args) {
		System.out.println(findDistance("","geeksforgeeks"));

	}
	public static int findDistance(String s1, String s2){
		if(s1==null || s2==null){
			return 0;
		}
		int dist = 0;
		int l1 = s1.length();
		int l2 = s2.length();
	//	dist += Math.abs(l1-l2);
		int i=0,j=0;
		while(i<l1 && j<l2){
			if(s1.charAt(i)!=s2.charAt(j)){
				dist++;
				if(l1<l2){
					j++;
				}
				if(l2<l1){
					i++;
				}
				if(l1==l2){
					i++;j++;
				}
			}
			else{
				i++;j++;
			}
			
		}
		
		return dist;

	}

	}
