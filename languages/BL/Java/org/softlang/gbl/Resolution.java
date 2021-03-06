package org.softlang.gbl;
public class Resolution {
    public static Syntax.World resolve(org.softlang.tbl.Syntax.World tree) {
        Syntax.World graph = new Syntax.World();
        graph.persons = new Syntax.Person[tree.persons.length];
        for (int i=0; i<tree.persons.length; i++) {
            graph.persons[i] = new Syntax.Person();
            graph.persons[i].name = tree.persons[i].name;
        }
        for (int i=0; i<tree.persons.length; i++)
            for (int j=0; j<tree.persons.length; j++)
                if (tree.persons[i].buddy==tree.persons[j].name) {
                    graph.persons[i].buddy = graph.persons[j];
                    break;
                }
        return graph;
    }
}
