package plus.proptech.recruitment.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import plus.proptech.recruitment.resource.SkillCategory;
import plus.proptech.recruitment.resource.SkillCheckResource;

/**
 * スキルチェック用の結果を生成するクラス
 * 
 * @author sho-yamashita
 *
 */
@Component
public class SkillCheckObjectFactory {
	@Autowired
	private SkillCategoryFactory skillCategoryFactory;

	public List<SkillCheckResource> create() {
		var categories = skillCategoryFactory.createAll();
		var java = categories.get(0);
		var kotlin = categories.get(1);
		var js = categories.get(2);
		var ts = categories.get(3);

		var taro = SkillCheckResource.of("taro yamada", 28, true, List.of(java, kotlin));
		var shiori = SkillCheckResource.of("shiori yamada", 24, true, List.of(js, ts));
		var sho = SkillCheckResource.of("sho yamada", 38, false, List.of());
		var kazumasa = SkillCheckResource.of("kazumasa yamada", 44, false, List.of());
		var yasufumi = SkillCheckResource.of("yasufumi yamada", 35, true, List.of(java, ts));
		return List.of(taro, shiori, sho, kazumasa, yasufumi);
	}
}
