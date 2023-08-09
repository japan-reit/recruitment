# 準備
## Java
Java11をインストールしてください。

## IDE
IDEを使う場合は、gradle projectをインポートしてください。また、[lombok](https://projectlombok.org/)を使用していますので、お使いのIDEでlombokが使えるように設定してください。

## 実行
gradleでbootRunタスクを実行してください。http://localhost:8080 でアクセスできます。
IDEを使って実行しても構いません。

# 課題
## 本リポジトリのプログラムについて
SkillCheckResource.javaで定義されているデータについて、全件取得する、または条件を指定して絞り込めるAPIを持ったサーバーアプリケーションです。

## questions
Q1〜Q4の回答はREADME.mdに記載し、Q5はプログラムを修正して、別途申し上げる方法で回答してください。

Q1: 本アプリケーションで定義されているAPIのパス、パラメーター名と型を記載してください。

A1:

Q2: Q1のAPIによりデータを取得した場合のレスポンス(一例)を記載してください。

A2:

Q3: 本アプリケーションで例外が発生するパターンのAPIのパス、パラメーター名と値を記載してください。

A3:

Q4: Q1のAPIでhasSkill=trueを指定した際にどういうレスポンスになるか記載してください。

A4:

Q5: Q1のAPIで、SkillCheckResource.hasSKillの値を条件として検索できるように、パラメーター(名称: hasSkill, 型: Boolean)を追加してください。その際、SkillCheckService.java内のコメントに記載された条件を維持するようにしてください。
