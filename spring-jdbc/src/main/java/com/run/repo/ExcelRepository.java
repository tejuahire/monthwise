package com.run.repo;
import com.run.model.Excel;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ExcelRepository {

    @Autowired
    JdbcTemplate template;
    
    
    public List<Excel> getmonth(Integer month, Integer year) {
         List<Excel> userInfoList = template.query("select * from months where month=? and year=?;", new Object[] { month, year },
                new ExcelRowMapper()); 
		return userInfoList;
    }  
  

//	public List<Map<String, Object>> getcol(Integer month) {
//		// TODO Auto-generated method stub
//        return template.queryForList("SELECT id,state,state_id,month,year,2nd FROM months WHERE month = ?", month);
//	} 
    
}
