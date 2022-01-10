package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Repository repo = new Repository();
        Service service = new Service();

        try {
            List<Offerte> listeOfferte = repo.readFromFile("offerten.txt", "&");

            System.out.println(service.sortListeOfferteByPreis(listeOfferte));

            repo.writeToFile("offertensortiert.txt", listeOfferte, "&");
            service.getMostFrequentOrt(listeOfferte);
            repo.writeToFile("statistik.txt", listeOfferte, "&");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
