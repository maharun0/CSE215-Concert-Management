package basic_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataFile {
    // Datafields
    static Scanner read;
    static String s;

    // Files                                                       
    public final static File purchaseHistoryFile = new File("src/textfiles/Purchase_History.txt");
    public final static File BandDetailsFile = new File("src/textfiles/Band_Details.txt");
    public final static File ConcertDetailsFile = new File("src/textfiles/Concert_Details.txt");
    public final static File popularBandDetailsFile = new File("src/textfiles/Popular_Band_Details.txt");

    // List to be added from files
    public static ArrayList<Concert> concertList = new ArrayList<>();
    public static ArrayList<Band> bandList = new ArrayList<>();

    // Reading from Band_Details.txt file and updating List
    public static void takeInputBandDetails() throws FileNotFoundException{
        read = new Scanner(BandDetailsFile);

        String name = "";
        ArrayList<String> members = new ArrayList<>();

        int bandNumbers = 5, bandMembers = 5;
        for (int i = 0; i < bandNumbers; i++){
            name = read.next();

            for (int j = 0; j < bandMembers; j++){
                s = read.next();
                members.add(s);
            }
            bandList.add(new Band(name, members));
            members.clear();
        }
    }

    // Reading from Concert_Details.txt file and updating list
    public static void takeInputConcertDetails() throws FileNotFoundException{
        read = new Scanner(ConcertDetailsFile);

        Band band = new Band();
        String place, time;
        double ticketPrice;

        //Band band, String place, String timing, double ticketPrice
        for (int i = 0; i < 5; i++){
            s = read.next();
            for (Band b : bandList){
                if (s.equals(b.getName())){
                    band = b;
                    break;
                }
            }

            place = read.next();
            time  = read.next();
            ticketPrice = read.nextDouble();

            concertList.add(new Concert(band, place, time, ticketPrice));
        }

    }

    // Search for bands
    public static String searchForBands(String s){
        String output = "";
        output += "===== Searching for bands =====\n";
        int count = 0;
        for(Band b : bandList){
            if (s.toLowerCase().equals(b.getName().toLowerCase())) {
                if (count == 0)
                    output += "Available bands:\n";
                output += b.getName() + "\n";
                count++;
            }
        }

        if(count==0){
            output += "No such band was found.";
        }
        return output;
    }

    // Search for concerts
    public static String searchForConcerts(String s){
        String output = "\n\n";
        output += "===== Searching for concerts =====\n";
        int count = 0;
        for (Concert c : concertList) {
            if (s.toLowerCase().equals(c.getBand().getName().toLowerCase())) {
                if (count == 0)
                    output += "Available concerts:\n";
                output += c.getBand().getName();
                count++;
            }
        }

        if (count == 0) {
            output += "No such concert was found.";
        }
        return output;
    }
    
    // Search for memebers
    public static String searchForMembers(String s){ // not completed yet
        String output = "\n\n";
        output += "===== Searching for Members in Band =====\n";
        int count = 0;
        for (Band b : bandList) {
            for (String m : b.getMembers()){
                if (m.toLowerCase().equals(s.toLowerCase())) {
                    if (count == 0)
                        output += "Available bands with this member:\n";
                    output += b.getName() + "\n";
                    count++;
                }
            }
            
        }

        if (count == 0) {
            output += "No member present with this name.";
        }
        return output;
    }

    // get Puchase History
    public static String getPurchaseHistory() throws FileNotFoundException{
        read = new Scanner(purchaseHistoryFile);
        String name;
        double price;

        String output = "===== Purchase History ===== \n";
        while (read.hasNextLine()){
            name = read.next();
            price = read.nextDouble();

            output += name + " ============== " + price + " taka\n";
        }

        return output;
    }

    // get popular band details
    public static String getPopularBandDetails() throws FileNotFoundException {
        read = new Scanner(popularBandDetailsFile);
        String name;

        String output = "===== Popular Bands ===== \n";
        
        for (int i = 0; i < 5; i++){
            name = read.next();
            output += name + "\n";
        }

        return output;
    }
}

    