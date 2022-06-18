package services;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    public void process(String data) {
        System.out.println("Processing data: [" + data + "]");
    }
}
