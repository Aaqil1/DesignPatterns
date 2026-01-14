# Prototype

**Intent:** Create new objects by copying existing ones (prototypes) instead of instantiating from scratch.

**Problem:** Teams repeatedly need pre-filled Jira tickets. Manual copy/paste causes inconsistent checklists and shared mutable state between copies.

**Solution (UML-style text):**
- Prototype<T> (interface) with copy()
- TaskTemplate (Concrete Prototype) deep-copies its checklist
- TemplateRegistry (Client/Registry) stores named prototypes and returns clones
- Main clones templates and tweaks titles without touching the originals.

**When to use:** Object creation is expensive or complex, and you need many similar instances; or you must decouple code from concrete constructors.

**When NOT to use:** Objects are simple to create or cloning would introduce hidden shared state you cannot control.

**Pros:** Avoids repetitive setup, faster than re-building complex graphs, encapsulates copy logic.
**Cons:** Cloning can be tricky for deep graphs; risk of accidental shared mutable references.

**30-60 second explanation:** Prototype lets us clone a validated task template. The registry hands out copies so each Jira ticket starts consistent, while deep copying prevents one ticket's checklist edits from leaking into another.
