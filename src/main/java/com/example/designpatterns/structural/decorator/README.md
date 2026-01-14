# Decorator

**Intent:** Attach additional responsibilities to an object dynamically without modifying its class.

**Problem:** Different clients need auditing, encryption, or both on top of message sending. Duplicating code in multiple subclasses would not scale.

**Solution (UML-style text):**
- Component: MessageSender
- Concrete Component: BasicSender
- Decorator: MessageSenderDecorator holds a MessageSender
  - Concrete Decorators: AuditingSender, EncryptingSender
- Client wraps decorators around the component to combine behaviors at runtime.

**When to use:** You need to add cross-cutting features to specific object instances without affecting others or altering the core class.

**When NOT to use:** When behavior changes are simple and static—subclassing may suffice.

**Pros:** Flexible layering of features, adheres to Open/Closed principle, no class explosion.
**Cons:** Many small objects; debugging call stacks can be harder.

**30-60 second explanation:** Decorator wraps BasicSender with auditing and encryption objects. Each adds behavior before/after delegating, so you can compose concerns per use case without touching the base sender.
