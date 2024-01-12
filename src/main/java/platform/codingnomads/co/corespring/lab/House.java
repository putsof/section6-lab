package platform.codingnomads.co.corespring.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class House {
    private Door door;
    private Window window;
    private Color color;

    public House(){
        System.out.println("I am a house");
    }
}
