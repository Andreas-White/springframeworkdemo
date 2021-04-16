package com.example.jbrainspringdemo.Countries;

public class Sweden implements Country{

    private City malmo;
    private City lund;
    private City kalmar;

    public City getMalmo() {
        return malmo;
    }

    public void setMalmo(City malmo) {
        this.malmo = malmo;
    }

    public City getLund() {
        return lund;
    }

    public void setLund(City lund) {
        this.lund = lund;
    }

    public City getKalmar() {
        return kalmar;
    }

    public void setKalmar(City kalmar) {
        this.kalmar = kalmar;
    }

    @Override
    public void travel() {
        System.out.println("You travelled to " + getMalmo().getName());
        System.out.println("You travelled to " + getLund().getName());
        System.out.println("You travelled to " + getKalmar().getName());
    }
}
