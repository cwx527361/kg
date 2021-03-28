package com.chenlei.graph.neo4j.model;

/**
 * @author ray
 * @date 2021/3/27 8:28 下午
 */
public class Question {
    private Long id;
    private String name;
    private String url;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
