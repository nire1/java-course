package day12.task5;

import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist>artists1 = new ArrayList<>();
        artists1.add(new MusicArtist("John Lennon",1940));
        artists1.add(new MusicArtist("Paul Mccartney",1945));
        MusicBand band1 = new MusicBand("The Beatles",1960,artists1);
        List<MusicArtist>artists2 = new ArrayList<>();
        artists2.add(new MusicArtist("Kurt Cobain",1968));
        artists2.add(new MusicArtist("David Grohl",1969));
        MusicBand band2 = new MusicBand("Nirvana", 1987, artists2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
