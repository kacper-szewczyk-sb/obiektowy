package lambda.zadanie_2;

public class Room {

    private String city;
    private Integer squareMeters;
    private Integer price;
    private Integer distanceFromCityCenter;

    public Room(String city, Integer squareMeters,
                Integer price, Integer distanceFromCityCenter) {
        this.city = city;
        this.squareMeters = squareMeters;
        this.price = price;
        this.distanceFromCityCenter = distanceFromCityCenter;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(Integer squareMeters) {
        this.squareMeters = squareMeters;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDistanceFromCityCenter() {
        return distanceFromCityCenter;
    }

    public void setDistanceFromCityCenter(Integer distanceFromCityCenter) {
        this.distanceFromCityCenter = distanceFromCityCenter;
    }
}
