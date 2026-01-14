# Memento

**Intent:** Capture and externalize an object's internal state so it can be restored later, without exposing its implementation.

**Problem:** Writers wanted undo in a text editor. Exposing editor internals to the history mechanism would break encapsulation.

**Solution (UML-style text):**
- Originator: TextEditor creates/restores Snapshot
- Memento: Snapshot stores editor content
- Caretaker: History holds snapshots without inspecting them
- Client: Main saves, modifies, then restores state.

**When to use:** Need undo/rollback or checkpoints while keeping originator encapsulation.

**When NOT to use:** State is large or costly to copy; consider command-based undo.

**Pros:** Encapsulates state, simple undo semantics, originator controls what is saved.
**Cons:** Memory overhead for many snapshots; serialization of big state can be expensive.

**30-60 second explanation:** Memento lets the editor hand out a snapshot of its content. History stores snapshots blindly, and restoring rewinds to a previous state without other objects poking into editor internals.
