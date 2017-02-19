import java.util.Scanner;

public class Level5 extends Student {
	
	// average of the level 5
	static double avgL5;
	// creating an array to store marks of exams
	static double[] marksL5 = new double[11];
	// creating an array to store averages of each module in level5
	static double[] avgModL5 = new double[6];
	static Scanner sc = new Scanner(System.in);
	
	public static void markGetterL5() {
		
		System.out.println("Level 05");
		System.out.println("Enter marks of Object Oriented Programming module");
		System.out.print("ICT 01 : ");
		marksL5[0] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL5[1] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of Clent Server Architecture module");
		System.out.print("ICT 01 : ");
		marksL5[2] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL5[3] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of System Development module");
		System.out.print("Group Project : ");
		marksL5[4] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of Database Systems module");
		System.out.print("ICT 01 : ");
		marksL5[5] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL5[6] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of Algorithms module");
		System.out.print("ICT 01 : ");
		marksL5[7] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL5[8] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of Optional module");
		System.out.print("ICT 01 : ");
		marksL5[9] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL5[10] = sc.nextDouble();
		System.out.println();
		
		avgModL5[0] = (marksL5[0] + marksL5[1]) / 2;
		avgModL5[1] = (marksL5[2] + marksL5[3]) / 2;
		avgModL5[2] = marksL5[4];
		avgModL5[3] = (marksL5[5] + marksL5[6]) / 2;
		avgModL5[4] = (marksL5[7] + marksL5[8]) / 2;
		avgModL5[5] = (marksL5[9] + marksL5[10]) / 2;

		avgL5 = (avgModL5[0] + avgModL5[1] + avgModL5[2] + avgModL5[3] + avgModL5[4] + avgModL5[5]) / 6;

		// creating a Level5Controller type object and assigning average to it
		// and storing that object in Level5Controller type array
		for (int a = 6; a < 12; a++) {
			Modules moduleL5 = new Modules();
			moduleL5.setAverage(avgModL5[a-6]);
			marksArray.add(moduleL5);
		}
		marksArray.get(6).setModName("Object Oriented Programming         ");
		marksArray.get(7).setModName("Clent Server Architecture           ");
		marksArray.get(8).setModName("System Development                  ");
		marksArray.get(9).setModName("Database Systems                    ");
		marksArray.get(10).setModName("Algorithms                         ");
		marksArray.get(11).setModName("Optional module                    ");
		
	}
	
	// average calculating method for 2,3,4 attempts
	public static void avgSetterL5(int attempt) {
		avgModL5[0] = (marksL5[0] + marksL5[1]) / 2;
		avgModL5[1] = (marksL5[2] + marksL5[3]) / 2;
		avgModL5[2] = marksL5[4];
		avgModL5[3] = (marksL5[5] + marksL5[6]) / 2;
		avgModL5[4] = (marksL5[7] + marksL5[8]) / 2;
		avgModL5[5] = (marksL5[9] + marksL5[10]) / 2;

		avgL5 = (avgModL5[0] + avgModL5[1] + avgModL5[2] + avgModL5[3] + avgModL5[4] + avgModL5[5]) / 6;

		for (int a = 6; a < 12; a++) {
			marksArray.get(a).setAverage(avgModL5[a-6]);
		}
	}
	
	static int failModsL5 = 0;// total number of failed modules in level 5
	static int passModsL5 = 0;// total number of passed modules in level 5
	static int creditsL5 = 0;// total number of credits level 5
	
