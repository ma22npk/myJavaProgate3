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
  // public static void main(String[] args) {
  // int total = add(7, 5, 8);

  // System.out.println(total);
  // }

  // public static int add(int a, int b, int c) {
  // return a + b + c;
  // }

  // void:これまで定型だったvoidとは何でしょうか。voidは戻り値がない、という意味です。下図のhelloメソッドには、returnはなく戻り値はありません。このように戻り値のない（returnがない）メソッドには、voidを指定します。
  // 戻り値の具体例 [END] -----------------------------------------

  // 戻り値のあるメソッド [END] ==========================================
  // メソッドのオーバーロード [START] ========================================
  // 同名のメソッド [START] ---------------------------------------
  // 同名のメソッドは原則として定義できません。なぜなら同じメソッドが複数存在すると、メソッドを呼び出したときにどのメソッドを用いればいいのか、コンピュータがわからなくなってしまうためです。
  // 【メソッドのオーバーロード】
  // ただし、引数の型や個数が違う場合は同名のメソッドを定義できます。同名のメソッドがあっても、引数が違えばどれを呼べばいいのかコンピュータが判断できるためです。このように同名のメソッドを定義することをオーバーロードと言います。
  // 同名のメソッド [END] -----------------------------------------
  // メソッドのオーバーロード [END] ==========================================
  // メソッドからメソッドを呼ぶ [START] ========================================
  // メソッドは、mainメソッド以外のメソッドから呼び出すことも可能です。プログラムの部品であるメソッドが、相互に助けあってプログラムを形作ります。

  // ここで全てのメソッドを総合して計算する
  // 結果5.5
  // public static void main(String[] args) {
  // System.out.println(average(3, 8));
  // }

  // // 計算結果を小数点込みで２で割るメソッド
  // public static double average(int a, int b) {
  // int total = add(a, b);
  // return (double) total / 2;
  // }

  // // a + bで足し算を行うメソッド
  // public static int add(int a, int b) {
  // return a + b;
  // }

  // メソッドからメソッドを呼ぶ [END] ==========================================
  // 真偽値を返す [START] ========================================
  // 最後に、真偽値を返すメソッドも作ってみましょう。真偽値のデータ型はbooleanなので、メソッド定義は下図のようになります。isEvenメソッドは引数の値が偶数かどうかを調べ、偶数であればtrue、奇数であればfalseを返します。

  // 偶数か偶数でないかを判定し、結果を出力するメソッド
  // public static void main(String[] args) {
  // int number = 9;
  // if (isEven(number)) {
  // System.out.println(number + "は偶数です");
  // } else {
  // System.out.println(number + "は奇数です");
  // }
  // }

  // // 半分に割った時割り切れる数字を返すメソッド isEven を定義する
  // public static boolean isEven(int a) {

  // return a % 2 == 0;
  // }
  // 真偽値を返す [END] ==========================================

  // クラスに触れてみる [START] ========================================
  // 複数のクラスを使う
  // クラスは、メソッドという小さな部品をまとめる、より大きな部品です。これまではmainメソッドと同じクラス（Mainクラス）のメソッドを使ってきましたが、他のクラスのメソッドを利用することも可能です。
  // クラスの定義[START] ---------------------------------------
  // クラスの定義は「class クラス名」とします。
  // また右の図のように、クラス名の最初の文字は大文字にし、ファイル名は「クラス名.java」としなければなりません。これらのルールはしっかり覚えておきましょう。

  // クラスの定義[END] -----------------------------------------
  // クラスについての補足 [START] ---------------------------------------
  // Javaは、ファイルではなくクラスを実行します。また実行時にmainメソッドが呼ばれますが、正確にはmainメソッドを持つクラスしか実行できません（mainメソッドのないクラスは、他クラスから呼び出して使います）。
  // またクラス名に関係なく、実行時にはmainメソッドが呼ばれます（Mainクラスだからmainメソッドが呼ばれる、というわけはありません）。
  // クラスについての補足 [END] -----------------------------------------

  // クラスに触れてみる [END] ==========================================

  public static void main(String[] args) {
    // printDataメソッドとfullNameメソッドの呼び出しを書き換えてください
    Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
    Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }

}
