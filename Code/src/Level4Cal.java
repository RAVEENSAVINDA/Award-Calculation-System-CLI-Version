import java.util.Scanner;

public class Level4Cal extends Student {
	
	// average of the level 4
	static double avgL4;
	// creating an array to store marks of exams
	static double[] marksL4 = new double[14];
	// creating an array to store averages of each module in level4
	static double[] avgModL4 = new double[6];
	static Scanner sc = new Scanner(System.in);
	// mark getting method
	public static void markGetterL4() {
		
		System.out.println("Level 04");
		System.out.println("Enter marks of Software Development Principles 01 module");
		System.out.print("ICT 01 : ");
		marksL4[0] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL4[1] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 03 : ");
		marksL4[2] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of Communication & Career Managment module");
		System.out.print("Portfolio    : ");
		marksL4[3] = sc.nextDouble();
		System.out.println();
		System.out.print("Presentation : ");
		marksL4[4] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of Computer System Fundamentals module");
		System.out.print("ICT 01 : ");
		marksL4[5] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL4[6] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of Information and Data Modeling module");
		System.out.print("ICT 01 : ");
		marksL4[7] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL4[8] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of Information Systems module");
		System.out.print("ICT 01 : ");
		marksL4[9] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL4[10] = sc.nextDouble();
		System.out.println();
		System.out.println("\nEnter marks of Software Development Principles 02 module");
		System.out.print("ICT 01 : ");
		marksL4[11] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 02 : ");
		marksL4[12] = sc.nextDouble();
		System.out.println();
		System.out.print("ICT 03 : ");
		marksL4[13] = sc.nextDouble();
		System.out.println();

		avgModL4[0] = (marksL4[0] + marksL4[1] + marksL4[2]) / 3;
		avgModL4[1] = (marksL4[3] + marksL4[4]) / 2;
		avgModL4[2] = (marksL4[5] + marksL4[6]) / 2;
		avgModL4[3] = (marksL4[7] + marksL4[8]) / 2;
		avgModL4[4] = (marksL4[9] + marksL4[10]) / 2;
		avgModL4[5] = (marksL4[11] + marksL4[12] + marksL4[13]) / 3;

		avgL4 = (avgModL4[0] + avgModL4[1] + avgModL4[2] + avgModL4[3] + avgModL4[4] + avgModL4[5]) / 6;
		// creating a Level4Cal type object and assigning average to it
		// and storing that object in Level4Cal type array
		for (int a = 0; a < 6; a++) {
			Modules moduleL4 = new Modules();
			moduleL4.setAverage(avgModL4[a]);
			marksArray.add(moduleL4);

		}
		
		marksArray.get(0).setModName("Software Development Principles 01  ");
		marksArray.get(1).setModName("Communication & Career Managment    ");
		marksArray.get(2).setModName("Computer System Fundamentals        ");
		marksArray.get(3).setModName("Information and Data Modeling       ");
		marksArray.get(4).setModName("Information Systems                 ");
		marksArray.get(5).setModName("Software Development Principles 02  ");
		

	}

	// average calculating method
	public static void avgSetterL4(int attempt) {
	
		avgModL4[0] = (marksL4[0] + marksL4[1] + marksL4[2]) / 3;
		avgModL4[1] = (marksL4[3] + marksL4[4]) / 2;
		avgModL4[2] = (marksL4[5] + marksL4[6]) / 2;
		avgModL4[3] = (marksL4[7] + marksL4[8]) / 2;
		avgModL4[4] = (marksL4[9] + marksL4[10]) / 2;
		avgModL4[5] = (marksL4[11] + marksL4[12] + marksL4[13]) / 3;

		avgL4 = (avgModL4[0] + avgModL4[1] + avgModL4[2] + avgModL4[3] + avgModL4[4] + avgModL4[5]) / 6;
		// storing new averages(attempt 2,3,4 marks) into Level4Controller type
		// array
		for (int a = 0; a < 6; a++) {
			marksArray.get(a).setAverage(avgModL4[a]);
		}
	}

	static int totalCondonedMods = 0;// total number of already condoned modules
	static int condonePendingdMods = 0;// total number of condone pending modules
	static int failModsL4 = 0; // total number of failed modules in level 4
	static int passModsL4 = 0;// total number of passed modules in level 4
	static int creditsL4 = 0;// total number of credits level 4
	static int condonedCredits = 0;// total number of condoned credits

