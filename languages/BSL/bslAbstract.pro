% BEGIN ...
:- module(bslAbstract, []).

% END ...
(name, String) ~> Atom :- name(Atom, String).
(args, [(X, Y)]) ~> [X|Y].
