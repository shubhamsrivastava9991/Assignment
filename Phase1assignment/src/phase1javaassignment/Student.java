package phase1javaassignment;


	public class Student {
		
		String name;
		int age;
		char section,gender;
		int subject1, subject2, subject3;
		float marksobtained;
		float percentage;
		
		Student(String n, int ag, char sec,char gend, int sub1, int sub2, int sub3){
			name= n;
			age= ag;
			section=sec;
			gender=gend;
			subject1=sub1;
			subject2=sub2;
			subject3=sub3;
		}
		
		Student(String n , int ag, char sec, char gend, int sub2,int sub3 ){
			name= n;
			age= ag;
			section=sec;
			gender=gend;
			subject2=sub2;
			subject3=sub3;
		}
			
		
		//Method to display the Student Details
		void display(){
			System.out.println("Name: " + name + " Age: " + age + " Section: "+ section + " Gender: "+ gender + " Subject1 Marks: "+ subject1+ " Subject2 Marks: "+subject2+ " Subject3 Marks: "+ subject3);
			marksobtained = subject1 + subject2 + subject3;
			percentage= ((marksobtained/300) * 100);
			System.out.println("Marks obtained: " + marksobtained + " of Total Marks: 300");
			System.out.println("Percentage is: " + percentage);
		}

		public static void main(String[] args) {
			
			//Creating object of Class Student and Passing the parameter
			Student s1 = new Student("Shubham", 23, 'B' ,'M', 89,85,90);
			Student s2 = new Student("Sagar", 24, 'C' ,'M',90,86,80);
			Student s3 = new Student("Rohit", 27, 'A' ,'M',87,80);
			Student s4 = new Student("Shalini", 28, 'C' ,'F',83,85);
			
			//Calling the method
			s1.display();
			s2.display();
			s3.display();
			s4.display();
		}

	}

/*
    Output
    
Name: Shubham Age: 23 Section: B Gender: M Subject1 Marks: 89 Subject2 Marks: 85 Subject3 Marks: 90
Marks obtained: 264.0 of Total Marks: 300
Percentage is: 88.0
Name: Sagar Age: 24 Section: C Gender: M Subject1 Marks: 90 Subject2 Marks: 86 Subject3 Marks: 80
Marks obtained: 256.0 of Total Marks: 300
Percentage is: 85.333336
Name: Rohit Age: 27 Section: A Gender: M Subject1 Marks: 0 Subject2 Marks: 87 Subject3 Marks: 80
Marks obtained: 167.0 of Total Marks: 300
Percentage is: 55.666668
Name: Shalini Age: 28 Section: C Gender: F Subject1 Marks: 0 Subject2 Marks: 83 Subject3 Marks: 85
Marks obtained: 168.0 of Total Marks: 300
Percentage is: 56.0

 */
