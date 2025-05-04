public class SingleTable
{

private int seats=0;
private int height=0;
private double view=0;

public SingleTable(int seats,double view,int height){
    this.seats=seats;
    this.height=height;
    this.view=view;
}
public int getNumSeats(){
return seats;
}

public int getHeight(){
return height;
}
public double getViewQuality(){
return view;
}

public void setViewQuality(double value){
view=value;
}

}