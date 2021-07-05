//java基础语法练习

//求三个数中的最小值
public class Solution{
	public static int min(int a, int b, int c){
		int t;
		t = a < b ? a : b;
		t = t < c ? t : c;
		return t;
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println(min(1,2,3));
		System.out.println(min(-1,-2,-3));
		System.out.println(min(3,5,3));
		System.out.println(min(5,5,10));
	}
}


/*
求四个数的最小值
解决方案一：
*/
public class Solution{
	public static int min(int a, int b, int c, int d){
		int temp;
		temp = a < b ? a : b;
		temp = temp < c ? temp : c;
		temp = temp < d ? temp : d;
		return temp;
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println(min(-20,-10,-30,-40));
		SYstem.out.println(min(-20,-10,-30,40));
		System.out.println(min(-10,-30,-40,40));	
	}
}

//解决方案二：
public class Solution2{
	public static int min(int a, int b, int c, int d){
		int min_all;
		min_all = min(a,b) < c ? min(a,b) : c;
		min_all = min_all < d ? min_all : d;
		return min_all;
	}
	
	public static int min(int a, int b){
		int temp;
		temp = a < b ? a : b;
		return temp;
	}
	
	public static void main(String[] args){
		System.out.println(min(10,9));
		System.out.println(min(-20,-10,-30,-40));
		SYstem.out.println(min(-20,-10,-30,40));
		System.out.println(min(-10,-30,-40,40));
	}
}