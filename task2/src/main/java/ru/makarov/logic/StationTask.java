package ru.makarov.logic;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StationTask {

    private static List<Station> STATION_LIST = Arrays.asList(
            new Station("МОСКВА"),
            new Station("МОЖГА"),
            new Station("МОЗДОК"),
            new Station("САНКТ-ПЕТЕРБУРГ"),
            new Station("САМАРА"));

    public static void main(String[] args) {
        StationTask task = new StationTask(STATION_LIST);
        task.getStationsByTwoFirstLetters("МО")
                .stream().map(station -> station.getName() + " ")
                .forEach(System.out::print);
        System.out.println();
        task.getStationsByTwoFirstLetters("СА")
                .stream().map(station -> station.getName() + " ")
                .forEach(System.out::print);
    }

    private List<Station> stationList;

    private StationTask(List<Station> stationList) {
        this.stationList = stationList;
        // TODO
    }

    private Collection<Station> getStationsByTwoFirstLetters(String prefix) {
        // TODO
        return stationList.stream().
                filter(i -> prefix.contains(i.getName().substring(0, 2)))
                .collect(Collectors.toList());
    }

    private static class Station {
        private String name;

        public Station(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

