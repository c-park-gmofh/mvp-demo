package com.example.mvpdemo.view;

import com.example.mvpdemo.model.TodoModel;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TodoView {
    private VBox layout = new VBox();
    private TextField inputField = new TextField();
    private Button addButton = new Button("Add");
    private Button deleteButton = new Button("Delete");
    private ListView<String> todoList = new ListView<>();

    public TodoView(TodoModel model) {
        layout.getChildren().addAll(inputField, addButton, deleteButton, todoList);
        todoList.setItems(model.getTasks()); // MVC: ここでモデルを直接参照している

        addButton.setOnAction(e -> model.addTask(inputField.getText()));
        deleteButton.setOnAction(e -> model.removeTask(todoList.getSelectionModel().getSelectedItem()));
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
