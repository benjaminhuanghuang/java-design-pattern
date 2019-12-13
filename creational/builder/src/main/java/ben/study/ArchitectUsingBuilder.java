package ben.study;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class ArchitectUsingBuilder {

    public static void main(String[] args) {

        Room room1 = new RoomBuilder().setFloorNumber(2).createRoom();

    }

}
