# Mediator

**Intent:** Define an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly.

**Problem:** Team members messaged each other directly, creating tight coupling and notification loops. Adding a new participant required wiring references everywhere.

**Solution (UML-style text):**
- Mediator: ChatMediator
  - Concrete: TeamChatMediator holds participants and relays messages
- Colleagues: Participant sends/receives only through the mediator
- Client: Main creates participants with a shared mediator.

**When to use:** Complex object interactions, chat/air-traffic/colleague coordination, or to reduce many-to-many dependencies.

**When NOT to use:** Interactions are simple or two-party; a direct call is clearer.

**Pros:** Reduces coupling, centralizes interaction logic, simplifies adding participants.
**Cons:** Mediator can become a god object if it grows too much.

**30-60 second explanation:** Mediator routes messages between participants so they never reference each other. Adding Carol requires no code changes in Alice or Bob—only registration with the mediator.
