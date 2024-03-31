public class Seat {

    protected String roomNo;
    private double seatCost;

    public Seat() {

    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomNo()
    {
        return roomNo;
    }

    public Seat(double seatCost){
        this.seatCost=seatCost;
    }
    public double getSeatCost(){
        return seatCost;
    }


}