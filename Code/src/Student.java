import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Modules implements Serializable {
	
	



	@Override
	public String toString() {
		return "Student [name=" + studentName + ", Index=" + indexNo + "]";
	}
   private  ArrayList<Student> studentArray=new ArrayList<Student>();
	
   public ArrayList<Student> getStudentArray() {
		return studentArray;
	}

	public void setStudentArray(ArrayList<Student> studentArray) {
		this.studentArray = studentArray;
	}
   
   static ArrayList<Modules> marksArray = new ArrayList<Modules>();
	
   // private ArrayList<Modules> moduleArray = new ArrayList<Modules>();
  
//	
//    public ArrayList<Modules> getArray() {
//		return marksArray ;
//	}
//
//	public void setArray(ArrayList<Modules> array) {
//		this.marksArray  = array;
//	}
//	
	private String studentName;
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	private int indexNo;

	public int getIndexNo() {
		return indexNo;
	}

	public void setIndexNo(int indexNo) {
		this.indexNo = indexNo;
	}

	public static void getStudentDetails(Student st) {
		
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the name of the student : ");
		String studentName=input.nextLine();
		System.out.println();
		System.out.print("Enter the Index number of the student : ");
		int indexNo=input.nextInt();
		System.out.println();
		
		st.setStudentName(studentName);
		st.setIndexNo(indexNo);
		
		}
	
//	public static Student returnObject(){
//		
//	}
	
	private  ArrayList<Modules> array;
	public void setArray(ArrayList<Modules> array){
		this.array=array;
	}
	public ArrayList<Modules> getArray(){
		return array;
	}
	
	public  void main() throws Exception{
		Student st=new Student();
		
		boolean repeat=true;
		Scanner sc=new Scanner(System.in);
		while(repeat==true){
		
		getStudentDetails(st);
		(new Level4Cal()).mainL4();
		if (Level4Cal.passModsL4 == 6) {
			(new Level5()).mainL5();
			if (Level5.passModsL5 == 6) {
				(new Level6()).mainL6();
				if (Level6.passModsL6 == 5) {
					//getting arrays of module averages from level 5 and 6 and passing them 
					//to method for classification of Bsc.Eng honours 
					
					AwardCalculation.honsAwardStep03(AwardCalculation.honsAwardStep01(),AwardCalculation.honsAwardStep02());
				}else{}
			}else{}
		} else {} 
		
		//System.out.println(marksArray);
		//System.out.println(marksArray.get(0).getAverage());
		//System.out.println(marksArray.get(0).getAttempt());
		st.setArray(marksArray);
		st.studentArray.add(st);
		
		//System.out.println(studentArray.get(0).array.get(0).getAverage());
		
		//System.out.println(st.array.get(0).getAverage());
		System.out.println("Do you want to add another student details?");
		System.out.println("If yes enter y or enter any other key to continue");
		String response=sc.next();
		if(response.equalsIgnoreCase("y")){
			repeat=true;
		}else{
			repeat=false;
		}
		
		}
		System.out.println("Before file");
		File file=new File("Student_Details.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		for (Student stu : st.studentArray){
			oos.writeObject(stu);
		}
		oos.flush();
		oos.close(); 
		fos.close();
		System.out.println("after file");
		
		//File file=new File("Student_Details.txt");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		try {
			while(true){
			Student s1=(Student)ois.readObject();
			System.out.println(s1);
			}
		} catch (EOFException e) {
			System.out.println("Completed");
		}
		
	}
	public static void studentReport() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the student index number : ");
		int number=sc.nextInt();
		System.out.println();
		
		File file=new File("Student_Details.txt");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		try {
			while(true){
			Student s1=(Student)ois.readObject();
			if(s1.getIndexNo()==number){
				System.out.println(s1);
				System.out.println("Final Transcrpit of the Student \n");
				System.out.println("Index Number : "+s1.getIndexNo());
				System.out.println("Name : "+s1.getStudentName());
				System.out.println("\nLevel 04 ");
		        System.out.println("                                    ");
				System.out.println("            Module Name                  Average      Attempt    Pass/Fail     Condoned Status");
				System.out.println(s1.array.get(0).getModName()+"    "+s1.array.get(0).getAverage()+"             "+s1.array.get(0).getAttempt()+"          "+s1.array.get(0).getPass()+"          "+s1.array.get(0).getCondonedPassed());
				System.out.println(s1.array.get(1).getModName()+"    "+s1.array.get(1).getAverage()+"             "+s1.array.get(1).getAttempt()+"          "+s1.array.get(1).getPass()+"          "+s1.array.get(1).getCondonedPassed());				
				System.out.println(s1.array.get(2).getModName()+"    "+s1.array.get(2).getAverage()+"             "+s1.array.get(2).getAttempt()+"          "+s1.array.get(2).getPass()+"          "+s1.array.get(2).getCondonedPassed());				
				System.out.println(s1.array.get(3).getModName()+"    "+s1.array.get(3).getAverage()+"             "+s1.array.get(3).getAttempt()+"          "+s1.array.get(3).getPass()+"          "+s1.array.get(3).getCondonedPassed());				
				System.out.println(s1.array.get(4).getModName()+"    "+s1.array.get(4).getAverage()+"             "+s1.array.get(4).getAttempt()+"          "+s1.array.get(4).getPass()+"          "+s1.array.get(4).getCondonedPassed());				
				System.out.println(s1.array.get(5).getModName()+"    "+s1.array.get(5).getAverage()+"             "+s1.array.get(5).getAttempt()+"          "+s1.array.get(5).getPass()+"          "+s1.array.get(5).getCondonedPassed());				
				System.out.println("Level Status        : "+s1.array.get(5).getLevel4Status());
				System.out.println("Level Credits       : "+s1.array.get(5).getCreditsL4());
				System.out.println("Condoned Credits    : "+s1.array.get(5).getCondonedCredits());
				System.out.println("Level Average       : "+s1.array.get(5).getAverageL4());
				System.out.println("Exclusion from L4   : "+s1.array.get(5).getExclusionL4());
				System.out.println("Level 5 Eligibility : "+s1.array.get(5).getEligibilityL5());
				System.out.println("Eligibility to CertHE : "+s1.array.get(5).getCertHEEligibility()+"   CertHE Classification : "+s1.array.get(5).getCertHEClass());
				
				if(s1.array.get(5).getEligibilityL5()==true){
				System.out.println("\n\nLevel 05");
				System.out.println("            Module Name                  Average      Attempt    Pass/Fail ");
				System.out.println(s1.array.get(6).getModName()+"    "+s1.array.get(6).getAverage()+"             "+s1.array.get(6).getAttempt()+"          "+s1.array.get(6).getPass());
				System.out.println(s1.array.get(7).getModName()+"    "+s1.array.get(7).getAverage()+"             "+s1.array.get(7).getAttempt()+"          "+s1.array.get(7).getPass());				
				System.out.println(s1.array.get(8).getModName()+"    "+s1.array.get(8).getAverage()+"             "+s1.array.get(8).getAttempt()+"          "+s1.array.get(8).getPass());				
				System.out.println(s1.array.get(9).getModName()+"    "+s1.array.get(9).getAverage()+"             "+s1.array.get(9).getAttempt()+"          "+s1.array.get(9).getPass());				
				System.out.println(s1.array.get(10).getModName()+"     "+s1.array.get(10).getAverage()+"             "+s1.array.get(10).getAttempt()+"          "+s1.array.get(10).getPass());				
				System.out.println(s1.array.get(11).getModName()+"     "+s1.array.get(11).getAverage()+"             "+s1.array.get(11).getAttempt()+"          "+s1.array.get(11).getPass());				
				System.out.println("Level Status     : "+s1.array.get(11).getLevel5Status());
				System.out.println("Level Credits    : "+s1.array.get(11).getCreditsL5());
				System.out.println("Level Average    : "+s1.array.get(11).getAverageL5());
				System.out.println("Exclusion from L5: "+s1.array.get(11).getExclusionL5());
				System.out.println("Level 6 Eligibility : "+s1.array.get(11).getEligibilityL6());
				System.out.println("Eligibility to DipHE : "+s1.array.get(11).getDipHEEligibility()+"   DipHE Classification : "+s1.array.get(11).getDipHEClass());
				
				
				if(s1.array.get(11).getEligibilityL6()==true){
				System.out.println("\n\nLevel 06");
				System.out.println("            Module Name                  Average      Attempt    Pass/Fail ");			
				System.out.println(s1.array.get(12).getModName()+"     "+s1.array.get(12).getAverage()+"             "+s1.array.get(12).getAttempt()+"          "+s1.array.get(12).getPass());
				System.out.println(s1.array.get(13).getModName()+"     "+s1.array.get(13).getAverage()+"             "+s1.array.get(13).getAttempt()+"          "+s1.array.get(13).getPass());				
				System.out.println(s1.array.get(14).getModName()+"     "+s1.array.get(14).getAverage()+"             "+s1.array.get(14).getAttempt()+"          "+s1.array.get(14).getPass());				
				System.out.println(s1.array.get(15).getModName()+"     "+s1.array.get(15).getAverage()+"             "+s1.array.get(15).getAttempt()+"          "+s1.array.get(15).getPass());				
				System.out.println(s1.array.get(16).getModName()+"     "+s1.array.get(16).getAverage()+"             "+s1.array.get(16).getAttempt()+"          "+s1.array.get(16).getPass());				
				System.out.println("Level Status     : "+s1.array.get(16).getLevel6Status());
				System.out.println("Level Credits    : "+s1.array.get(16).getCreditsL6());
				System.out.println("Level Average    : "+s1.array.get(16).getAverageL6());
				System.out.println("Exclusion from L6: "+s1.array.get(16).getExclusionL6());
				System.out.println("Eligibility to Bsc Eng. NonHons : "+s1.array.get(16).getNonHonsEligibility()+"   Bsc Eng. NonHons Classification : "+s1.array.get(16).getNonHonsClass());
				}
				}
				break;
			}
			}
			ois.close();
		} catch (EOFException e) {
			System.out.println("Invalid student index number");
		}
			
	}
	
	
}
