package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {

    public List<Offerte> calculateFullPrice(List<Offerte> liste){
        List<Offerte> fullPriceList = liste;
        fullPriceList.setPrice
    }

    public List<Offerte> sortListeOfferteByPreis(List<Offerte> liste) {
        List<Offerte> fullPriceList = calculateFullPrice(liste);
        List<Offerte> sortedOfferte = liste.stream()
                .sorted(Comparator.comparing(Offerte::getPreis).reversed())
                .collect(Collectors.toList());
        return sortedOfferte;
    }

    public String getMostFrequentOrt(List<Offerte> liste) {
        Map.Entry<Ort, Long> maxLocation = liste.stream()
                .collect(Collectors.groupingBy(Offerte::getOrt, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(NullPointerException::new);

            return maxLocation.getKey() + ": " + maxLocation.getValue();
    }
}
