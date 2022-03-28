package community.community.mapper;

import community.community.model.Question;
import org.apache.ibatis.annotations.Insert;

public interface QuestionMapper {
    @Insert("insert into question (title,description,gmtCreate,gmtModified,creator,tag)" +
            "valuse" +
            "(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);
}
