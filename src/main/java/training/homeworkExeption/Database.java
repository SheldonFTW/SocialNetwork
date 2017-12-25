package training.homeworkExeption;

import java.util.LinkedList;
import java.util.List;

public class Database {

    static List<Url> getAllGoodSites() {


        List<Url> goodSites = new LinkedList<>();

        Url url1 = new Url("https://", "mail.google.com");
        Url url2 = new Url("https://", "www.facebook.com");
        Url url3 = new Url("https://", "mail.google.com");
        Url url4 = new Url("https://", "mail.google.com");
        Url url5 = new Url("https://", "mail.google.com");
        Url url6 = new Url("https://", "mail.google.com");

        goodSites.add(url1);
        goodSites.add(url2);
        goodSites.add(url3);
        goodSites.add(url4);
        goodSites.add(url5);
        goodSites.add(url6);


        return goodSites;
    }

    static List<Url> getAllBedSites() {

        List<Url> bedSites = new LinkedList<>();

        Url url1 = new Url("https://", "www.vk.com");
        Url url2 = new Url("https://", "www.vk.com");
        Url url3 = new Url("https://", "www.vk.com");
        Url url4 = new Url("https://", "www.vk.com");
        Url url5 = new Url("https://", "www.vk.com");
        Url url6 = new Url("https://", "www.vk.com");

        bedSites.add(url1);
        bedSites.add(url2);
        bedSites.add(url3);
        bedSites.add(url4);
        bedSites.add(url5);
        bedSites.add(url6);

        return bedSites;
    }



}
