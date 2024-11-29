package ru.t1.unlock.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.t1.unlock.service.UnlockService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/unlock")
public class UnlockController {

    private final UnlockService unlockService;

    @PostMapping("/account/{accountId}")
    public boolean unlockAccount(@PathVariable Long accountId) {
        return unlockService.unlockAccount(accountId);
    }

    @PostMapping("/client/{clientId}")
    public boolean unlockClient(@PathVariable Long clientId) {
        return unlockService.unlockClient(clientId);
    }
}
