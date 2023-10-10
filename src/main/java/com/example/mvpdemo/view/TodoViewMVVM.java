package com.example.mvpdemo.view;

import com.example.mvpdemo.viewModel.TodoViewModel;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TodoViewMVVM {
    private VBox layout = new VBox();
    private TextField inputField = new TextField();
    private Button addButton = new Button("Add");
    private Button deleteButton = new Button("Delete");
    private ListView<String> todoList = new ListView<>();

    public TodoViewMVVM() {
        layout.getChildren().addAll(inputField, addButton, deleteButton, todoList);
        // MVVM: モデルへの直接的な参照はない。ViewModelを通じて操作や同期が行われる
    }

    public void bind(TodoViewModel viewModel) {
        todoList.setItems(viewModel.getTasks());
        // データバインディング: inputFieldのテキストプロパティとviewModelのtaskPropertyが同期される
        viewModel.taskProperty().bind(inputField.textProperty());

        addButton.setOnAction(e -> {
            viewModel.addTask();
            inputField.clear();
        });
        deleteButton.setOnAction(e -> viewModel.removeTask(todoList.getSelectionModel().getSelectedItem()));
    }

    public VBox getLayout() {
        return layout;
    }
}
