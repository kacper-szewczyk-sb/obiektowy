package lambda.zadanie_2;

import org.junit.jupiter.api.Assertions;

import java.util.List;

public class AuctionHouseTest {

    @org.junit.jupiter.api.Test
    public void cityNameTest() {
        AuctionHouse auctionHouse = new AuctionHouse();
        auctionHouse.addRoom(new Room("Warszawa", 50, 499000, 5));
        auctionHouse.addRoom(new Room("Warszawa", 55, 599000, 2));
        auctionHouse.addRoom(new Room("Wrocław", 34, 400000, 1));
        auctionHouse.addRoom(new Room("Warszawa", 55, 299000, 3));
        auctionHouse.addRoom(new Room("Warszawa", 50, 599000, 10));
        Assertions.assertEquals(4, auctionHouse.getRoomsFromCity("Warszawa").size());
        Assertions.assertEquals(1, auctionHouse.getRoomsFromCity("Wrocław").size());
    }

    @org.junit.jupiter.api.Test
    public void squareMetersTest() {
        AuctionHouse auctionHouse = new AuctionHouse();
        auctionHouse.addRoom(new Room("Warszawa", 50, 499000, 5));
        auctionHouse.addRoom(new Room("Warszawa", 55, 599000, 2));
        auctionHouse.addRoom(new Room("Wrocław", 34, 400000, 1));
        auctionHouse.addRoom(new Room("Warszawa", 55, 299000, 3));
        auctionHouse.addRoom(new Room("Warszawa", 50, 599000, 10));
        Assertions.assertEquals(2, auctionHouse.getRoomsOfSize(51,55).size());
    }

    @org.junit.jupiter.api.Test
    public void bestRoomsTest() {
        AuctionHouse auctionHouse = new AuctionHouse();
        auctionHouse.addRoom(new Room("Warszawa", 50, 499000, 5));
        auctionHouse.addRoom(new Room("Warszawa", 55, 599000, 4));
        auctionHouse.addRoom(new Room("Wrocław", 34, 400000, 1));
        auctionHouse.addRoom(new Room("Warszawa", 55, 299000, 3));
        auctionHouse.addRoom(new Room("Warszawa", 50, 599000, 10));
        List<Room> result = auctionHouse.getThreeClosest();
        result.forEach((room)-> System.out.println(room.getDistanceFromCityCenter()));
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals(1, result.get(0).getDistanceFromCityCenter());
    }
}
