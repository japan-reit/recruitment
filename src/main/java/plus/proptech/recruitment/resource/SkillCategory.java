package plus.proptech.recruitment.resource;

import lombok.Value;

/**
 * プログラミング言語などのスキルカテゴリを表すクラス
 */
@Value(staticConstructor = "of")
public class SkillCategory {
    long id;
    String name;
}
