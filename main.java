// メソッドの学習 [START] ========================================
//メソッドのイメージ
//メソッドとは、何らかの処理を割り当てた部品です。これまでmainメソッドだけに記述してきた処理部分を、メソッドに切り分けていきます。
//Javaのファイルを実行すると、自動的にmainメソッドが実行されます。mainメソッドの処理をメソッドに切り分けると、mainメソッドが各メソッドに指示を出し、各メソッドが個々の処理を実行するという構造になります。

//メソッドに切り分けることでコードが整理されます。また、メソッドは何度でも使いまわすことができます。

// メソッドの学習 [END] ==========================================
// メソッドとは、処理をまとめた部品だと考えれば、決して難しくはありません。以下ではhelloというメソッドを定義し、mainメソッドでhelloメソッドを呼び出しています
//Mainメソッド

// メソッドの定義 [START] ========================================
//mainメソッドが呼ばれる>mainメソッドの中でhelloメソッドが呼ばれる>helloメソッドの中でSystem.out.println("Hello Java");が呼び出されt実行される
class Main {
  // ブロック（{}で囲まれた部分）の中に、そのメソッドが行う処理を記述します。
  // public static void main(String[] args) {
  // メソッドを呼び出すためには、メソッド名()とするだけです。呼び出しの時の()を忘れないようにしましょう
  // hello();
  // }

  // メソッド定義の場所:メソッドはクラスの中に定義します。helloメソッドはMainクラスのブロック（{}）の中に定義されています
  // "Hello Java"と出力するhelloメソッド
  // メソッドの名前(name)は好きに付けることができますが、処理の内容が想像できるような名前をつけましょう。
  // public static void hello() {
  // System.out.println("Hello Java");
  // }

  // メソッドの定義 [END] ==========================================

  // 引数 [START] ========================================
  // 引数とはメソッドに与える追加情報のようなものです。メソッドを呼び出すときに、一緒に引数を渡すと、メソッドの中でその値を利用することができます。
  // 引数を受け取るメソッド（例） [START]----------------------
  // public static void メソッド名(データ型 変数名) {
  // ...
  // }
  // public static void hello(String name) {
  // ...
  // }

  // 引数を受け取るメソッド（例） [END]-----------------------------------------
  // 複数の引数を持つメソッド [START] ---------------------------------------
  // 引数は複数渡すこともできます。メソッドが複数の引数を受け取るためには、仮引数をコンマ（,）で区切って定義します。また、引数は左から順番に「第1引数、第2引数・・・」というように呼びます。覚えておきましょう。
  // public static void メソッド名(データ型 変数名1, データ型 変数名2) {
  // ...
  // }
  // （例）
  // public static void main(String[] args) {
  // // それぞれ年齢に関する引数を追加
  // printData("Kate Jones", 27);
  // printData("John Christopher Smith", 65);
  // }

  // public static void printData(String name, int age) {
  // System.out.println("私の名前は" + name + "です");
  // // 「年齢は◯◯歳です」と出力
  // System.out.println("年齢は" + age + "歳です");
  // }

  // （結果）
  // 私の名前はKate Jonesです
  // 年齢は27歳です 私の名前はJohn
  // Christopher Smithです
  // 年齢は65歳です

  // 複数の引数を持つメソッド [END] -----------------------------------------
  // 引数 [END] ==========================================

  // 戻り値のあるメソッド [START] ========================================
  // メソッドの中でreturnを使うと、returnの値をメソッドの呼び出し元に返すことができます。
  // また、戻り値があるメソッドは、戻り値のデータ型を指定します。ここまで定型だった「public static void」のvoidの部分で指定します。
  // （例）
  // public static 戻り値のデータ型 メソッド名(引数) {
  // return 戻り値;
  // }

  // 戻り値の具体例 [START] ---------------------------------------
  // 結果20
  public static void main(String[] args) {
    int total = add(7, 5, 8);

    System.out.println(total);
  }

  public static int add(int a, int b, int c) {
    return a + b + c;
  }

  //void:これまで定型だったvoidとは何でしょうか。voidは戻り値がない、という意味です。下図のhelloメソッドには、returnはなく戻り値はありません。このように戻り値のない（returnがない）メソッドには、voidを指定します。
  // 戻り値の具体例 [END] -----------------------------------------

  // 戻り値のあるメソッド [END] ==========================================
// メソッドのオーバーロード [START] ========================================
// 同名のメソッド [START] ---------------------------------------
// 同名のメソッドは原則として定義できません。なぜなら同じメソッドが複数存在すると、メソッドを呼び出したときにどのメソッドを用いればいいのか、コンピュータがわからなくなってしまうためです。
//【メソッドのオーバーロード】
// ただし、引数の型や個数が違う場合は同名のメソッドを定義できます。同名のメソッドがあっても、引数が違えばどれを呼べばいいのかコンピュータが判断できるためです。このように同名のメソッドを定義することをオーバーロードと言います。
// 同名のメソッド [END] -----------------------------------------
// メソッドのオーバーロード [END] ==========================================
}
