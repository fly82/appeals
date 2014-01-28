package models;

public class Appeals {
    Long id;
    String name;
    String date;
    String address;
    String number;
    Location location;

    public Appeals() {
    }

    public Appeals(Long id, String name, String date, String address, String number, Location location) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
        this.number = number;
        this.location = location;
    }


    @Override
    public String toString() {
        return "Appeals{" +
                "id={" + id +
                "}, name={" + name + '}' +
                ", date={" + date + '}' +
                ", address={" + address + '}' +
                ", number={" + number + '}' +
                ", location=" + location +
                '}';
    }
}
