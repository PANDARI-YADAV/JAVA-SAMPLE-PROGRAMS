
import java.util.Scanner;
public class cgpi {
        public static void main(String[] args) throws Exception {
            float sum = 0;
            float total_credits = 20;
        Scanner ap =  new Scanner(System.in);
        System.out.println("enter your maths credits");
        int maths = ap.nextInt();
        System.out.println("enter your physics credits");
        int physics = ap.nextInt();
        System.out.println("enter your electronics credits");
        int electronics = ap.nextInt();
        System.out.println("enter your pop credits");
        int pop = ap.nextInt();
        System.out.println("enter your plc credits");
        int plc = ap.nextInt();
        System.out.println("enter your kannada credits");
        int kannada = ap.nextInt();
        System.out.println("enter your english credits");
        int english = ap.nextInt();
        System.out.println("enter your IDT credits");
        int IDT = ap.nextInt();
        float total_earnedCredits = (maths*4) + (physics*4) + (electronics*3) + (pop*3) + (plc*3) + (kannada*1) + (english*1) + (IDT*1) ;
        float SGPA = total_earnedCredits/total_credits;
        System.out.println("your total  earned credits = "+total_earnedCredits);
        System.out.println("YOUR 1ST SGPA IS = "+SGPA);
        System.out.println("enter your maths2 credits");
        int maths2 = ap.nextInt();
        System.out.println("enter your chemistry credits");
        int chemistry = ap.nextInt();
        System.out.println("enter your electrical credits");
        int electrical = ap.nextInt();
        System.out.println("enter your CAED credits");
        int CAED = ap.nextInt();
        System.out.println("enter your CYBER credits");
        int CYBER = ap.nextInt();
        System.out.println("enter your SFH credits");
        int SFH = ap.nextInt();
        System.out.println("enter your PWSE credits");
        int PWSE = ap.nextInt();
        System.out.println("enter your IINDIAN CONSTITUTION credits");
        int IC = ap.nextInt();
        float total_earnedCredits2 = (maths2*4) + (chemistry*4) + (electrical*3) + (CAED*3) + (CYBER*3) + (SFH*1) + (IC*1) + (PWSE*1) ;
        float SGPA2 = total_earnedCredits2/total_credits;
        System.out.println("your total  earned credits"+total_earnedCredits2);
        System.out.println("your SGPA = "+SGPA2);
        System.out.println("YOUR 2ND SEM SGPA IS = "+SGPA2);
        Float CGPA = (total_earnedCredits+total_earnedCredits2)/40;
        System.out.println("YOUR TOTAL CGPA IS = "+CGPA);
    }
        }
    
