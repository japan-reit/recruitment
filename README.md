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
Q1〜Q4の回答はREADME.mdに記載し、Q5はプログラムを修正、Q6は新規にクラスを作成し、別途申し上げる方法で回答してください。

Q1: 本アプリケーションで定義されているAPIのパス、パラメーター名と型を記載してください。

A1:

Q2: Q1のAPIによりデータを取得した場合のレスポンス(一例)を記載してください。

A2:

Q3: 本アプリケーションで例外が発生するパターンのAPIのパス、パラメーター名と値を記載してください。

A3:

Q4: Q1のAPIでhasSkill=trueを指定した際にどういうレスポンスになるか記載してください。

A4:

Q5: Q1のAPIで、SkillCheckResource.hasSKillの値を条件として検索できるように、パラメーター(名称: hasSkill, 型: Boolean)を追加してください。その際、SkillCheckService.java内のコメントに記載された条件を維持するようにしてください。

Q6: あなたは新しく「SkillCategory」を管理する機能を追加することになりました。
以下の要件を満たすように、ControllerクラスとServiceクラスを新規に作成してください。
すでに実装されているSkillCheckResourceクラスとSkillCheckServiceクラスを参考にして構いません。

【要件】
1. SkillCategoryの一覧を取得するAPI（GET /skillCategories）を実装すること。
2. Serviceクラスには、SkillCategoryの一覧取得のロジックを実装すること。
3. SkillCategoryは「id（Long型）」「name（String型）」の2つのプロパティを持つものとする。
4. APIのリクエストパラメータとして「name（部分一致）」による絞り込みを可能にすること。
5. nameパラメータが未指定またはnullの場合は全件取得とすること。
6. nameパラメータが空文字列や50文字を超える場合は例外を発生させること。
