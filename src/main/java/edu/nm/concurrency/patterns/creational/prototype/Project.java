package edu.nm.concurrency.patterns.creational.prototype;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Project implements Prototypal {

    private int id;
    private String projectName;
    private String sourceCode;

    public Project(int id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("projectName", projectName)
                .append("sourceCode", sourceCode)
                .toString();
    }

    @Override
    public Object copy() {
        return new Project(id, projectName, sourceCode);
    }
}
