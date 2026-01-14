# Builder

**Intent:** Separate the construction of a complex object from its representation so the same process can create different variants.

**Problem:** Sales requests budget and luxury house plans with optional garage, garden, and automation. Telescoping constructors made object creation unclear and brittle.

**Solution (UML-style text):**
- House (Product)
- HouseBuilder (Builder interface)
  - BudgetHouseBuilder, LuxuryHouseBuilder (Concrete Builders)
- ConstructionEngineer (Director) sequences the steps
- Main (Client) picks the builder, director runs the recipe, returns a configured House.

**When to use:** Many optional parts or complex construction steps; same building process should support multiple representations.

**When NOT to use:** Simple objects with few parameters—constructors or static factories are simpler.

**Pros:** Readable object creation, prevents inconsistent states, supports multiple variants with the same assembly steps.
**Cons:** More boilerplate and classes; overkill for simple objects.

**30-60 second explanation:** Builder moves construction logic out of House and into builders. The engineer runs one recipe, but swapping builders yields a budget or luxury plan without changing the build steps.
