package day38_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyJobOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();


        offer1.setInfo("CA", "Los Angles", "SDET", 120000, true, false, false, false);
        offer2.setInfo("TX", "Austin", "Software Developer", 130000, true, true, true, false);
        offer3.setInfo("VA", "McLean", "QA", 110000, true, true, true, true);
        offer4.setInfo("NA", "Lav Vegas", "Scrum Master", 1250000, false, false, true, false);
        offer5.setInfo("NC", "Charlotte", "SDET", 1200000, false, true, true, false);
        offer6.setInfo("WA", "Seattle", "BA", 1350000, true, false, true, true);
        offer7.setInfo("CO", "Denver", "QE", 85000, true, true, true, true);



        System.out.println("-------------------------------------------------");
        //add the CA &NA offers
        Offer [] arr = {offer1, offer2, offer3,offer4,offer5, offer6, offer7};

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(arr));
        localOffers.removeIf(offer -> !(offer.state.equals("CA") ||
                offer.state.equals("NV")));
        System.out.println(localOffers.size());
        System.out.println(localOffers);

        System.out.println("__________________________");
        //only keep the offers that are full time
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(arr));
        fullTimeOffers.removeIf(offer -> !offer.isFullTime);
        System.out.println(fullTimeOffers.size());
        System.out.println(fullTimeOffers);

        System.out.println("__________________________________");
        //only keep the offers that are WFH & hasPTO

        ArrayList<Offer> WFHOffers = new ArrayList<>();
        for (Offer each : arr) {
            if(each.WFH && each.hasPTO){
                WFHOffers.add(each);
            }
        }
        System.out.println(WFHOffers.size());
        System.out.println(WFHOffers);


        System.out.println("_____________________________________");
        //only keep the offers that has the salary of 125K or more
        ArrayList<Offer> moreThan125K = new ArrayList<>(Arrays.asList(arr));
        moreThan125K.removeIf(offer -> offer.salary<125000);
        System.out.println(moreThan125K.size());
        System.out.println(moreThan125K);










    }


}
