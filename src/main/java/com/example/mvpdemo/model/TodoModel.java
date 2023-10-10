package com.example.mvpdemo.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TodoModel {
    private ObservableList<String> tasks = FXCollections.observableArrayList();

    public ObservableList<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }
}
