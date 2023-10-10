# mvp-demo
MVC, MVP, MVVMを比較するためのtodoアプリ


# デザインパターン: MVC, MVP, MVVM の比較

## 1. MVC (Model-View-Controller)

- **Model**: データとビジネスロジックを管理します。
- **View**: ユーザーインターフェース(UI)を管理します。
- **Controller**: ユーザーのアクションに基づいてModelを更新し、これらの変更をViewに反映します。

**特徴**:
- ControllerはModelとViewの間の通信を仲介します。
- Viewは多くの場合、Modelを直接参照します。
- Modelが更新されると、ControllerがViewを更新します。

## 2. MVP (Model-View-Presenter)

- **Model**: データとビジネスロジックを管理します。
- **View**: ユーザーインターフェースを管理します。MVPでは、Viewは通常インターフェースを実装します。
- **Presenter**: ユーザーのアクションに基づいてModelを更新し、これらの変更をViewに反映します。

**特徴**:
- PresenterはModelとViewの間の通信を仲介します。通常、ViewとPresenterは一対一の関係を持ちます。
- ViewはModelを直接参照しません。すべての通信はPresenterを通して行われます。

## 3. MVVM (Model-View-ViewModel)

- **Model**: データとビジネスロジックを管理します。
- **View**: ユーザーインターフェースを管理します。
- **ViewModel**: Viewに表示されるデータを保持し、データバインディングを使用してViewと同期します。

**特徴**:
- **データバインディング**: MVVMの特徴です。データバインディングにより、ViewModelのデータが変更されると、Viewが自動的に更新されます。逆に、ViewのユーザーアクションはViewModelを自動的に更新します。

  **サンプルコード**:
  ```java
  // TodoViewMVVM の例
  viewModel.taskProperty.bind(inputField.textProperty());
 
> 上記のコードは、`inputField`のテキストプロパティが変更されると、`viewModel`の`taskProperty`が自動的に更新されることを示しています。

**ViewModel**:
ViewModelはViewとModelの間に位置し、データバインディングを活用してViewと同期を保ちます。ViewはViewModelを参照しますが、Modelを直接参照することはありません。ViewModelはModelのデータをViewに適した形式に変換します。

## まとめ:

- **MVC**: ViewはModelを直接参照し、Controllerが更新を管理します。
- **MVP**: ViewはModelを直接参照しません。PresenterがViewとModelの間のすべての通信を管理します。
- **MVVM**: データバインディングにより、ViewModelのデータの変更がViewを自動的に更新し、ViewのユーザーアクションがViewModelを自動的に更新します。

特定の問題や状況に応じて、これらのパターンを適切に選択して適用することが重要です。
