package platform.codingnomads.co.corespring.examples.componentscanannotation.memory;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class hardDrive {
    @PostConstruct
    public void init(){ System.out.println("This PC has a 500gb harddrive");}
}
