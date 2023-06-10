import java.util.*;

public class Main {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		DLL Calls =new DLL();
		DLL Contacts =new DLL();
		
//		Calls.addNode(new PhonebookData("ahmed","01003344585"));
//		Calls.addNode(new PhonebookData("mohamed","011111111"));
//		Calls.addNode(new PhonebookData("ahmed","01003043585"));
		
       int choose = 1000;
       
	while(choose!=0) {
		
	
	
		System.out.println("Enter 1 to add a new phone number\r\n"
                +"Enter 2 to search for a number\r\n"
                +"Enter 3 to delete a number\r\n"
                + "Enter 4 to contact a phone number\r\n"
                + "Enter 5 to display the list of contacts\r\n"
                + "Enter 6 to display the call list\r\n"
                + "Enter 0 To exit the program");
				System.out.println("_________________________________________________________");

		choose = in.nextInt();

       switch(choose) {
		case 1 :{
			System.out.println("please! Add Phone Number ");
		    String phoneNumber = in.next();
			System.out.println("please! Add Phone Number's Name ");
			String Name = in.next();
			Contacts.addNode(new PhonebookData(Name,phoneNumber));
//			Calls.addNode(new PhonebookData(Name,phoneNumber));
			System.out.println("_________________________________________________________");

		    break;

			
		}
		case 2 :{
			int n;
			System.out.println("If you want to search by phone number press 1 \n Or you want to search by name, press 2");
			n=in.nextInt();
			switch(n) {
			case 1 :{
				System.out.println("please! Add Phone Number for Search :");
				String PhoneNumber = in.next();
				Node temp =Contacts.Search(PhoneNumber);
				System.out.println("_________________________________________________________");

				break;
			}
			case 2 :{
				System.out.println("please! Add Phone Number's Name for Search :");
				String Name =in.next();
				Node temp =Contacts.Search(Name);
				System.out.println("_________________________________________________________");

				break;
			}
			}
			
			
			break;
		}	
		case 3:{
			System.out.println("Enter the phone number you want to delete:");
			String PhoneNumber =in.next();
			Node temp =Contacts.Search(PhoneNumber);
			System.out.println("This number has been deleted");
			Contacts.Delete(temp);
			break;
		}
		case 4 :{
			System.out.println("Enter the number you want to call: ");
			String PhoneNumber =in.next();
			Node tempcall=Contacts.Search(PhoneNumber);
     if(PhoneNumber.length()==11) {

			if (tempcall==null) {
				Calls.addFirst(new Node(new PhonebookData(null,PhoneNumber)));
				Contacts.addNode(new PhonebookData(null,PhoneNumber));
				System.out.println("The number [ "+PhoneNumber +" ]\n\t is being contacted....    ");

				System.out.println("_________________________________________________________");

			}
			else  {
				Calls.addFirst(tempcall);
				System.out.println("The number [ "+PhoneNumber +" ]\n\t is being contacted....    ");
				System.out.println("_________________________________________________________");

			}
     }
			else {
				System.out.println("This Number is Wrong,must be 11 number");
				System.out.println("_________________________________________________________");

			}
			break;
		}
		case 5 :{
			System.out.println("_________________________________________________________");

			System.out.println("Contacts :");
			Contacts.print();
			System.out.println("_________________________________________________________");

			break;
		}
		case 6 :{
			System.out.println("_________________________________________________________");
			System.out.println("Calls :");
			Calls.print();
			System.out.println("_________________________________________________________");

			break;
		}
		default :
			System.out.println("The application is closing");
			choose = 0;
			break;
		
			
			}
			   }
			
       }
	}

		
		
		
	



	

	



