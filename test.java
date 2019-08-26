package newly;
import java.util.*;

public class TestStringToken {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("this is a test:"," "); 
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
    st=new StringTokenizer("2,56,53,2,4,56,78",",");
    int change = 0;
		int sum=0;
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
    sum+=Integer.parseInt(st.nextToken());
    change+=1;
    System.out.println(change);
		}
		System.out.println(sum);
	}
}
