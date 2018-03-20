package PA06;

import java.time.LocalDate;

import javax.swing.JComboBox;
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
		
		
//////////////////////////////Declare variables for address input/////////////////////////////////
		String street;
		int houseNumber;
		String city;
		String state;
		int zipCode;

/////////////////////////////Declare variables for date//////////////////////////////////////////////
	
		
/////////////////////////////////////////////////////////////////////////////////////////////////////
		String output = "Here is the list" + "\n";
/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		int num_per = Integer.parseInt(JOptionPane.showInputDialog("Number of person ?"));
		personArray = new Person[num_per];
		for(int i = 0; i < num_per; i++) {
			//Getting common information of both Students and Faculties
			/*
			firstname = JOptionPane.showInputDialog("Firstname ?");
			lastName = JOptionPane.showInputDialog("Lastname ?");
			phoneNumber = JOptionPane.showInputDialog("Phone number ?");
			emailAddress = JOptionPane.showInputDialog("Email Address ?");			
			houseNumber = Integer.parseInt(JOptionPane.showInputDialog("What's your house number?"));
			street = JOptionPane.showInputDialog("Please enter your street name");
			city = JOptionPane.showInputDialog("City ?");
			state = JOptionPane.showInputDialog("State ?");
			zipCode = Integer.parseInt(JOptionPane.showInputDialog("Zipcode ?"));
			*/
			
			firstname = "Minh";
			lastName = "Le";
			phoneNumber = "940404040";
			emailAddress = "gfif@gmail.com";		
			houseNumber = 1234;
			street = "bbb avenue";
			city = "LA";
			state = "CA";
			zipCode = 93030;
			
			Address address = new Address(street, houseNumber, city, state, zipCode);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			Object[] options = {"Please select one of these options", "Student", "Faculty"};
		    JComboBox optionList = new JComboBox(options);
		    optionList.setSelectedIndex(0);
		    JOptionPane.showMessageDialog(null, optionList, "Are you a Student or a Faculty ?",
		        JOptionPane.QUESTION_MESSAGE);
		    
		    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
		    if(optionList.getSelectedItem() == "Student") {
				Object[] student_status = {"Please select one of these options", "Freshman", "Sophomore", "Junior", "Senior", "Graduate Student"};
			    JComboBox student_status_list = new JComboBox(student_status);
			    student_status_list.setSelectedIndex(0);
			    JOptionPane.showMessageDialog(null, student_status_list, "What year are you ?",
			        JOptionPane.QUESTION_MESSAGE);
				Person person = new Student(firstname, lastName, address, phoneNumber, emailAddress, student_status_list.getSelectedItem().toString());
				personArray[i] = person;
			}
			else {
				Object[] rankOfFaculty = {"Please select one of these options", "Professor", "Teacher Assistant", "Researcher", "Staff"};
				JComboBox rankOfFaculty_list = new JComboBox(rankOfFaculty);
				rankOfFaculty_list.setSelectedIndex(0);
			    JOptionPane.showMessageDialog(null, rankOfFaculty_list, "What's your current position ?",
			        JOptionPane.QUESTION_MESSAGE);
			    //Get the year
			    int year = LocalDate.now().getYear();
			    Object[] years;
			    years = new Integer[61];
				for(int w = 0; w < 61; w++) {
					years[w] = year - w;
				}
				JComboBox years_list = new JComboBox(years);
				years_list.setSelectedIndex(0);
			    JOptionPane.showMessageDialog(null, years_list, "Which year were you hired ?",
			        JOptionPane.QUESTION_MESSAGE);
			    
				//Get the month
				Object[] months;
				months = new Integer[12];
				for(int z = 1; z < 13; z++) {
					months[z-1] = z;
				}				
			    JComboBox months_list = new JComboBox(months);
			    months_list.setSelectedIndex(0);
			    JOptionPane.showMessageDialog(null, months_list, "Which month were you hired ?",
			        JOptionPane.QUESTION_MESSAGE);
			    
			    //Get the date
			    Object[] dates;
			    dates = new Integer[31];
			    for(int x = 1; x <32; x++) {
			    	dates[x-1] = x;
			    }
			    JComboBox dates_list = new JComboBox(dates);
			    dates_list.setSelectedIndex(0);
			    JOptionPane.showMessageDialog(null, dates_list, "Which date were you hired ?",
			        JOptionPane.QUESTION_MESSAGE);
				
				
				MyDate date = new MyDate(Integer.parseInt(years_list.getSelectedItem().toString()), Integer.parseInt(months_list.getSelectedItem().toString()), Integer.parseInt(dates_list.getSelectedItem().toString()));
				Person person = new Faculty(firstname, lastName, address, phoneNumber, emailAddress, rankOfFaculty_list.getSelectedItem().toString(), date);
				personArray[i] = person;
			}
		}
		for(int i=0; i < num_per; i++) {
			output += personArray[i].toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, output);
		
		}
}
