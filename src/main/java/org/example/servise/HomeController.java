package org.example.servise;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HomeController {

    private final Servise servise;

    public HomeController(@Qualifier("userServise1") Servise servise) {
        this.servise = servise;
    }
}
