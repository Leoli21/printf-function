
public class Test {

	public static void main(String[] args) {
		int iDnum = 12345, iDnum2 = 26801;
		String name = "name1", name2 = "name2";
		
		System.out.printf("Name: %-20s ID: %012d", name, iDnum);
		System.out.printf("\nName: %-20s ID: %012d", name2, iDnum2);
		
		int x = 10;
		System.out.println("\n" + x ++);  //prints out 10 because it prints x first then increments
		System.out.print(x);  // prints out 11
	
	}

}
