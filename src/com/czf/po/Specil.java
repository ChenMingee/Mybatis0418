package com.czf.po;

public class Specil {
    private int spilinfoid;
    private int depinfoid;
    private String spilinfocode;
    private String spilinfoname;

    @Override
    public String toString() {
        return "Specil{" +
                "spilinfoid=" + spilinfoid +
                ", depinfoid=" + depinfoid +
                ", spilinfocode='" + spilinfocode + '\'' +
                ", spilinfoname='" + spilinfoname + '\'' +
                ", spilinfoaim='" + spilinfoaim + '\'' +
                ", spilinfoprodire='" + spilinfoprodire + '\'' +
                '}';
    }

    public int getSpilinfoid() {
        return spilinfoid;
    }

    public void setSpilinfoid(int spilinfoid) {
        this.spilinfoid = spilinfoid;
    }

    public int getDepinfoid() {
        return depinfoid;
    }

    public void setDepinfoid(int depinfoid) {
        this.depinfoid = depinfoid;
    }

    public String getSpilinfocode() {
        return spilinfocode;
    }

    public void setSpilinfocode(String spilinfocode) {
        this.spilinfocode = spilinfocode;
    }

    public String getSpilinfoname() {
        return spilinfoname;
    }

    public void setSpilinfoname(String spilinfoname) {
        this.spilinfoname = spilinfoname;
    }

    public String getSpilinfoaim() {
        return spilinfoaim;
    }

    public void setSpilinfoaim(String spilinfoaim) {
        this.spilinfoaim = spilinfoaim;
    }

    public String getSpilinfoprodire() {
        return spilinfoprodire;
    }

    public void setSpilinfoprodire(String spilinfoprodire) {
        this.spilinfoprodire = spilinfoprodire;
    }

    private String spilinfoaim;
    private String spilinfoprodire;

}
