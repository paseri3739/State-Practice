// クソコードのサンプル
public class ShittyMain {
    public static void main(String[] args) {
        String state = "Closed"; // 状態がミュータブルでいつ書き換わるのかがわからない

        System.out.println("初期状態: " + state);

        // サンプルコードのため行数は少ないが、実際には以下のような条件式と再代入が無数にあることが想定される。
        // stateのスコープが広すぎるうえに、状態の変更がどこで行われているのかがわからない。
        // これでは状態遷移の管理が非常に難しく、バグが発生しやすい。
        // また、状態ごとに異なる処理を行うためにif文が多用されており、コードの可読性
        // が低下している。さらに、状態の変更が明示的ではなく、どの状態からどの状態へ
        // 遷移しているのかが一目でわからない。

        // 1: ボタンを押す
        if (state.equals("Closed")) {
            System.out.println("ドアを開けます");
            state = "Opening";
        }

        // 2: 開いた
        if (state.equals("Opening")) {
            System.out.println("ドアが開きました");
            state = "Opened";
        }

        // 3: ボタンを押す
        if (state.equals("Opened")) {
            System.out.println("ドアを閉めます");
            state = "Closing";
        }

        // 4: 障害物を検知
        if (state.equals("Closing")) {
            System.out.println("障害物を検知、再び開きます");
            state = "Opening";
        }

        // 5: 開いた
        if (state.equals("Opening")) {
            System.out.println("ドアが再び開きました");
            state = "Opened";
        }

        // 6: ボタンを押す
        if (state.equals("Opened")) {
            System.out.println("ドアを閉めます");
            state = "Closing";
        }

        // 7: 完全に閉じた
        if (state.equals("Closing")) {
            System.out.println("ドアが閉まりました");
            state = "Closed";
        }

        System.out.println("最終状態: " + state);
    }
}
