package src.Vehicle;

//kann nur mit einem Traktor bewegt werden --> Transport von Getreide

public class Kipper extends Vehicle {
    

    static final int loadingArea_K = 10000;
    int fillingStatus_K;
    boolean fill;

// Kipper voll Ja/Nein
    public boolean setLimitation(){
        
        if (fillingStatus_K < loadingArea_K){
        fill = true;}
        else{
            fill = false;
        }
        return fill;
    }

public int fillKipper() {
    
    int fillAmount=0; //Der Wert den der User angibt und reingeballert wird
    int emptySpace = loadingArea_K - fillingStatus_K;

    if(fillAmount <= emptySpace){

    }else{
        //Meldung mit der maximalen menge ausgeben die in den Kippfer eingefüllt werden kann
    }
    return fillAmount;



}



    public boolean isFull() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    

}
