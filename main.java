// メソッドの学習 [START] ========================================
//メソッドのイメージ
//メソッドとは、何らかの処理を割り当てた部品です。これまでmainメソッドだけに記述してきた処理部分を、メソッドに切り分けていきます。
//Javaのファイルを実行すると、自動的にmainメソッドが実行されます。mainメソッドの処理をメソッドに切り分けると、mainメソッドが各メソッドに指示を出し、各メソッドが個々の処理を実行するという構造になります。

//メソッドに切り分けることでコードが整理されます。また、メソッドは何度でも使いまわすことができます。

// メソッドの学習 [END] ==========================================
// メソッドとは、処理をまとめた部品だと考えれば、決して難しくはありません。以下ではhelloというメソッドを定義し、mainメソッドでhelloメソッドを呼び出しています
//Mainメソッド
//mainメソッドが呼ばれる>mainメソッドの中でhelloメソッドが呼ばれる>helloメソッドの中でSystem.out.println("Hello Java");が呼び出されt実行される
class Main {
  public static void main(String[] args) {
    hello();
  }

  // "Hello Java"と出力するhelloメソッド
  public static void hello() {
    System.out.println("Hello Java");
  }
}
