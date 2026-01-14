# Flyweight

**Intent:** Share objects to support large numbers of fine-grained instances efficiently.

**Problem:** Map rendering created a new icon object per marker. Thousands of identical restaurant icons consumed unnecessary memory.

**Solution (UML-style text):**
- Flyweight: Icon holds intrinsic state (type, color)
- Factory: IconFactory caches icons by key
- Context: MapMarker stores extrinsic state (x, y) and references a shared Icon
- Client: Main requests icons from the factory and reuses them across markers.

**When to use:** Very many similar objects; most state can be shared; memory footprint matters.

**When NOT to use:** When objects are few, or most state is unique so sharing brings little benefit.

**Pros:** Reduced memory usage, centralized shared state management.
**Cons:** Added complexity; extrinsic state must be managed by clients.

**30-60 second explanation:** Flyweight pulls common data (icon sprite) into shared Icon objects. Markers keep only coordinates, so thousands of markers reuse a handful of icons instead of duplicating them.
