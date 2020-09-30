# Второе  тестовое задание
Есть список станций, который мы загружаем при инициализации класса.
У каждой станции есть уникальное название.
Когда пользователь вводит первые 2 буквы названия станции, мы должны вывести ему список
подходящих станций.
Для этого нужно реализовать метод getStationsByTwoFirstLetters.
Таких станций и запросов очень много, поэтому вариант с перебором всех станций по каждому
запросу не подходит.

Нужно найти оптимальное решение по производительности.

```
public class StationTask {

    private static List<Station> STATION_LIST = Arrays.asList(
            new Station("МОСКВА"),
            new Station("МОЖГА"),
            new Station("МОЗДОК"),
            new Station("САНКТ-ПЕТЕРБУРГ"),
            new Station("САМАРА"));

    public static void main(String[] args) {
        StationTask task = new StationTask(STATION_LIST);
        System.out.println(task.getStationsByTwoFirstLetters("МО"));
        System.out.println(task.getStationsByTwoFirstLetters("СА"));
    }


    private StationTask(List<Station> stationList) {
        // TODO
    }

    private Collection<Station> getStationsByTwoFirstLetters(String prefix) {
        // TODO
        return null;
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
```
