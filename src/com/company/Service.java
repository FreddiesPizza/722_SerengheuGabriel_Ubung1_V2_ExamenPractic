package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {

    public List<Offerte> calculateFullPrice(List<Offerte> liste){
        List<Offerte> fullPriceList = liste;
        for (Offerte o : fullPriceList ){
            o.setPreis(o.getPreis()+o.getPreis()*o.getMehrwehrsteuer());
        }
        return fullPriceList;
    }

    public List<Offerte> sortListeOfferteByPreis(List<Offerte> liste) {
        List<Offerte> fullPriceList = calculateFullPrice(liste);
        List<Offerte> sortedOfferte = fullPriceList.stream()
                .sorted(Comparator.comparing(Offerte::getPreis).reversed())
                .collect(Collectors.toList());
        return sortedOfferte;
    }

    public List<Offerte> sortListeOfferteByTotalPrice(List<Offerte> liste) {
        List<Offerte> sortedOfferte = liste.stream()
                .sorted(Comparator.comparing(Offerte::getPreis))
                .collect(Collectors.toList());
        return sortedOfferte;
    }

}
