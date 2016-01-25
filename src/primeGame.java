
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random ;
import java.util.Date;
import javax.swing.JFrame;


public class primeGame {

	public static void main(String[] args) {
		int i, j, a=1, k, dButton, dResult, right=0, wrong=0,temp,temp1, check, level, rand1=0, rand2=0, count, total=0;
		double score=0.0 , scoreLevel=0.0, minus=0.0 ;
		dButton = JOptionPane.YES_NO_OPTION ;
		long startTime , endTime, diffTime=0 , minute=0 , second=0;
		
		do{
			   System.out.println("Game has been startet :");
			     score = 0;
					rand1 = 0;
					rand2 = 0;
					total = 0;
					minus = 0;
			        a++;
			        
     startTime = new Date().getTime();
     
	System.out.println("Start time is :"+startTime);
	
     for(level=1; level<=2; level++){
    		
    	 rand1 = rand1 + 50;
 		rand2 = rand1 - 50;
 		
System.out.println("Lower limit is :"+rand2+" and the upper limit is :" + rand1);
	for(count=1; count<=2; count++){
		Random rnd = new Random();
		temp = rnd.nextInt(rand1);
		if(temp>=50){
			temp1 = temp;
		}
		else{
			temp1 = temp + rand2 + 1;
		}
		System.out.println("Is this a prime number ?  "+temp1);
		check = 0;
		for(i=2; i<=temp1/2; i++){
			if(temp1%i==0)
				check = 1;
		}
    	dResult = JOptionPane.showConfirmDialog(null,"Number","Yes or no",dButton);
    	//System.out.println(dResult);
		if(check==0 && dResult==0){
			System.out.println("Right , "+temp1+" is a prime number.");
			score=score + 1;
		}
		else if(check==1 && dResult==1){
			System.out.println("Right , "+temp1+" is not a prime number.");
			score = score + 1;
		}
		else if(check==0 && dResult==1){
			System.out.println("Wrong , "+temp1+" is a prime number.");
			score = score - 0.25; 
		}
		else if(check==1 && dResult==0){
			System.out.println("Wrong , "+temp1+" is not a prime number.");
			score = score - 0.25;
		}
		 endTime = new Date().getTime();
		 diffTime = endTime - startTime ;
	}
	diffTime = diffTime / 1000;
	minute = diffTime/60;
	second = diffTime%60;
	
--count;
total = total + count;
scoreLevel  = total - minus;
minus = minus + 1.25;

if(score>=scoreLevel){
	System.out.println("You are eligible for the next level :");
	continue;
}
else if(level==3){
	 System.out.println("The time you have taken to play the game :"+ minute+"  minutes  and "+second+"  seconds");
	 System.out.println("Your score is :"+score+" out of :"+total);
	 break;
}

else {
	System.out.println("Sorry, You are not eligible for the next level :");
	System.out.println("The time you have taken to play the game :"+ minute+"  minutes  and "+second+"  seconds");
	System.out.println("Your score is :"+score+" out of :"+total);
	break;
}


    }
     
     
 
        
		}while(a<=2);
	}

}
