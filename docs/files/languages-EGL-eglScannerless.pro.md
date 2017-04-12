# File _languages/EGL/eglScannerless.pro_
**[GitHub](https://github.com/softlang/yas/blob/master/languages/EGL/eglScannerless.pro)**
```
% BEGIN ...
:- module(eglScannerless, []).
% END ...
parse(Rules1, Rules2, Layout, Mapping, Chars0, Tree) :-
    Terminal = eglScannerless:terminal(Rules2, Layout, Mapping),
    External = eglScannerless:external(Rules2, Layout, Mapping),
    Config = (Rules1, Terminal, External, Mapping),
...
```