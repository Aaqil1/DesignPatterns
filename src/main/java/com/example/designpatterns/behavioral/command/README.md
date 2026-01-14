# Command

**Intent:** Encapsulate a request as an object, letting you parameterize clients with different requests, queue them, or log/replay them.

**Problem:** UI buttons were directly wired to device methods, preventing reuse, logging, and replay. Changing button behavior required changing the UI code.

**Solution (UML-style text):**
- Command: Command interface with execute()
- Concrete Commands: LightOnCommand, LightOffCommand
- Receiver: Light
- Invoker: RemoteControl stores history and executes commands
- Client: Main binds commands to the invoker.

**When to use:** You need to parameterize actions, support undo/redo, queue tasks, or decouple senders from receivers.

**When NOT to use:** When calling a method directly is enough and you don't need additional flexibility.

**Pros:** Decouples UI from logic, enables queuing and logging, simplifies undo/redo.
**Cons:** More classes; simple flows may feel verbose.

**30-60 second explanation:** Command wraps a light action into execute(). The remote control triggers commands without knowing how the light works and can replay the history because each press is a stored command object.