	// setting pass or fail a module and whether it eligible to be condoned
	public static void attemptPassFailSetterL4() {
		for (int j = 0; j < 6; j++) {
			if (marksArray.get(j).getPass() == false && marksArray.get(j).getAverage() >= 40) {
				marksArray.get(j).setPass(true);
				passModsL4 += 1;
				creditsL4 += 20;
			} else if (marksArray.get(j).getPass() == false && marksArray.get(j).getAverage() < 40) {
				marksArray.get(j).setPass(false);
				marksArray.get(j).setAttempt(true);
			} else {
			}
		}
	}

	// pass or fail setter and condone setter for initial attempt marks
	public static void condoneSetterL4() {
		for (int j = 0; j < 6; j++) {
			if (marksArray.get(j).getPass() == false && marksArray.get(j).getAverage() >= 40) {
				marksArray.get(j).setPass(true);
				marksArray.get(j).setCondonedPassed(false);
				marksArray.get(j).setCondonePendingStatus(false);
				passModsL4 += 1;
				creditsL4 += 20;
			} else if (marksArray.get(j).getPass() == false && marksArray.get(j).getAverage() >= 30) {
				condonePendingdMods += 1;
				marksArray.get(j).setPass(false);
				marksArray.get(j).setCondonedPassed(false);
				marksArray.get(j).setCondonePendingStatus(true);
			} else if (marksArray.get(j).getCondonedPassed() == false) {
				failModsL4++;
				marksArray.get(j).setPass(false);
				marksArray.get(j).setCondonedPassed(false);
				marksArray.get(j).setCondonePendingStatus(false);
			} else {
			}
		}
		if (totalCondonedMods < 2 && condonePendingdMods == 1) {
			for (int i = 0; i < 6; i++) {
				if (marksArray.get(i).getCondonePendingStatus() == true) {
					creditsL4 += 20;
					condonedCredits += 20;
					totalCondonedMods += 1;
					passModsL4 += 1;
					marksArray.get(i).setPass(true);
					if (marksArray.get(i).getAverage() >= 40) {
						marksArray.get(i).setAverage(40);
					} else {
					}
					marksArray.get(i).setCondonePendingStatus(false);
					marksArray.get(i).setCondonedPassed(true);
					condonePendingdMods = 0;
				} else {
				}
			}
		}
		if (totalCondonedMods < 2 && condonePendingdMods >= 2) {
			creditsL4 += 40;
			condonedCredits += 40;
			totalCondonedMods += 2;
			passModsL4 += 2;
			condonePendingdMods = 0;
			// finding the largest averages among condone pending modules
			double large1 = 0, large2 = 0;
			int indicator1 = 0, indicator2 = 0;
			for (int c = 0; c < 6; c++) {
				if (marksArray.get(c).getCondonePendingStatus() == true && marksArray.get(c).getAverage() > large1) {
					large1 = marksArray.get(c).getAverage();
					indicator1 = c;
				} else {
				}
			}
			for (int m = 0; m < 6; m++) {
				if (marksArray.get(m).getCondonePendingStatus() == true && marksArray.get(m).getAverage() > large2
						&& m != indicator1) {
					large2 = marksArray.get(m).getAverage();
					indicator2 = m;
				} else {
				}
			}
			if (marksArray.get(indicator1).getAverage() > 40) {
				marksArray.get(indicator1).setAverage(40);
			} else {
			}
			marksArray.get(indicator1).setCondonedPassed(true);
			marksArray.get(indicator1).setCondonePendingStatus(false);
			marksArray.get(indicator1).setPass(true);
			if (marksArray.get(indicator2).getAverage() >= 40) {
				marksArray.get(indicator2).setAverage(40);
			} else {
			}
			marksArray.get(indicator2).setCondonedPassed(true);
			marksArray.get(indicator2).setCondonePendingStatus(false);
			marksArray.get(indicator2).setPass(true);
		} else {
		}
		for (int d = 0; d < 6; d++) {
			if (marksArray.get(d).getPass() == false) {
				marksArray.get(d).setCondonePendingStatus(false);
				marksArray.get(d).setCondonedPassed(false);
				marksArray.get(d).setAttempt(true);
			} else {
			}
		}
	}
	
