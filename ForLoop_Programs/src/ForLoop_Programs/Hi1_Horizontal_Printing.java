package ForLoop_Programs;

public class Hi1_Horizontal_Printing {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print("Hi"+i+" ");
		}
		System.out.println();
		System.out.println("*******************************************************");
		for(int i=1;i<=6;i++) {
			System.out.print("Ok"+i+" ");
		}
		System.out.println();
		System.out.println("******************************************************");
		System.out.println("Hi1 ok2 hi3 like this");
		System.out.println();
		for(int i=1;i<=5;i++) {
			if(i%2==0) {
				System.out.print("Hi"+i+" ");
			}
			else {
				System.out.print("Ok"+i+" ");
			}

		}
		System.out.println();
		System.out.println("*********************************************************");
		for(int i=5;i>=3;i--) {
			System.out.print("Ok"+i+" ");
		}
		for(int i=4;i<=5;i++) {
			System.out.print("Hi"+i+" ");
		}
		System.out.println();
		System.out.println("*****************************************************************");
	    for(int i=2;i<=12;i++) {
	    	if(i%2==0) {
	    		System.out.print("Ok"+i+" ");
	    	}
	    }
	    System.out.println();
	    System.out.println("******************************************************************");
	    for(int i=5;i>=2;i--) {
	    	if(i%2==0) {
	    		System.out.print("Ok"+i+"Hi"+" ");
	    	}
	    	else {
	    		System.out.print("Ok"+i+"H"+" ");
	    	}
	    }
	    System.out.println();
	    System.out.println("********************************************************************");
	    for(int i=1;i<=4;i++) {
	    	System.out.print("Hi"+i+"Ok"+" ");
	    }
	    System.out.println();
	    System.out.println("***********************************************************************");
	    for(int i=1;i<=6;i++) {
	    	if(i%2==0) {
	    		System.out.print(i+"Hi"+" ");
	    	}
	    	else {
	    		System.out.print(i+"Ok"+" ");
	    	}
	    }
	}

}
