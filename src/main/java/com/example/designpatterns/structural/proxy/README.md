# Proxy

**Intent:** Provide a surrogate or placeholder to control access to another object.

**Problem:** Product listing eagerly loaded large images, causing slowdowns even when users never opened them.

**Solution (UML-style text):**
- Subject: Image
- Real Subject: RealImage loads from disk immediately
- Proxy: LazyImageProxy delays creation/loading until display()
- Client: Main uses Image and is unaware whether it talks to a proxy or real object.

**When to use:** You need lazy loading, access control, caching, logging, or remote proxies to stand in for the real object.

**When NOT to use:** When indirection adds no value; direct access is simpler and cheap.

**Pros:** Controls object lifecycle, can add caching/security, improves performance via laziness.
**Cons:** Extra level of indirection; can hide expensive operations and surprise callers if misused.

**30-60 second explanation:** Proxy wraps RealImage and postpones the heavy disk load. The listing shows placeholders without loading images; only when display() is called does the real image instantiate and render.
