public class Main {
    public static void main(String[] args) {

        Seat ward = new Seat(1000);
        Seat cabin = new Seat(2000);
        Doctor docFee = new Doctor(1000);

        Doctor d1= new Doctor("Prof. Dr. Farhan Islam Shihab","Medicine ","MBBS");


        Patients p1=new Patients("Md. Farhan Monir Rana Pranto",22,"01723685251","217","00",cabin,docFee);
        p1.ShowInfo();
        p1.calcTotalCost();
        System.out.println("");
        d1.ShowInfo();

        System.out.println("\n"+"**********************"+"\n");

        Patients p2=new Patients("Md. Abdullah ",23,"01521571764","308","10",ward,docFee);
        p2.ShowInfo();
        p2.calcTotalCost();
        System.out.println("");
        d1.ShowInfo();

    }
}