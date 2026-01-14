# Visitor

**Intent:** Represent an operation to be performed on elements of an object structure, letting you define new operations without changing the elements.

**Problem:** Needed to both print and count lines in a file tree. Adding methods for each operation into Directory/TextFile would cause churn every time we add an operation.

**Solution (UML-style text):**
- Element: FileSystemNode with ccept(visitor)
  - Concrete Elements: TextFile, Directory
- Visitor: NodeVisitor with visit methods for each element type
  - Concrete Visitors: PrintingVisitor, LineCountingVisitor
- Client: Main builds the tree and applies visitors.

**When to use:** You have a stable object structure but frequently add new operations.

**When NOT to use:** Element hierarchy changes often; adding new visit methods would be painful.

**Pros:** Add new operations without modifying elements; keeps operations separate.
**Cons:** Adding new element types requires touching all visitors; double-dispatch adds complexity.

**30-60 second explanation:** Visitor keeps the file tree classes stable while allowing new operations. Visitors implement work (printing, counting) and are accepted by nodes, so adding another operation means a new visitor, not changes to every node.
