package DBMS;
import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class Assignment0 
{
	public static void main(String[] args) 
	{
		try 
		{
			String line = "";
			int p,r = 0;
			FileReader myFile = new FileReader("C:\\Users\\Lenovo\\Desktop\\Meet\\DBMS\\Football_Players_Dataset.txt");
			BufferedReader br = new BufferedReader(myFile);
			Scanner sc = new Scanner(System.in);
			System.out.println("K(1 - Id, 2 - Name, 3 - Age, 4 - Height_cm, 5 - Weight_kg, 6 - Overall_Rating, 7 - Club_Rating, 8 - Crossing, 9 - Finishing, 10 - Heading_Accuracy, 11 - Short_Passing, 12 - Long_Passing, 13 - Volleys, 14 - Dribbling, 15 - Curve, 16 - Freekick_Accuracy, 17 - Ball_Control, 18 - Acceleration, 19 - Sprint_Speed, 20 - Balance, 21 - Stamina, 22 - Strength, 23 - Penalties, 24 - Interceptions, 25 - Standing_Tackle, 26 - Sliding_Tackle, 27 - GK_Diving, 28 - GK_Handling, 29 - GK_Reflexes");
			System.out.println("*****QUERY CHOICES*****");
			System.out.println("1.  Overall_Rating");
			System.out.println("2.  Club_Rating");
			System.out.println("3.  Crossing");
			System.out.println("4.  Finishing");
			System.out.println("5.  Heading_Accuracy");
			System.out.println("6.  Short_Passing");
			System.out.println("7.  Long_Passing");
			System.out.println("8.  Volleys");
			System.out.println("9.  Dribbling");
			System.out.println("10. Curve");
			System.out.println("11. Freekick_Accuracy");
			System.out.println("12. Ball_Control");
			System.out.println("13. Acceleration");
			System.out.println("14. Sprint_Speed");
			System.out.println("15. Balance");
			System.out.println("16. Stamina");
			System.out.println("17. Strength");
			System.out.println("18. Penalties");
			System.out.println("19. Interceptions");
			System.out.println("20. Standing_Tackle");
			System.out.println("21. Sliding_Tackle");
			System.out.println("22. GK_Diving");
			System.out.println("23. GK Handling");
			System.out.println("24. GK_Reflexes");
			System.out.println("ENTER YOUR CHOICE : ");
			int x=sc.nextInt();
			System.out.println("Enter lower limit :");
			int m=sc.nextInt();
			System.out.println("Enter upper limit :");
			int n=sc.nextInt();
			int count=0;
			while ((line = br.readLine()) != null) 
			{
				String[] values = line.split(",");
				p = Integer.valueOf(values[4+x]);
				if(p>=m && p<=n)
				{
					count++;
					System.out.println("K1 : "+values[0]+" K2 : "+values[1]+ " K3 : "+values[2]+" K4 : "+values[3]+" K5 : "+values[4]+ " K6 : "+values[5]+" K7 : "+values[6]+" K8 : "+values[7]+" K9 : "+values[8]+" K10 : "+values[9]+" K11 : "+values[10]+" K12 : "+values[11]+" K13 : "+values[12]+" K14 : "+values[13]+" K15 : "+values[14]+" K16 : "+values[15]+" K17 : "+values[16]+" K18 : "+values[17]+" K19 : "+values[18]+" K20 : "+values[19]+" K21 : "+values[20]+" K22 : "+values[21]+" K23 : "+values[22]+" K24 : "+values[23]+" K25 : "+values[24]+" K26 : "+values[25]+" K27 : "+values[26]+" K28 : "+values[27]+" K29 : "+values[28]);
					System.out.println("");
				}
			}
			if(count==0)
			{
				System.out.println("No player with such attribute found");
			}
			br.close();
			sc.close();
		} 
		catch(IOException e) 
		{
			System.out.println("File not found");
			e.printStackTrace();
		}	
}
	

	
			
		
			
		
		

	
		

		
		
		
		
			
		
		
		
		
		
	
		
			
				
				
					
					
				
				
				
					
				
			
		
		
	}
	
		


