package com.example.mvpdemo.presenter;

import com.example.mvpdemo.model.TodoModel;
import com.example.mvpdemo.view.TodoViewMVP;

public class TodoPresenter {
    private TodoModel model;
    private TodoViewMVP view;

    public TodoPresenter(TodoModel model, TodoViewMVP view) {
        this.model = model;
        this.view = view;

        // MVP: プレゼンターがビューとモデルの間の全ての通信を管理する
        view.updateList(model.getTasks());
        view.getAddButton().setOnAction(e -> model.addTask(view.getInputField().getText()));
        view.getDeleteButton().setOnAction(e -> model.removeTask(view.getTodoList().getSelectionModel().getSelectedItem()));
    }
}
