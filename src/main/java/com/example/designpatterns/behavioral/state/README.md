# State

**Intent:** Allow an object to alter its behavior when its internal state changes; the object will appear to change its class.

**Problem:** Document publishing logic used switch statements on status throughout the codebase. Every workflow tweak required touching many conditionals.

**Solution (UML-style text):**
- State: DocumentState with publish()
  - Concrete States: DraftState, ReviewState, PublishedState
- Context: Document delegates to its current state and lets states transition.
- Client: Main calls publish() repeatedly; behavior depends on current state.

**When to use:** Behavior depends on state and changes at runtime; repeated switch/case logic appears.

**When NOT to use:** State transitions are trivial or fixed—simple conditionals may be enough.

**Pros:** Removes switch/case duplication, keeps state-specific logic localized, easier to extend states.
**Cons:** More classes; transitions scattered across states can be harder to trace.

**30-60 second explanation:** State moves workflow rules into state classes. The document asks its current state to handle publish(), and the state decides the next state, eliminating scattered conditionals.
