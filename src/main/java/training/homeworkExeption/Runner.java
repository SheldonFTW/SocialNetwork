package training.homeworkExeption;

import java.util.List;
import java.util.Scanner;


public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter URL protocol, please:");
        String protocol = scanner.nextLine();
        System.out.println("Enter domain name, please:");
        String site = scanner.nextLine();
        Url url = new Url(protocol, site);

        System.out.println(url);

        verification(url);

        scanner.close();

    }

    public static void verification(Url url) {


        List<Url> goodSites = Database.getAllGoodSites();
        List<Url> bedSitet = Database.getAllBedSites();

        if (url == null) {
            try {
                throw new Exeption.NoUrlExeption();
            } catch (Exeption.NoUrlExeption noUrlExeption) {
                System.out.println("There is no URL entered.");
            }
        } else {
            if (!url.getProtocol().equals("https://")) {
                try {
                    throw new Exeption.NoUrlExeption();
                } catch (Exeption.NoUrlExeption noUrlExeption) {
                    System.out.println("Your must begin with https://");
                }
            } else {
                for (Url site : bedSitet) {
                    if (site.equals(url)) {
                        try {
                            throw new Exeption.BedSitesExeption();
                        } catch (Exeption.BedSitesExeption e) {
                            System.out.println("This site is very, very bad...");
                        }
                    } else {
                        goodSites.add(url);
                    }
                }
                System.out.println("List of good sites:");
                System.out.println(goodSites);

            }
        }
    }
}

