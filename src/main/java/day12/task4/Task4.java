package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("John Lennon");
        members1.add("Paul McCartney");

        MusicBand band = new MusicBand("The Beatles", 1960, members1);
        List<String> members2 = new ArrayList<>();
        members2.add("Kurt Cobain");
        members2.add("David Grohl");
        MusicBand band2 = new MusicBand("Nirvana", 1987, members2);

        band.printMembers();
        band2.printMembers();

         MusicBand.transferMembers(band, band2);
         band.printMembers();
        band2.printMembers();

    }

}
