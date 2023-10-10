package com.example.mvpdemo.view;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TodoViewMVP {
    private VBox layout = new VBox();
    private TextField inputField = new TextField();
    private Button addButton = new Button("Add");
    private Button deleteButton = new Button("Delete");
    private ListView<String> todoList = new ListView<>();

    public TodoViewMVP() {
        layout.getChildren().addAll(inputField, addButton, deleteButton, todoList);
        // MVP: モデルへの参照はここにはない。プレゼンターが介入する
    }

    public void updateList(javafx.collections.ObservableList<String> tasks) {
        todoList.setItems(tasks);
    }

    public VBox getLayout() {
        return layout;
    }

    public TextField getInputField() {
        return inputField;
    }

    public Button getAddButton() {
        return addButton;
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public ListView<String> getTodoList() {
        return todoList;
    }
}
