package PA06;

import java.time.LocalDate;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TestWithInput {
	
	static Person[] personArray;
	
	public static void main(String[] args){	
		int num_per = 0;
		String student_or_faculty;
/////////////////////////////Declare variables for information of Person//////////////////////////
		String firstname = null;
		String lastName = null;
		String phoneNumber = null;
		String emailAddress = null;
//////////////////////////////Declare variables for address input/////////////////////////////////
		String street = null;
		int houseNumber = 0;
		String city = null;
		String state = null;
		int zipCode = 0;
		
		String output = "Here is the list" + "\n";
/////////////////////////////////////////////////////////////////////////////////////////////////////
		int option = JOptionPane.YES_OPTION;
		while(option == JOptionPane.YES_OPTION) {
			try {
				num_per = Integer.parseInt(JOptionPane.showInputDialog("Number of person ?"));
				if(num_per < 0) {
					throw new Exception();
				}
				else if(num_per == 0) {
					JOptionPane.showMessageDialog(null, "Exit program");
					System.exit(0);
				}
				option = 1;
			}
			catch(Exception ex){
				option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
				if(option != JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Exit program");
					System.exit(0);
				}
			}
		}
		
		personArray = new Person[num_per];
		for(int i = 0; i < num_per; i++) {
			//Getting common information of both Students and Faculties
			//First name
			option = JOptionPane.YES_OPTION;
			JOptionPane.showMessageDialog(null, "Begin the information for the person number " + (i+1));
			while(option == JOptionPane.YES_OPTION) {
				try {
					firstname = JOptionPane.showInputDialog("What is your firstname ?");
					if(firstname.length() == 0) {
						throw new Exception();
					}
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
			
			//Last name
			option = JOptionPane.YES_OPTION;
			while(option == JOptionPane.YES_OPTION) {
				try {
					lastName = JOptionPane.showInputDialog("What is your lastname ?");
					if(lastName.length() == 0) {
						throw new Exception();
					}
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
			
			//Phone number
			option = JOptionPane.YES_OPTION;
			while(option == JOptionPane.YES_OPTION) {
				try {
					phoneNumber = JOptionPane.showInputDialog("What is your phone number ?");
					if(phoneNumber.length() == 0) {
						throw new Exception();
					}
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
			
			//Email address
			option = JOptionPane.YES_OPTION;
			while(option == JOptionPane.YES_OPTION) {
				try {
					emailAddress = JOptionPane.showInputDialog("What is your email address ?");	
					if(emailAddress.length() == 0) {
						throw new Exception();
					}
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
			
			//House number
			option = JOptionPane.YES_OPTION;
			while(option == JOptionPane.YES_OPTION) {
				try {
					houseNumber = Integer.parseInt(JOptionPane.showInputDialog("What's your house number?"));
					if(houseNumber < 0) {
						throw new Exception();
					}
					else if(houseNumber == 0) {
						System.exit(0);
					}
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
			
			//Street name
			option = JOptionPane.YES_OPTION;
			while(option == JOptionPane.YES_OPTION) {
				try {
					street = JOptionPane.showInputDialog("Please enter your street name");
					if(street.length() == 0) {
						throw new Exception();
					}
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
			
			//City
			option = JOptionPane.YES_OPTION;
			while(option == JOptionPane.YES_OPTION) {
				try {
					city = JOptionPane.showInputDialog("Which city are you currently in ?");
					if(street.length() == 0) {
						throw new Exception();
					}
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
			
			//State
			option = JOptionPane.YES_OPTION;
			while(option == JOptionPane.YES_OPTION) {
				try {
					state = JOptionPane.showInputDialog("Which state are you currently in ?");
					if(state.length() == 0) {
						throw new Exception();
					}
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
			
			//Zipcode
			option = JOptionPane.YES_OPTION;
			while(option == JOptionPane.YES_OPTION) {
				try {
					zipCode = Integer.parseInt(JOptionPane.showInputDialog("What zipcode are you currently in ?"));
					if(zipCode < 0) {
						throw new Exception();
					}
					else if(zipCode == 0) {
						System.exit(0);
					}
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Invalid input! Would you like to try again?");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
			
			//Create address object
			Address address = new Address(street, houseNumber, city, state, zipCode);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////
			Object[] options = {"Please select one of these options", "Student", "Faculty"};
		    JComboBox optionList = new JComboBox(options);
		    optionList.setSelectedIndex(0);
		    
		    option = JOptionPane.YES_OPTION;
			while(option == JOptionPane.YES_OPTION) {
				try {
					JOptionPane.showMessageDialog(null, optionList, "Are you a Student or a Faculty ?", JOptionPane.QUESTION_MESSAGE);
					////////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(optionList.getSelectedItem() == "Student") {
						Object[] student_status = {"Please select one of these options", "Freshman", "Sophomore", "Junior", "Senior", "Graduate Student"};
						JComboBox student_status_list = new JComboBox(student_status);
						student_status_list.setSelectedIndex(0);
						
						option = JOptionPane.YES_OPTION;
						while(option == JOptionPane.YES_OPTION) {
							try {
								JOptionPane.showMessageDialog(null, student_status_list, "What year are you ?", JOptionPane.QUESTION_MESSAGE);
								if(student_status_list.getSelectedItem().toString() != "Please select one of these options") {
									Person person = new Student(firstname, lastName, address, phoneNumber, emailAddress, student_status_list.getSelectedItem().toString());
									personArray[i] = person;
									option = 1;
								}
								else {
									throw new Exception();
								}
							}
							catch (Exception ex) {
								option = JOptionPane.showConfirmDialog(null, "Invalid input! Please select your current year again.\nOtherwise, click No or Cancel to exit the program.");
								if(option != JOptionPane.YES_OPTION) {
									JOptionPane.showMessageDialog(null, "Exit program");
									System.exit(0);
								}							
							}
						}				
					}
					else if(optionList.getSelectedItem() == "Faculty") {
						Object[] rankOfFaculty = {"Please select one of these options", "Lecturer", "Assistant Professor", "Associate Professor", "Professor"};
						JComboBox rankOfFaculty_list = new JComboBox(rankOfFaculty);
						rankOfFaculty_list.setSelectedIndex(0);
						option = JOptionPane.YES_OPTION;
						while(option == JOptionPane.YES_OPTION) {
							try {
								JOptionPane.showMessageDialog(null, rankOfFaculty_list, "What's your current position ?", JOptionPane.QUESTION_MESSAGE);
								if(rankOfFaculty_list.getSelectedItem().toString() == "Please select one of these options") {
									throw new Exception();									
								}
								else {
									option = 1;
								}
							}
							catch(Exception ex){
								option = JOptionPane.showConfirmDialog(null, "Invalid input! Please select your current position again.\nOtherwise, click No or Cancel to exit the program.");
								if(option != JOptionPane.YES_OPTION) {
									JOptionPane.showMessageDialog(null, "Exit program");
									System.exit(0);
								}
							}
						}
						//Get the year
						int year = LocalDate.now().getYear();
						Object[] years;
						years = new Integer[61];
						for(int w = 0; w < 61; w++) {
						years[w] = year - w;
						}
						JComboBox years_list = new JComboBox(years);
						years_list.setSelectedIndex(0);
						
						JOptionPane.showMessageDialog(null, years_list, "Which year were you hired ?", JOptionPane.QUESTION_MESSAGE);
						
						//Get the month
						Object[] months;
						months = new Integer[12];
						for(int z = 1; z < 13; z++) {
						months[z-1] = z;
						}				
						JComboBox months_list = new JComboBox(months);
						months_list.setSelectedIndex(0);
						JOptionPane.showMessageDialog(null, months_list, "Which month were you hired ?", JOptionPane.QUESTION_MESSAGE);
						
						//Get the date
						Object[] dates;
						dates = new Integer[31];
						for(int x = 1; x <32; x++) {
						dates[x-1] = x;
						}
						JComboBox dates_list = new JComboBox(dates);
						dates_list.setSelectedIndex(0);
						JOptionPane.showMessageDialog(null, dates_list, "Which date were you hired ?", JOptionPane.QUESTION_MESSAGE);
						//Create hire date object
						MyDate date = new MyDate(Integer.parseInt(years_list.getSelectedItem().toString()), Integer.parseInt(months_list.getSelectedItem().toString()), Integer.parseInt(dates_list.getSelectedItem().toString()));
						//create faculty object
						Person person = new Faculty(firstname, lastName, address, phoneNumber, emailAddress, rankOfFaculty_list.getSelectedItem().toString(), date);
						personArray[i] = person;
					}
					else {
						throw new Exception();
					}					
					option = 1;
				}
				catch(Exception ex){
					option = JOptionPane.showConfirmDialog(null, "Please select either Student or Faculty. Click No or Cancel if you want to exit the program.");
					if(option != JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Exit program");
						System.exit(0);
					}
				}
			}
		}
		for(int i=0; i < num_per; i++) {
			output += personArray[i].toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, output);
		}
}
