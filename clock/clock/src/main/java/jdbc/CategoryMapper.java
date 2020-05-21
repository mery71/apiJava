package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lacnt.clock.model.Category;

public class CategoryMapper implements RowMapper<Category> {

	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category cate=new Category();
		cate.setId_category(rs.getInt("id_category"));
		cate.setName(rs.getString("name"));
		return cate;
	}

}
