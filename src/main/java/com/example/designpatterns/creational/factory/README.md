# Factory Method

**Intent:** Define an interface for creating an object but let subclasses (or a dedicated creator) decide which class to instantiate.

**Problem:** Marketing frequently changes which notification channel to use (SMS, email, push). Hard-coding 
ew SmsNotification() scattered across the code would make every change risky and repetitive.

**Solution (UML-style text):**
- Notification (Product interface)
- EmailNotification / SmsNotification / PushNotification (Concrete Products)
- NotificationFactory (Creator) -> create(Channel) decides which concrete product to return.
- Client (Main) asks the factory for a channel and only depends on Notification.

**When to use:** You want to encapsulate object creation logic and keep callers unaware of concrete classes or when new product types may be added.

**When NOT to use:** When you only ever have one implementation and no likelihood of change; simple 
ew is clearer then.

**Pros:** Centralizes creation, reduces duplication, callers depend on abstractions, easier to add new products.
**Cons:** More classes; creator logic can grow if overused.

**30-60 second explanation:** The Factory Method moves 
ew logic into one place. Clients request a Notification by channel and remain decoupled from concrete classes, so switching from SMS to push requires changing only the factory.
