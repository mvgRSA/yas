# File _languages/DDL/as.term_
**[GitHub](https://github.com/softlang/yas/blob/master/languages/DDL/as.term)**
```
[type(schema,star(sort(table))),type(table,tuple([sort(tname),star(sort(column))])),type(column,tuple([sort(cname),sort(type),star(sort(clause))])),symbol(integer,[],type),symbol(varchar,[integer],type),symbol(notNull,[],clause),symbol(primaryKey,[],clause),symbol(foreignKey,[sort(tname),sort(cname)],clause),type(tname,string),type(cname,string)].
```