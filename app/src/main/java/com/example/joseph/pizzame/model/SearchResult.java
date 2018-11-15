
package com.example.joseph.pizzame.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SearchResult implements Serializable
{

    private Query query;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4080468965424280963L;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
