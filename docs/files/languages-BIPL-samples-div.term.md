# File _languages/BIPL/samples/div.term_
**[GitHub](https://github.com/softlang/yas/blob/master/languages/BIPL/samples/div.term)**
```
seq(assign(x,intconst(14)),seq(assign(y,intconst(4)),seq(assign(q,intconst(0)),seq(assign(r,var(x)),while(binary(geq,var(r),var(y)),seq(assign(r,binary(sub,var(r),var(y))),assign(q,binary(add,var(q),intconst(1))))))))).
```