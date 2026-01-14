# Composite

**Intent:** Compose objects into tree structures to represent part-whole hierarchies so clients can treat individual objects and compositions uniformly.

**Problem:** Epics contain tasks and other epics. Reporting code duplicated logic to handle each type separately, making totals and printing brittle.

**Solution (UML-style text):**
- Component: WorkItem interface with estimateHours() and print()
- Leaf: Task
- Composite: Epic stores a list of WorkItem children and delegates operations
- Client: Main builds a tree and interacts with it uniformly.

**When to use:** You have hierarchical data (menus, org charts, project plans) where leaves and containers should share operations.

**When NOT to use:** Flat structures or when composite operations differ drastically from leaf behavior.

**Pros:** Uniform treatment of leaves/composites, simplifies client code, easy to add new components.
**Cons:** Can make type-specific behavior harder; overly generic composites may hide invariants.

**30-60 second explanation:** Composite models the project plan as a tree. Epic and Task both implement WorkItem, so estimating or printing works the same way whether you have a single task or a nested epic.
