# Facade

**Intent:** Provide a unified, simplified interface to a set of interfaces in a subsystem.

**Problem:** Onboarding a trial user required callers to know the right order for account creation, billing setup, and welcome email. Mistakes and duplication were common.

**Solution (UML-style text):**
- Subsystems: AccountService, BillingService, EmailService
- Facade: OnboardingFacade orchestrates the calls in the correct order
- Client: Main calls acade.onboard(name) instead of juggling subsystems.

**When to use:** To reduce complexity for common flows, hide legacy APIs, or provide a safe default orchestration.

**When NOT to use:** When clients truly need fine-grained control or the facade would become a bloated god object.

**Pros:** Simplifies usage, reduces coupling to subsystem details, enforces correct call order.
**Cons:** Can mask capabilities; risk of growing into an all-knowing interface.

**30-60 second explanation:** Facade wraps three onboarding services behind onboard(). Callers no longer manage call ordering or dependencies—the facade coordinates everything for a clean entry point.
