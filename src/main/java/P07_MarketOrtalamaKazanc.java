import java.util.ArrayList;
import java.util.Scanner;

public class P07_MarketOrtalamaKazanc {
    public static void main(String[] args) {
        //MARKET ORTALAMA KAZANC SORUSU
               ArrayList<String> days = new ArrayList<>();
                days.add("Monday");
                days.add("Tuesday");
                days.add("Wednesday");
                days.add("Thursday");
                days.add("Friday");
                days.add("Saturday");
                days.add("Sunday");
                ArrayList<Double> daysincome = new ArrayList<>();

                Scanner sc = new Scanner(System.in);

                int i = 0;


                while (i < 7) {

                    System.out.println(days.get(i) + "Please enter days income");
                    double income = sc.nextDouble();
                    daysincome.add(income);
                    i++;


                }

                double averageIncome = avgIncome(daysincome);
                System.out.println("AVG INCOME " +averageIncome);

                ArrayList<String>overInDays = overAverageIncome(daysincome,days, averageIncome);

                System.out.println("OVER AVG INCOME DAYS" +overInDays);

                ArrayList<String>underInDays = underAverage(daysincome, days, averageIncome);
                System.out.println("UNDER AVG INCOME DAYS" +underInDays);

            }

            public static Double avgIncome(ArrayList<Double> daysIncome) {


                double sum = 0;
                for (double w: daysIncome) {
                    sum += w;



                }return sum / daysIncome.size();//Average


            }

            public static ArrayList<String> overAverageIncome (ArrayList<Double> daysIncome, ArrayList<String> days, double average) {


                ArrayList<String>overDays = new ArrayList<>();
                for(int i = 0; i < daysIncome.size(); i++) {
                    if(daysIncome.get(i) > average){
                        overDays.add(days.get(i));
                    }
                }
                return overDays;
            }
            public static ArrayList<String>underAverage(ArrayList<Double>daysIncome, ArrayList<String> days, double average) {
                ArrayList<String> underAverage = new ArrayList<>();
                for(int i = 0; i<daysIncome.size(); i++) {
                    if(daysIncome.get(i) <average) {
                        underAverage.add(days.get(i));
                    }
                }
                return underAverage;
            }
        }


