# Chain of Responsibility

**Intent:** Pass a request along a chain of handlers so each gets a chance to process it.

**Problem:** Support tickets of different severity were routed manually. Low issues reached directors while critical issues waited in an agent's inbox.

**Solution (UML-style text):**
- Handler: SupportHandler with setNext() and handle()
- Base handler: BaseSupportHandler stores 
ext and delegates when not handled
- Concrete handlers: AgentHandler, SupervisorHandler, DirectorHandler
- Client: Main wires the chain and sends tickets to the first handler only.

**When to use:** Requests may be handled by different handlers, determined at runtime; you want to decouple senders from receivers.

**When NOT to use:** When a single receiver is known or ordering is irrelevant.

**Pros:** Decouples sender/receiver, adds/removes handlers flexibly, supports dynamic ordering.
**Cons:** Requests can drop if not handled; debugging flow across many handlers can be harder.

**30-60 second explanation:** The chain forwards a ticket until a handler accepts it. Clients know only the chain's head, so routing logic lives inside handlers instead of callers.
