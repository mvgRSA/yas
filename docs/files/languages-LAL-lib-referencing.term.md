# File _languages/LAL/lib/referencing.term_
**[GitHub](https://github.com/softlang/yas/blob/master/languages/LAL/lib/referencing.term)**
```
[reuse([composition],[]),reuse([language],[ ('L','RefL'), ('Any','RefAny')]),function(deref,[ref('RefL'),ref('L')],partial,ref('L')),axiom([],forall(bindv(r),ref('RefL'),forall(bindv(x),ref('L'),forall(bindv(y),ref('L'),ifthen(eq(funapp(deref,[var(r),var(x)]),var(y)),relapp(partOfStar,[var(y),var(x)]))))))].
```