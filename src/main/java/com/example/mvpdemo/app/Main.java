package com.example.mvpdemo.app;

import com.example.mvpdemo.model.TodoModel;
import com.example.mvpdemo.view.TodoView;
import com.example.mvpdemo.view.TodoViewMVP;
import com.example.mvpdemo.view.TodoViewMVVM;
import com.example.mvpdemo.controller.TodoController;
import com.example.mvpdemo.presenter.TodoPresenter;
import com.example.mvpdemo.viewModel.TodoViewModel;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Uncomment the section below based on the pattern you want to see in action

        // For MVC
         TodoModel modelForMVC = new TodoModel();
         TodoView viewForMVC = new TodoView(modelForMVC);
         TodoController controllerForMVC = new TodoController(modelForMVC, viewForMVC);
         primaryStage.setScene(new Scene(viewForMVC.getLayout()));
         primaryStage.setTitle("Todo App MVC");

        // For MVP
//         TodoModel modelForMVP = new TodoModel();
//         TodoViewMVP viewForMVP = new TodoViewMVP();
//         TodoPresenter presenterForMVP = new TodoPresenter(modelForMVP, viewForMVP);
//         primaryStage.setScene(new Scene(viewForMVP.getLayout()));
//         primaryStage.setTitle("Todo App MVP");

        // For MVVM
//        TodoModel modelForMVVM = new TodoModel();
//        TodoViewMVVM viewForMVVM = new TodoViewMVVM();
//        TodoViewModel viewModelForMVVM = new TodoViewModel(modelForMVVM);
//        viewForMVVM.bind(viewModelForMVVM);
//        primaryStage.setScene(new Scene(viewForMVVM.getLayout()));
//        primaryStage.setTitle("Todo App MVVM");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
