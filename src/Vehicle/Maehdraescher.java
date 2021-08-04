package src.Vehicle;
public class Maehdraescher extends Vehicle{
    
    static final int loadingArea_M = 5000;
    int fillingStatus_M;

    public boolean setDraescherLimitation(){
        boolean fill;
        if(fillingStatus_M < loadingArea_M){
            fill=true;
        }else{
            fill = false;
        }
        return fill;
    }



    public boolean getLimitationKipper(){
        Kipper kipper = new Kipper();

        boolean allowed = kipper.isFull();
        if( allowed = true){
            //Methode zum befüllen des Kippers
        }else{
            //Meldung --> Kipper voll, muss davor geleert werden
        }
        return allowed;


    }

    public boolean ichzeigTimmwas(){
        boolean ja = true;
        return ja;
    }







}