	//pass or fail setter for exam marks in all attempts in level5
	public static void passFailSetterL5() {
		for (int j = 6; j < 12; j++) {
			if ( marksArray.get(j).getPass()==false && marksArray.get(j).getAverage() >= 40) {
				marksArray.get(j).setPass(true);
				passModsL5 += 1;
				creditsL5 += 20;
			} else if (marksArray.get(j).getPass()==false && marksArray.get(j).getAverage() < 40) {  
				failModsL5++;
				marksArray.get(j).setPass(false);
				marksArray.get(j).setAttempt(true);
			} else {}
		}
	}
	//Level 5 mark getter for attempts 2,3,4
	public static void atmptMarkGetterL5(int atmptNum) {
		if (marksArray.get(6).getAttempt() == atmptNum) {
			System.out.println("Enter marks of Object Oriented Programming module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL5[0] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL5[1] = sc.nextDouble();
			System.out.println();
		} else {}
		if (marksArray.get(7).getAttempt() == atmptNum) {
			System.out.println("\nEnter marks of Clent Server Architecture module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL5[2] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL5[3] = sc.nextDouble();
			System.out.println();
		} else {}
		if (marksArray.get(8).getAttempt() == atmptNum) {
			System.out.println("\nEnter marks of System Development module for attempt "+atmptNum);
			System.out.print("Group Project : ");
			marksL5[4] = sc.nextDouble();
			System.out.println();
		} else {}
		if (marksArray.get(9).getAttempt() == atmptNum) {
			System.out.println("\nEnter marks of Database Systems module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL5[5] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL5[6] = sc.nextDouble();
			System.out.println();
		} else {}
		if (marksArray.get(10).getAttempt() == atmptNum) {
			System.out.println("\nEnter marks of Algorithms module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL5[7] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL5[8] = sc.nextDouble();
			System.out.println();
		} else {}
		if (marksArray.get(11).getAttempt() == atmptNum) {
			System.out.println("\nEnter marks of Optional module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL5[9] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL5[10] = sc.nextDouble();
			System.out.println();
		} else {}
	}
	
	//static boolean exclusionL5 = false;
	static boolean dipHEEligible=false;
	//static boolean eligibleL6 = false;
	//method to display results of level 5
	public static void Level5ListPrint() {
		//checking number of failed modules in level5
		
		if (passModsL5 == 5 ||passModsL5 == 4 || passModsL5 == 3) {
			//exclusionL5 = false;
			marksArray.get(11).setExclusionL5(false);
		} else if (passModsL5 == 0 || passModsL5 == 1 || passModsL5 == 2) {
			//exclusionL5 = true;
			marksArray.get(11).setExclusionL5(true);
		} else {}
		//checking for modules which are failed in all four attempts and setting exclusion status		
		for(int i=6;i<12;i++){
			if(marksArray.get(i).getAttempt()==5 && marksArray.get(11).getExclusionL5()==false){
				//exclusionL5=true;
				marksArray.get(11).setExclusionL5(true);
			}else {}
		}
		//level 6 eligibility
		if (creditsL5 >= 100) {
			//eligibleL6 = true;
			marksArray.get(11).setEligibilityL6(true);
			
		} else {
			//eligibleL6 = false;
			marksArray.get(11).setEligibilityL6(false);
			
		}
		//DipHE eligibility
		if (creditsL5 == 120) {
			dipHEEligible=true;
			marksArray.get(11).setDipHEEligibility(true);
			marksArray.get(11).setLevel5Status("Pass");
		} else {
			marksArray.get(11).setLevel5Status("Fail");
		}		
		int classIndicatorL5=0;
		for(int i=6;i<12;i++){
			if(marksArray.get(i).getAttempt()==1){
				classIndicatorL5++;
			}else{}
		}
		
		//checking eligibility for classes in DipHE
		if (avgL5 >= 70 && dipHEEligible==true && classIndicatorL5==6) {
			//lblDipHEClass.setText("Distinction");
			marksArray.get(11).setDipHEClass("Distinction");
		} else if (avgL5 >= 60 && dipHEEligible==true && classIndicatorL5==6) {
			marksArray.get(11).setDipHEClass("Merit");
			//lblDipHEClass.setText("Merit");
		} else {
			marksArray.get(11).setDipHEClass("-");
			//lblDipHEClass.setText("No");
		}

		//lblL5Credits.setText(String.valueOf(creditsL5));
		marksArray.get(11).setCreditsL5(creditsL5);
		//lblL5Avg.setText(String.valueOf(avgL5));
		marksArray.get(11).setAverageL5(avgL5);
		}	
	 
	
	public static void mainL5(){
		System.out.println("APb");
		markGetterL5();
		avgSetterL5(1);
		passFailSetterL5();
		//Level5ListPrint();

		if (passModsL5 == 6) {
		} else {
			// 2nd round
			atmptMarkGetterL5(2);
			avgSetterL5(2);
			passFailSetterL5();
			//Level5ListPrint();
			if (passModsL5 == 6) {

			} else {
				// 3rd round
				atmptMarkGetterL5(3);
				avgSetterL5(3);
				passFailSetterL5();
				//Level5ListPrint();

				if (passModsL5 == 6) {

				} else {
					// 4th round
					atmptMarkGetterL5(4);
					avgSetterL5(4);
					passFailSetterL5();
					//Level5ListPrint();
					if(passModsL5 == 6){
						
					}else{
						//exit or go back to main menu
					}
				}

			}
		}
	}
}
