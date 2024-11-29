package ru.t1.unlock.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.t1.unlock.service.UnlockService;

import java.util.Random;

@Service
@Slf4j
public class UnlockServiceImpl implements UnlockService {
    @Override
    public boolean unlockAccount(Long accountId) {
        log.info("Unlocking account {}", accountId);
        var isUnlocked = new Random().nextBoolean();
        log.info("Unlocking account {} success: {}", accountId, isUnlocked);
        return isUnlocked;
    }

    @Override
    public boolean unlockClient(Long clientId) {
        log.info("Unlocking client {}", clientId);
        var isUnlocked = new Random().nextBoolean();
        log.info("Unlocking client {} success: {}", clientId, isUnlocked);
        return isUnlocked;
    }
}
