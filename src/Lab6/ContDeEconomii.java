package Lab6;

public class ContDeEconomii extends ContBancar {
    private double limita;
    public  ContDeEconomii(double limita){
        this.limita=limita;
    }

    @Override
    public boolean  withdrawal(double amount) {
        if (amount >limita)
        {System.out.println("retragerea depaseste limita de "+ limita);
            return  false;}
        else
        {return withdrawal(amount);
    }
}

