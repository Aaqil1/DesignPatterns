# Observer

**Intent:** Define a one-to-many dependency so when one object changes state, all its dependents are notified and updated automatically.

**Problem:** Mobile app and risk engine both needed stock price updates. Polling led to stale data; direct callbacks created tight coupling.

**Solution (UML-style text):**
- Subject: StockMarket maintains observers and notifies them on price changes
- Observer: Observer interface
  - Concrete Observers: MobileApp, RiskEngine
- Client: Main attaches observers and triggers updates.

**When to use:** Multiple consumers need to react to subject changes; push-based updates preferred over polling.

**When NOT to use:** Few consumers or changes infrequent—simple method calls suffice.

**Pros:** Decouples subject from observers, supports dynamic subscriptions, automatic propagation.
**Cons:** Notification storms; ordering is not guaranteed; can be hard to debug chains of updates.

**30-60 second explanation:** Observer lets the stock market push price changes to interested parties. Observers subscribe once and get called whenever prices change, keeping subject and dependents loosely coupled.
