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
            List<Offerte> listeStatistiks = repo.readFromFile("offerten.txt", "&");

            System.out.println(service.sortListeOfferteByPreis(listeOfferte));

            repo.writeToFile("offertensortiert.txt", listeOfferte, "&");

            System.out.println(service.sortListeOfferteByTotalPrice(listeStatistiks));
            repo.writeToStatistik("statistik.txt", listeStatistiks, "&");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