	//Level 4 mark getter for attempts 2,3,4
	public static void atmptMarkGetterL4(int atmptNum){
		if(marksArray.get(0).getAttempt()==atmptNum){
			System.out.println("Enter marks of Software Development Principles 01 module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL4[0] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL4[1] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 03 : ");
			marksL4[2] = sc.nextDouble();
			System.out.println();
		}else{}
		if(marksArray.get(1).getAttempt()==atmptNum){
			System.out.println("\nEnter marks of Communication & Career Managment module for attempt "+atmptNum);
			System.out.print("Portfolio    : ");
			marksL4[3] = sc.nextDouble();
			System.out.println();
			System.out.print("Presentation : ");
			marksL4[4] = sc.nextDouble();
			System.out.println();
		}else{}
		if(marksArray.get(2).getAttempt()==atmptNum){
			System.out.println("\nEnter marks of Computer System Fundamentals module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL4[5] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL4[6] = sc.nextDouble();
			System.out.println();
		}else{}
		if(marksArray.get(3).getAttempt()==atmptNum){
			System.out.println("\nEnter marks of Information and Data Modeling module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL4[7] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL4[8] = sc.nextDouble();
			System.out.println();
		}else{}
		if(marksArray.get(4).getAttempt()==atmptNum){
			System.out.println("\nEnter marks of Information Systems module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL4[9] = sc.nextDouble();
			System.out.print("ICT 02 : ");
			marksL4[10] = sc.nextDouble();
		}else{}
		if(marksArray.get(5).getAttempt()==atmptNum){
			System.out.println("\nEnter marks of Software Development Principles 02 module for attempt "+atmptNum);
			System.out.print("ICT 01 : ");
			marksL4[11] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL4[12] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 03 : ");
			marksL4[13] = sc.nextDouble();
			System.out.println();
		}else{}
	}

	//static boolean exclusionL4 =false;
	static boolean certHEEligible=false;
	 //boolean eligibleL5=false;
	
	//method to display results of level 4
	public static void level4ListPrint() {
		
		//checking number of failed modules in level4
		if(passModsL4==3 || passModsL4==4 || passModsL4==5){
			//exclusionL4=false;
			marksArray.get(5).setExclusionL4(false);
		}else if(passModsL4==0 || passModsL4==1 || passModsL4==2 ){
			//exclusionL4=true;
			marksArray.get(5).setExclusionL4(true);
		}else{}
		//checking for modules which are failed in all four attempts and setting exclusion status
		for(int i=0;i<6;i++){
			if(marksArray.get(i).getAttempt()==5 && marksArray.get(5).getExclusionL4()==false){
				//exclusionL4=true;
				marksArray.get(5).setExclusionL4(true);
			}else {}
		}
		//level 5 eligibility
				if(creditsL4>=100){
					marksArray.get(5).setEligibilityL5(true);
					//eligibleL5=true;
				}else{
					marksArray.get(5).setEligibilityL5(false);
					//eligibleL5=false;
				}
		//CertHE eligibility
		if(creditsL4==120){
			//certHEEligible=true;
			marksArray.get(5).setCertHEEligibility(true);
			marksArray.get(5).setLevel4Status("Pass");
		}else{
			//certHEEligible=false;
			marksArray.get(5).setCertHEEligibility(false);
			marksArray.get(5).setLevel4Status("Fail");
		}
		int classIndicatorL4=0;
		for(int i=0;i<6;i++){
			if(marksArray.get(i).getAttempt()==1){
				classIndicatorL4++;
			}else{}
		}
		//checking eligibility for classes in CertHE
		if(avgL4>=70 && certHEEligible==true && classIndicatorL4==6){
			//lblCertHEClass.setText("Distinction");
			marksArray.get(5).setCertHEClass("Distinction");
		}else if(avgL4>=60 && certHEEligible==true && classIndicatorL4==6){
			//lblCertHEClass.setText("Merit");
			marksArray.get(5).setCertHEClass("Merit");
		}else{
			marksArray.get(5).setCertHEClass("-");
			//lblCertHEClass.setText("No");
		}
		marksArray.get(5).setCreditsL4(creditsL4);
		//lblL4Credits.setText(String.valueOf(creditsL4));
		marksArray.get(5).setCondonedCredits(condonedCredits);
		//lblCondCredits.setText(String.valueOf(condonedCredits));
		marksArray.get(5).setAverageL4(avgL4);
		//lblL4Avg.setText(String.valueOf(avgL4));


	} 
	
	public static void mainL4(){
		
		System.out.println("APL");
		markGetterL4();
		avgSetterL4(1);
		condoneSetterL4();
		//level4ListPrint();

		if (passModsL4 == 6) {
		} else {
			// 2nd round
			atmptMarkGetterL4(2);
			avgSetterL4(2);
			attemptPassFailSetterL4();
			// Level4Cal.level4ListPrint();
			if (passModsL4 == 6) {

			} else {
				// 3rd round
				atmptMarkGetterL4(3);
				avgSetterL4(3);
				attemptPassFailSetterL4();
				// level4ListPrint();

				if (passModsL4 == 6) {

				} else {
					// 4th round
					atmptMarkGetterL4(4);
					avgSetterL4(4);
					attemptPassFailSetterL4();
					//level4ListPrint();
					if(passModsL4 == 6){
						
					}else{
						//exit or go back to main menu
					}
				}

			}
		}
	}
}
