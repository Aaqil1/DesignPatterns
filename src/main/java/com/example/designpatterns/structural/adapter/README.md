# Adapter

**Intent:** Convert the interface of a class into another interface clients expect.

**Problem:** Checkout code depends on PaymentProcessor but the chosen bank SDK exposes 	ransferCents(int, code). Changing all callers would be costly and risky.

**Solution (UML-style text):**
- Target: PaymentProcessor
- Adaptee: LegacyBankApi
- Adapter: LegacyBankAdapter converts dollars to cents and forwards calls
- Client: CheckoutService uses only PaymentProcessor and remains unchanged.

**When to use:** Integrating a new/legacy API whose interface does not match your code; bridging incompatible interfaces.

**When NOT to use:** When you can change the adaptee directly or when a new API contract can be negotiated instead of patched.

**Pros:** Reuse existing code, isolates changes, clients stay stable.
**Cons:** Extra indirection; too many adapters can complicate flows.

**30-60 second explanation:** Adapter wraps the legacy bank API and exposes the PaymentProcessor interface. Checkout keeps calling pay(usd), while the adapter converts to cents and delegates, minimizing change ripple.
