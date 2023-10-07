package management;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentDAO sd=new StudentDAO();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Press 1 to add a student");
			System.out.println("Press 2 to display all students");
			System.out.println("Press 3 to update a student");
			System.out.println("Press 4 to delete a student");
			System.out.println("Press any key to exit");
			int input=sc.nextInt();
			if(input==1)
			{
				//insert
				Student s=new Student(sc.nextInt(),sc.next(),sc.next(),sc.next());
				sd.addStudent(s);
			}
			else if(input==2)
			{
				//display
				sd.displayAllStudents();
			}
			else if(input==3)
			{
				//update
				Student s=new Student(sc.nextInt(),sc.next(),sc.next(),sc.next());
				sd.updateStudent(s.getId(),s);
			}
			else if(input==4)
			{
				//delete
				sd.deleteStudent(sc.nextInt());
			}
			else
			{
				break;
			}
		}
		sc.close();
	}
}
