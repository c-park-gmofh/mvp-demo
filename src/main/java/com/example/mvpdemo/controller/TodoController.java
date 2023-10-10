package com.example.mvpdemo.controller;

import com.example.mvpdemo.model.TodoModel;
import com.example.mvpdemo.view.TodoView;

public class TodoController {
    private TodoModel model;
    private TodoView view;

    public TodoController(TodoModel model, TodoView view) {
        this.model = model;
        this.view = view;

        // MVC: コントローラはビューとモデルの間に介入して操作を管理する
        view.getAddButton().setOnAction(e -> model.addTask(view.getInputField().getText()));
        view.getDeleteButton().setOnAction(e -> model.removeTask(view.getTodoList().getSelectionModel().getSelectedItem()));
    }
}
