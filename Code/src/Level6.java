import java.util.Scanner;

public class Level6 extends Student {
	
		// average of the level 6
	static double avgL6;
		// creating an array to store marks of exams
	static double[] marksL6 = new double[9];
		// creating an array to store averages of each module in level5
	static double[] avgModL6 = new double[5];
	static Scanner sc = new Scanner(System.in);

		// initial attempt mark getting method
		public static void markGetterL6() {

			System.out.println("Level 06");
			System.out.println("Enter marks of Computer Science Project module");
			System.out.print("Project : ");
			marksL6[0] = sc.nextDouble();
			System.out.println();
			System.out.println("\nEnter marks of Reasoning about Programs module");
			System.out.print("ICT 01 : ");
			marksL6[1] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL6[2] = sc.nextDouble();
			System.out.println();
			System.out.println("\nEnter marks of Security & Forencis module");
			System.out.print("ICT 01 : ");
			marksL6[3] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL6[4] = sc.nextDouble();
			System.out.println();
			System.out.println("\nEnter marks of Optional module 01");
			System.out.print("ICT 01 : ");
			marksL6[5] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL6[6] = sc.nextDouble();
			System.out.println();
			System.out.println("\nEnter marks of Optional module 02");
			System.out.print("ICT 01 : ");
			marksL6[7] = sc.nextDouble();
			System.out.println();
			System.out.print("ICT 02 : ");
			marksL6[8] = sc.nextDouble();
			System.out.println();
			
			
			avgModL6[0] = marksL6[0];
			avgModL6[1] = (marksL6[1] + marksL6[2]) / 2;
			avgModL6[2] = (marksL6[3]+ marksL6[4])/2;
			avgModL6[3] = (marksL6[5] + marksL6[6]) / 2;
			avgModL6[4] = (marksL6[7] + marksL6[8]) / 2;

			
			avgL6=(avgModL6[0]+avgModL6[1]+avgModL6[2]+avgModL6[3]+avgModL6[4])/5;

			// creating a Level6Controller type object and assigning average to it
			// and storing that object in Level6Controller type array
			for (int a = 12; a < 17; a++) {
				Modules moduleL6 = new Modules();
				moduleL6.setAverage(avgModL6[a-12]);
				marksArray.add(moduleL6);
			}
			marksArray.get(12).setModName("Computer Science Project            ");
			marksArray.get(13).setModName("Reasoning about Programs            ");
			marksArray.get(14).setModName("Security & Forencis                 ");
			marksArray.get(15).setModName("Optional module 01                  ");
			marksArray.get(16).setModName("Optional module 02                  ");
			
		}
		// average calculating method for 2,3,4 attempts
		public static void avgSetterL6(int attempt) {
			avgModL6[0] = marksL6[0];
			avgModL6[1] = (marksL6[1] + marksL6[2]) / 2;
			avgModL6[2] = (marksL6[3]+ marksL6[4])/2;
			avgModL6[3] = (marksL6[5] + marksL6[6]) / 2;
			avgModL6[4] = (marksL6[7] + marksL6[8]) / 2;

			avgL6=(avgModL6[0]+avgModL6[1]+avgModL6[2]+avgModL6[3]+avgModL6[4])/5;

			for (int a = 12; a < 17; a++) {
				marksArray.get(a).setAverage(avgModL6[a-12]);
			}
		}
		
		static int failModsL6 = 0;// total number of failed modules in level 6
		static int passModsL6 = 0;// total number of passed modules in level 6
		static int creditsL6 = 0;// total number of credits level 6
		//pass or fail setter for exam marks in all attempts in level6
		public static void passFailSetterL6() {
			for (int j = 12; j < 17; j++) {
				if (marksArray.get(j).getPass() == false && marksArray.get(j).getAverage() >= 40) {
					marksArray.get(j).setPass(true);
					passModsL6 += 1;
					creditsL6 += 20;
					if(j==0){//adding another 20 credits to double credit module
						creditsL6 += 20;
					}else{}
				} else if(marksArray.get(j).getPass() == false && marksArray.get(j).getAverage() < 40){
					failModsL6++;
					marksArray.get(j).setPass(false);
					marksArray.get(j).setAttempt(true);
				}else{}
			}
		}
		//Level 6 mark getter for attempts 2,3,4
		public static void atmptMarkGetterL6(int atmptNum) {
			if (marksArray.get(12).getAttempt() == atmptNum) {
				System.out.println("Enter marks of Computer Science Project module for attempt "+atmptNum);
				System.out.println("Project : ");
				marksL6[0] = sc.nextDouble();
				System.out.println();
			} else {}
			if (marksArray.get(13).getAttempt() == atmptNum) {
				System.out.println("\nEnter marks of Reasoning about Programs module for attempt "+atmptNum);
				System.out.print("ICT 01 : ");
				marksL6[1] = sc.nextDouble();
				System.out.println();
				System.out.print("ICT 02 : ");
				marksL6[2] = sc.nextDouble();
				System.out.println();
			} else {}
			if (marksArray.get(14).getAttempt() == atmptNum) {
				System.out.println("\nEnter marks of Security & Forencis module for attempt "+atmptNum);
				System.out.print("ICT 01 : ");
				marksL6[3] = sc.nextDouble();
				System.out.println();
				System.out.print("ICT 02 : ");
				marksL6[4] = sc.nextDouble();
				System.out.println();
			} else {}
			if (marksArray.get(15).getAttempt() == atmptNum) {
				System.out.println("\nEnter marks of Optional module 01 for attempt "+atmptNum);
				System.out.print("ICT 01 : ");
				marksL6[5] = sc.nextDouble();
				System.out.println();
				System.out.print("ICT 02 : ");
				marksL6[6] = sc.nextDouble();
				System.out.println();
			} else {}
			if (marksArray.get(16).getAttempt() == atmptNum) {
				System.out.println("\nEnter marks of Optional module 02 for attempt "+atmptNum);
				System.out.print("ICT 01 : ");
				marksL6[7] = sc.nextDouble();
				System.out.println();
				System.out.print("ICT 02 : ");
				marksL6[8] = sc.nextDouble();
				System.out.println();
				
			} else {}
		}
		
