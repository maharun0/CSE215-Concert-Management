package basic_class;

import java.util.ArrayList;

public class Concert {
    // Data Fields
    private Band band;
    private String place;
    private String timing;
    private double ticketPrice;

    // Constructor
    public Concert() {
        band = new Band("", new ArrayList<String>());
        place = "";
        timing = "";
        ticketPrice = 0;
    }
    public Concert(Band band, String place, String timing, double ticketPrice) {
        this.band = band;
        this.place = place;
        this.timing = timing;
        this.ticketPrice = ticketPrice;
    }

    // Getter & Setter
    public Band getBand() {
        return band;
    }
    public void setBand(Band band) {
        this.band = band;
    }

    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }

    public String getTiming() {
        return timing;
    }
    public void setTiming(String timing) {
        this.timing = timing;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
