# Strategy

**Intent:** Define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

**Problem:** Pricing logic changed frequently (discounts, surge). Conditional branches in checkout code multiplied and were error-prone.

**Solution (UML-style text):**
- Strategy: PricingStrategy with calculate()
  - Concrete Strategies: RegularPricing, DiscountPricing, SurgePricing
- Context: CheckoutService delegates pricing to its current strategy and can swap it.
- Client: Main switches strategies based on scenario.

**When to use:** Multiple algorithms for a task, selected at runtime; want to avoid large conditional blocks.

**When NOT to use:** Only one algorithm or variations are trivial.

**Pros:** Removes conditional logic, open/closed for new strategies, enables runtime selection/testing.
**Cons:** More objects; clients must know which strategy to choose.

**30-60 second explanation:** Strategy pulls pricing rules into separate classes. Checkout asks its strategy to price an item, so swapping from discount to surge means changing the strategy, not the checkout logic.
