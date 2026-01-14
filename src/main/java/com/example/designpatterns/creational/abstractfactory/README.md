# Abstract Factory

**Intent:** Provide an interface for creating families of related objects without specifying their concrete classes.

**Problem:** The same payment screen must look native on mobile and web. Hard-coding 
ew MobileButton() in the screen would require editing every screen when adding a platform.

**Solution (UML-style text):**
- WidgetFactory (Abstract Factory)
  - MobileWidgetFactory / WebWidgetFactory (Concrete Factories)
- Button, Checkbox (Abstract Products)
  - MobileButton, MobileCheckbox, WebButton, WebCheckbox (Concrete Products)
- PaymentScreen (Client) builds UI using the factory, staying ignorant of concrete widget classes.

**When to use:** You need families of related products that must be used together (consistent look & feel) and you want to swap families at once.

**When NOT to use:** When products are unrelated or a single switch statement is enough; then a simple Factory Method can suffice.

**Pros:** Keeps client decoupled from concrete classes, enforces product compatibility, easy to add a new family in one place.
**Cons:** Adds more classes; adding a new product type affects all factories.

**30-60 second explanation:** Abstract Factory builds matched families of products. The payment screen only knows WidgetFactory, so switching between web and mobile requires swapping factories—no UI code changes and platform styles stay consistent.
