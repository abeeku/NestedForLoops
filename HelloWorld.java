public class HelloWorld{

     public static void main(String []args){
    	//4
    	 for(int i =1;i<=4;i++) {
    	 	for(int j =1;j<=5;j++) {
    	 		System.out.print("*");
    	 	}
    	 	System.out.println("");
    	 }
    	 //6
    	 for(int i=1;i<=7;i++) {
    	 	for(int j=1;j<=i;j++) {
    	 		System.out.print(""+i);
    	 	}
    	 	System.out.println();
    	 }

    	 //8
    	 for(int i=1;i<=5;i++) {
    	 	for(int j=1;j<=5-i;j++) {
    	 		System.out.print(" ");
    	 	}
    	 	for(int j=1;j<=i;j++) {
    	 		System.out.print(i);
    	 	}
    	 	System.out.println();
    	 }
}
}