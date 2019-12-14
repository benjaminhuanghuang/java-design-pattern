package ben.study.designpattern.creational.builder.house_demo;

import java.awt.*;

/**
 *
 * @author bethan
 */
public class ArchitectBad {

    public static void main(String[] args) {
        Room room = new Room(new Dimension(200,10),132, 3, Color.yellow, 2,1);
    }
}
