public class Patients extends Person{

    private int age;
    private String contact;
    Seat seat = new Seat();
    Doctor doc=new Doctor();
    Ward w1 = new Ward();
    private Seat seatFee;
    private Doctor docFee;
    private  double totalCost;


    public Patients(String name, int age, String contact, String roomNO,String seatNo,Seat seatFee,Doctor docFee) {
        super(name);
        this.age=age;
        this.contact=contact;
        this.seat.setRoomNo(roomNO);
        this.w1.setSeatNo(seatNo);
        this.seatFee=seatFee;
        this.docFee=docFee;

    }
    public void calcTotalCost(){
        totalCost=seatFee.getSeatCost()+docFee.getDocFee();
        System.out.println("--------------------------");
        System.out.println("Total cost: "+ totalCost);
        System.out.println("--------------------------");

    }



    public void ShowInfo(){
        System.out.println("Patients Details: ");
        super.ShowInfo();
        System.out.println("Age : "+age);
        System.out.println("Contact No: "+contact);
        System.out.println("Room No:"+ seat.getRoomNo());
        System.out.println("Seat No:"+ w1.getSeatNo());
        System.out.println("Seat cost: "+seatFee.getSeatCost());
        System.out.println("Doctor fee: "+docFee.getDocFee());
        System.out.println();

    }
}