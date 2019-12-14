package ben.study.designpattern.creational.builder.house_demo;

/**
 *
 * @author bethan
 */
public class ArchitectUsingBuilder {

    public static void main(String[] args) {

        Room room1 = new RoomBuilder().setFloorNumber(2).createRoom();
    }

}
