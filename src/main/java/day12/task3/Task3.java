package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>(Arrays.asList(new MusicBand("The Beatles", 1960),
                new MusicBand("Nirvana", 1987),
                new MusicBand("Limp Bizkit", 1994),
                new MusicBand("Blink-182", 1992),
                new MusicBand("Linkin Park", 1996),
                new MusicBand("ASAAS", 2003),
                new MusicBand("BABANA", 2006),
                new MusicBand("Mojaheds", 2011),
                new MusicBand("Angry Cats", 2020),
                new MusicBand("Angry pupeys", 2015)));

        Collections.shuffle(bands);



        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List <MusicBand> bandsAfter = new ArrayList<>();
        for(MusicBand band: bands){
            if(band.getYear()>2000)
                bandsAfter.add(band);
        }
        return bandsAfter;
    }
}