		//boolean exclusionL6 = false;
		//boolean eligibleL7 = false;
		//boolean nonHons=false;
		//method to display results of level 6
		public static void Level6ListPrint() {
			//checking number of failed modules in level6

			if (passModsL6 == 4 || passModsL6 == 3 || creditsL6==60) {
				//exclusionL6 = false;
				marksArray.get(16).setExclusionL6(false);
			} else if (passModsL6 == 0 || passModsL6 == 1 || passModsL6 == 2) {
				//exclusionL6 = true;
				marksArray.get(16).setExclusionL6(true);
			} else {}
			//checking for modules which are failed in all four attempts and setting exclusion status
			for(int i=12;i<17;i++){
				if(marksArray.get(i).getAttempt()==5 && marksArray.get(16).getExclusionL6()==false){
					//exclusionL6=true;
					marksArray.get(16).setExclusionL6(true);
					
				}else {}
			}
			
			if (creditsL6 == 120) {
				marksArray.get(16).setLevel6Status("Pass");
			} else {
				marksArray.get(16).setLevel6Status("Fail");
			}	
			
			int classIndicatorL6=0;
			for(int i=12;i<17;i++){
				if(marksArray.get(i).getAttempt()==1){
					classIndicatorL6++;
				}else{}
			}
			//checking for non honours eligibility and its class
			if (creditsL6 >= 60 && creditsL6< 120 && avgL6>=70 && classIndicatorL6==5) {
				marksArray.get(16).setNonHonsEligibility(true);
				marksArray.get(16).setNonHonsClass("Distinction");
				//lblBscNonHonsClass.setText("Distinction");
				//eligibleL7 = true;
			} else if(creditsL6 >= 60 && creditsL6< 120 && avgL6>=60 && classIndicatorL6==5){
				//lblBscNonHonsEligible.setText("Eligible");
				//lblBscNonHonsClass.setText("Merit");
				marksArray.get(16).setNonHonsEligibility(true);
				marksArray.get(16).setNonHonsClass("Merit");
				//eligibleL7 = false;
			}else if(creditsL6 >= 60 && creditsL6< 120){
				//lblBscNonHonsEligible.setText("Eligible");
				//lblBscNonHonsClass.setText("-");
				marksArray.get(16).setNonHonsEligibility(true);
				marksArray.get(16).setNonHonsClass("-");
			}else{}
			
			//lblL6Credits.setText(String.valueOf(creditsL6));
			marksArray.get(16).setCreditsL6(creditsL6);
			//lblL6Avg.setText(String.valueOf(avgL6));
			marksArray.get(16).setAverageL6(avgL6);
		} 

	public static void mainL6(){
		System.out.println("APb");
		markGetterL6();
		avgSetterL6(1);
		passFailSetterL6();
		//Level6ListPrint();

		if (passModsL6 == 5) {
		} else {
			// 2nd round
			atmptMarkGetterL6(2);
			avgSetterL6(2);
			passFailSetterL6();
			//Level6ListPrint();
			if (passModsL6 == 5) {

			} else {
				// 3rd round
				atmptMarkGetterL6(3);
				avgSetterL6(3);
				passFailSetterL6();
				//Level6ListPrint();

				if (passModsL6 == 5) {

				} else {
					// 4th round
					atmptMarkGetterL6(4);
					avgSetterL6(4);
					passFailSetterL6();
					//Level6ListPrint();
					if(passModsL6 == 5){
						
					}else{
						//exit or go back to main menu
					}
				}

			}
		}
	}	
}
