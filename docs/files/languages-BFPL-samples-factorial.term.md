# File _languages/BFPL/samples/factorial.term_
**[GitHub](https://github.com/softlang/yas/blob/master/languages/BFPL/samples/factorial.term)**
```
[ (factorial, ([inttype],inttype),[x],if(binary(eq,arg(x),intconst(0)),intconst(1),binary(mul,arg(x),apply(factorial,[binary(sub,arg(x),intconst(1))]))))],apply(factorial,[intconst(5)]).
```