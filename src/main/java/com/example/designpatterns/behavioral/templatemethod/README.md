# Template Method

**Intent:** Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.

**Problem:** PDF and CSV reports follow the same steps (fetch, format, export) but differed in implementation. Duplicated step ordering drifted over time.

**Solution (UML-style text):**
- Abstract Class: ReportGenerator defines final generate() calling abstract steps
- Concrete Classes: PdfReport, CsvReport implement the steps
- Client: Main runs generate(); algorithm order is fixed, step details vary.

**When to use:** Algorithms share structure but vary in specific steps; want to enforce sequence and reuse skeleton.

**When NOT to use:** Steps differ completely; strategy or composition may fit better.

**Pros:** Prevents duplicate algorithm structure, easy to add variants, enforces order.
**Cons:** Inheritance-based; changes to skeleton affect all subclasses; can lead to fragile base class.

**30-60 second explanation:** Template Method locks in the report workflow. Subclasses only implement the step details, so all reports run fetch → format → export consistently without copy/paste.
