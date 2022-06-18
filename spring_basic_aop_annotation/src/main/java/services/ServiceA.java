package services;

import aspects.DoNotExecute;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    @DoNotExecute
    public void process(String data) {
        System.out.println("Processing data: [" + data + "]");
    }
}
