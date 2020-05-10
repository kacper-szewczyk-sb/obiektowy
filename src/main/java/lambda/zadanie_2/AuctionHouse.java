package lambda.zadanie_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AuctionHouse {

    private List<Room> roomList;

    public AuctionHouse() {
        this.roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        this.roomList.add(room);
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public List<Room> getRoomsFromCity(String city) {
        return roomList.stream().filter((room) -> city.equals(room.getCity()))
                .collect(Collectors.toList());
    }

    public List<Room> getRoomsOfSize(Integer minSquareMeter,
                                     Integer maxSquareMeter) {
        return roomList.stream().filter((room) -> {
            return room.getSquareMeters() >= minSquareMeter &&
                    room.getSquareMeters() <= maxSquareMeter;
        }).collect(Collectors.toList());
    }

    public List<Integer> getPrices() {
        return roomList.stream().map((room -> room.getPrice()))
                .collect(Collectors.toList());
    }


    public List<Room> getThreeClosest() {
        roomList.sort((room, room2) -> {
            return room.getDistanceFromCityCenter() - room2.getDistanceFromCityCenter();
        });
        return roomList.stream().limit(3).collect(Collectors.toList());
    }
}
