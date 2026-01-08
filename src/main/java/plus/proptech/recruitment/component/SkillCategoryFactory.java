package plus.proptech.recruitment.component;

import java.util.List;

import org.springframework.stereotype.Component;

import plus.proptech.recruitment.resource.SkillCategory;

/**
 * SkillCategoryの生成を担当するファクトリ
 *
 * @author shiori-shinohe
 */
@Component
public class SkillCategoryFactory {
	public List<SkillCategory> createAll() {
		var java = SkillCategory.of(1L, "Java");
		var kotlin = SkillCategory.of(2L, "Kotlin");
		var js = SkillCategory.of(3L, "JavaScript");
		var ts = SkillCategory.of(4L, "TypeScript");
		return List.of(java, kotlin, js, ts);
	}
}
