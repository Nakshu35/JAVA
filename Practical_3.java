import java.util.Scanner;
public class Practical_3 {
    public static boolean isleapyear(int year){
        if(year %4==0 && year%100!=0){
            return true;
        }
        return false;
    }
    public static int daysofweek(int Month,int year)
    {
        int day = 1;
        int y = year - (14 - Month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = Month + 12 * ((14 - Month) / 12) - 2;
        return (day + x + (31 * m) / 12) % 7;
    }
    public static void printcalender(int Month,String[] month,int[] days_months,int year){
        System.out.println(month[Month-1]+" " + year);
        System.out.println("Su Mn Tu Wd Th Fr Sa");
        int day_ofweek=daysofweek(Month,year);
        for(int i=0;i<day_ofweek;i++){
            System.out.print("   ");
        }
        for(int i=1;i<=days_months[Month-1];i++){
            System.out.printf("%2d ",i);
            day_ofweek++;
            if(day_ofweek%7==0) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String[] months={"January","febuaray","march","april","may","june","july","august","september","october","november","december"};
        int[] days_months={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Enter month(1-12): ");
        int Month=scan.nextInt();
        System.out.print("Enter year: ");
        int year=scan.nextInt();
        if(isleapyear(year))
        {
            days_months[1]=29;
        }
        printcalender(Month,months,days_months,year);
    }
}