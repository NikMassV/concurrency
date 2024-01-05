package edu.nm.concurrency.patterns.structural.composite;

public class Project {

    public static void main(String[] args) {
        Team team = new Team();
        Developer javaDeveloper1 = new JavaDeveloper();
        Developer javaDeveloper2 = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();
        team.addDeveloper(javaDeveloper1);
        team.addDeveloper(javaDeveloper2);
        team.addDeveloper(cppDeveloper);
        team.createProject();
    }
}
