package com.kidongyun.hash;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MainRunner implements ApplicationRunner {
    private final Hash hash;

    @Override
    public void run(ApplicationArguments args) {
        hash.put(54);
        hash.put(66);
        hash.put(32);
        hash.put(44);
        log.info(hash.toString());
    }
}
