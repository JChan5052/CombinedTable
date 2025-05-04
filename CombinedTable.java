public class CombinedTable{

SingleTable tab1;
SingleTable tab2;
    public CombinedTable(SingleTable inct1,SingleTable inct2){
      tab1=inct1;
      tab2=inct2;
    }

    public boolean canSeat(int seatreq){
      if (seatreq<=(tab1.getNumSeats()+tab2.getNumSeats())-2) return true;
      return false;
    }
    public double getDesireability(){
        double avg=(tab1.getViewQuality()+tab2.getViewQuality())/2;
        if (tab1.getHeight()==tab2.getHeight()) return avg;
        return avg-10;
    }
}