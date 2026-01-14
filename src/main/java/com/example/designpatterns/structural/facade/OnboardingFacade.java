package com.example.designpatterns.structural.facade;

/**
 * Facade coordinates multiple subsystems behind a single, easy API.
 */
public class OnboardingFacade {
    private final AccountService accountService = new AccountService();
    private final BillingService billingService = new BillingService();
    private final EmailService emailService = new EmailService();

    public void onboard(String name) {
        accountService.createAccount(name);
        billingService.setupTrial(name);
        emailService.sendWelcome(name);
    }
}
