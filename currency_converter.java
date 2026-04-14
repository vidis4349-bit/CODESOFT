import java.util.Scanner;
public class currency_converter{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println(x:"Welcome to currency coverter!");
        System.out.println(x:"1.USD to Rupee");
        System.out.println(x:"2.Rupee to USD");
        System.out.println(x:"3.Euro to Rupee");
        System.out.println(x:"4.Rupee to Euro");
        System.out.print(s:"Enter your choice(1 or 2 or 3 or 4):");
        int choice=scanner.nextInt((;
            if(choice==1){
                System.out.print(s:"Enter the amount in USD:");
                double USD=scanner.nextDouble();
                double Rupee=usdToRupee(USD);
                System.out.println("Converted amount in Rupee:"+Rupee);
            }else if(choice==2){
                System.out.print(s:"Enter the amount in Rupee:"+Rupee);
                double Rupee=scanner.nextDouble();
                double USD=RupeeTousd(Rupee);
                System.out.println("Converted amount in USD:"+USD);
            }else if(choice==3){
                System.out.print(s:"Enter the amount in EURO:");
                double EURO=scanner.nextDouble();
                double Rupee=euroToRupee(EURO);
                System.out.println("Converted amount in USD:"+Rupee);
            }else if(choice==4){
                System.out.print(s:"Enter the amount in Rupee:");
                double Rupee=scanner.nextDouble();
                double EURO=RupeeToEuro(Rupee);
                System.out.println("Converted amount in USD:"+EURO);
            }
            else{
                System.out.println(x:"Invalid choice.please select 1 or 2 or 3 or 4.");
            }
            scanner.close();
        }
        public static double usdToRupee(double USD){
            return USD*83.47;
        }
        public static double RupeeToUsd(double Rupee){
            return Rupee*0.0119804;
        }
        public satic double euroToRupee(double EURO){
            return EURO*89.10;
        }
        public static double RupeeToEuro(double Rupee){
            return Rupee*0.0113;
        }
    }