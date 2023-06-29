package com.example.myapplication;

import java.util.Map;

public class JsonData {
    private Map<String, Map<String, String>> map;

    public JsonData() {
    }

    public JsonData(Map<String, Map<String, String>> map) {
        this.map = map;
    }

    public Map<String, Map<String, String>> getMap() {
        return map;
    }

    public void setMap(Map<String, Map<String, String>> map) {
        this.map = map;
    }
}
