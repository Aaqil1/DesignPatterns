# Interpreter

**Intent:** Given a language, define a representation for its grammar and an interpreter to evaluate sentences in the language.

**Problem:** Feature rollout rules combined flags with AND/OR/NOT logic. Scattered if statements were hard to change and test.

**Solution (UML-style text):**
- Abstract Expression: Expression with interpret(context)
- Terminal Expressions: LiteralExpression, VariableExpression
- Non-terminals: AndExpression, OrExpression, NotExpression
- Client: builds an expression tree and evaluates it with a context map.

**When to use:** Small, stable grammars where you need to evaluate expressions often and want composable rules.

**When NOT to use:** Large/complex grammars (use a parser generator), or when hard-coded logic is simpler.

**Pros:** Clear grammar model, easy to extend with new expressions, testable components.
**Cons:** Can lead to many small classes; parsing input strings requires additional work.

**30-60 second explanation:** Interpreter turns a flag rule into an expression tree of AND/OR/NOT nodes. Evaluating the tree against a context answers whether a feature is enabled without tangled conditionals.
