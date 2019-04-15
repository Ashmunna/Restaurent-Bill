import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ResBill {
	
	@SuppressWarnings("unused")
	
	public static void hotelMenu() throws IOException{
		
		
		ArrayList<String> hm = new ArrayList<String>();
		ArrayList<Integer> hm1 = new ArrayList<Integer>();
		
		HashMap<Integer,Integer> Oders=new HashMap<Integer,Integer>();
		
		hm.add("");
		hm.add("Biriyani");
		hm.add("Burger");
		hm.add("Pasta");
		hm.add("Pizza");
		hm.add("Coffee");
		hm1.add(null);
		hm1.add(250);
		hm1.add(150);
		hm1.add(250);
		hm1.add(700);
		hm1.add(85);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Kader Food Corner");
		System.out.println(" ");
		
		System.out.println("Wanna Have Order Something From Menu Card, If then Press Enter.");
		
		String enterkey = sc.nextLine();
	
			if(enterkey.equals("")){
				
				System.out.println("Please press Y to Display Menu");
			}while(true){
			
				String c =sc.next();
				
				char ch = c.charAt(0);
				
					if(ch=='y'||ch=='Y'){
						
					System.out.println("--------------Kader Food Corner Menu Card----------------");
					
						for(int i=1;i<hm.size();i++){
							System.out.print(i+"."+hm.get(i));
							for(int j=1;j<hm1.size();j++){
								System.out.println(":BDT -"+hm1.get(i));
								break;
							}
						}
					
						System.out.println("");
						System.out.println("Enter Your Choice");
						System.out.println("--------------------------------------------------");
						
						while(true){
						
							int choice=sc.nextInt();
							System.out.println("Enter Your Quantity");
							int quantity=sc.nextInt();
							if(choice<=hm.size()){
								if(Oders.containsKey(choice)){
										System.out.println("Choice already present increasing the quantity for "+hm.get(choice));
										System.out.println("");
										Oders.put(choice, Oders.get(choice)+quantity);
									}else{
										Oders.put(choice, quantity);
									}
								}else{
								System.out.println("The pressed choice does not exist in menu, enter valid choice");
								System.out.println("");
								}
						
						
							System.out.println("Wanna Order Something More");
							
							System.out.println("Press Y to add more or any random key to say thats it!!");
							
							String c1=sc.next();
						
							char ch1=c1.charAt(0);
						
							if(ch1=='y'||ch1=='Y'){
								System.out.println("Enter Your Choice");
							}else{
							int Total_Bill= 0;
							System.out.println("No More Items to be Ordered--------Preparing Final Bill:");
							
								for (int i = 0; i < 5; ++i) {
									System.out.println();
								}
									System.out.println("------------------------Kader Food Corner-----------------------"+ "");
									System.out.println("");
									System.out.println("Items ordered are");
									System.out.println("-------------------------------------------------------------");
									int count=1;
									for (Integer key : Oders.keySet()) {
										System.out.println(count+"."+hm.get(key)+" : "+hm1.get(key)+" x "+Oders.get(key));
										Total_Bill = Total_Bill+(hm1.get(key))*Oders.get(key);
										count++;
									}
								
								System.out.println("---------------------------------------------------------------------");
								System.out.println("Total Bill : BDT."+Total_Bill);
								exit();
							}
						}
				}else{
					System.out.println("Exiting, that is invalid input, please try again");
					sc.close();
				}
		}
	}
		public static void exit(){
			System.out.println("");
			System.out.println("------------------------------------------------------------");
			System.out.println("Thank you Sir for visiting 'Kader Food Corner'!! Please visit again");
			System.out.println("--------------------------------------------------------");
		}
		
		public static void main(String args[]) throws IOException{
		hotelMenu();
		}
}
