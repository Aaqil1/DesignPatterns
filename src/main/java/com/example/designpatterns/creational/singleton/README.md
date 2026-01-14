# Singleton

**Intent:** Ensure a class has only one instance and provide a global access point.

**Problem:** Feature flags and UI settings were being read/written by many modules, leading to inconsistent values when each created its own config object.

**Solution (UML-style text):**
- `ConfigurationManager` (singleton) — holds shared state, private constructor, static `getInstance()`.
- Clients call `ConfigurationManager.getInstance()` to read/update settings.

**When to use:** Shared cross-cutting resources (configuration, caches, registries) where exactly one instance is required.

**When NOT to use:** When you can inject dependencies normally, or when stateful singletons would hurt testability or scalability.

**Pros:** Controlled single instance, lazy initialization, simple access.
**Cons:** Can hide dependencies, state can become global mutable data if abused, harder to test if tightly coupled.

**30–60 second explanation:** Singleton protects a shared resource from accidental duplication. Here, configuration is loaded lazily and guarded by double-checked locking, so every caller shares the same source of truth without heavy synchronization.

