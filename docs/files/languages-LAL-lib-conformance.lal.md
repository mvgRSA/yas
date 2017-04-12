# File _languages/LAL/lib/conformance.lal_
**[GitHub](https://github.com/softlang/yas/blob/master/languages/LAL/lib/conformance.lal)**
```
reuse language // The defined language
reuse language [ L |-> DefL, Any |-> DefAny ] 
constant defL : DefL // The language definition
relation conformsTo : Any # DefL
axiom { forall x <- Any. x <- L <=> conformsTo(x, defL) }
```