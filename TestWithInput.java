package PA06;

import javax.swing.JOptionPane;

public class TestWithInput {
	
	static Person[] personArray;
	
	public static void main(String[] args){		
		String student_or_faculty;
/////////////////////////////Declare variables for information of Person//////////////////////////
		String firstname;
		String lastName;
		String phoneNumber;
		String emailAddress;
		String student_status; // for student
		String rankOfFaculty; //for faculty
		
		
//////////////////////////////Declare variables for address input/////////////////////////////////
		String street;
		int houseNumber;
		String city;
		String state;
		int zipCode;

/////////////////////////////Declare variables for date//////////////////////////////////////////////
		int year; //for faculty
		int month; //for faculty
		int day; //for faculty

		// Create an instance of Address using the constructor of Address
		
		//
		
		// Create an instance of MyDate using the constructor of MyDate
		// In this example, using the constructor MyDate(int year, int month, int day) 
		
		
			  
		// create an instance of Faculty using the constructor of Faculty
		// An instance of Faculty is assigned to superclass Person
		
		
		//
		
		int num_per = Integer.parseInt(JOptionPane.showInputDialog("Number of person ?"));
		personArray = new Person[num_per];
		for(int i = 0; i < num_per; i++) {
			firstname = JOptionPane.showInputDialog("Firstname ?");
			lastName = JOptionPane.showInputDialog("Lastname ?");
			phoneNumber = JOptionPane.showInputDialog("Phone number ?");
			emailAddress = JOptionPane.showInputDialog("Email Address ?");
			street = JOptionPane.showInputDialog("Please enter your address");
			houseNumber = Integer.parseInt(JOptionPane.showInputDialog("What's your house number?"));
			city = JOptionPane.showInputDialog("City ?");
			state = JOptionPane.showInputDialog("State ?");
			zipCode = Integer.parseInt(JOptionPane.showInputDialog("Zipcode ?"));
			Address address = new Address(street, houseNumber, city, state, zipCode);
			student_or_faculty = JOptionPane.showInputDialog("Student or Faculty ?");
			if(student_or_faculty == "Student") {
				student_status = JOptionPane.showInputDialog("What year are you? ");
				Person person = new Student(firstname, lastName, address, phoneNumber, emailAddress, student_status);
				personArray[i] = person;
			}
			else {
				rankOfFaculty = JOptionPane.showInputDialog("Rank of Faculty ?"); 
				year = Integer.parseInt(JOptionPane.showInputDialog("Year ?"));
				month = Integer.parseInt(JOptionPane.showInputDialog("Month ?"));
				day = Integer.parseInt(JOptionPane.showInputDialog("Date ?"));
				MyDate date = new MyDate(year, month, day);
				Person person = new Faculty(firstname, lastName, address, phoneNumber, emailAddress, rankOfFaculty, date);
				personArray[i] = person;
			}
			
		}
		
		// Hard-coding the array size to 2
		//personArray = new Person[2];
		// Storing faculty information in the first element of personArray
		//personArray [0] = person1;
		
		//System.out.println(personArray[0].toString());
		// This will print out:
	//	Ramadan , Abdunabi , Address [street=Rockwell Hall East, houseNumber=121, city=Fort Collins, state=Colorado, zipCode=80521] , (970) 491-6227 , ramadan.abdunabi@business.colostate.edu , Professor , MyDate [year=2010, month=11, day=17]
		
		// Create an instance of Address using the constructor of Address
		//Address address2 = new Address("Rockwell Hall West", 231, "Fort Collins", "Colorado", 80521);
		// create an instance of Student using the constructor of Student
		// An instance of Student is assigned to superclass Person
		//Person person2 = new Student("Jim", "Miller", address2, "(970) 431-1212", "jim.miller@gmail.com", "Senior");
		// Assign instance of Student to the second element of personArray
		//personArray [1] = person2;
		
		//System.out.println(personArray[1].toString());
		// This will print out:		
		//Jim , Miller , Address [street=Rockwell Hall West, houseNumber=231, city=Fort Collins, state=Colorado, zipCode=80521] , (970) 431-1212 , jim.miller@gmail.com , Senior
	}
}
