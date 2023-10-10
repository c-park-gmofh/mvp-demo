package com.example.mvpdemo.viewModel;

import com.example.mvpdemo.model.TodoModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class TodoViewModel {
    private TodoModel model;
    private StringProperty taskProperty = new SimpleStringProperty();

    public TodoViewModel(TodoModel model) {
        this.model = model;
    }

    public ObservableList<String> getTasks() {
        return model.getTasks();
    }

    public StringProperty taskProperty() {
        return taskProperty;
    }

    public void addTask() {
        model.addTask(taskProperty.get());
    }

    public void removeTask(String task) {
        model.removeTask(task);
    }
}
