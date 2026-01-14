# Bridge

**Intent:** Decouple an abstraction from its implementation so the two can vary independently.

**Problem:** Notifications vary by urgency (high/low) and by channel (email/Slack). Without Bridge we would need classes for every combination, which does not scale.

**Solution (UML-style text):**
- Abstraction: Notification
  - Refined: LowPriorityNotification, HighPriorityNotification
- Implementor: MessageSender
  - Concrete: EmailSender, SlackSender
- The abstraction holds a MessageSender reference and delegates sending to it.

**When to use:** Matrix-like combinations of features (e.g., shapes x renderers, priorities x channels) where inheritance alone would explode classes.

**When NOT to use:** When both dimensions are fixed or unlikely to change—simple inheritance may be enough.

**Pros:** Avoids class explosion, enables independent extension of abstraction and implementation, improves testability by swapping implementors.
**Cons:** Adds indirection and more classes to understand.

**30-60 second explanation:** Bridge splits notification priority from delivery channel. HighPriorityNotification decides the subject format, while MessageSender decides how to deliver. Swap either side independently to support new priorities or channels.
