package com.run.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.run.model.Excel;

public class ExcelRowMapper implements RowMapper<Excel> {

    public Excel mapRow(ResultSet rs, int rowNum) throws SQLException {

        Excel excel = new Excel();
        excel.setId(rs.getInt("id"));
        excel.setState(rs.getString("state"));
        excel.setState_id(rs.getInt("state_id"));
        excel.setMonth(rs.getInt("month"));
        excel.setYear(rs.getInt("year"));
        excel.setFirst(rs.getInt("1st"));
        excel.setSecond(rs.getInt("2nd"));
        excel.setThird(rs.getInt("3rd"));
        excel.setFourth(rs.getInt("4th"));
        excel.setFifth(rs.getInt("5th"));
        excel.setSix(rs.getInt("6th"));
        excel.setSeven(rs.getInt("7th"));
        excel.setEight(rs.getInt("8th"));
        excel.setNine(rs.getInt("9th"));
        excel.setTen(rs.getInt("10th"));
        excel.setEleven(rs.getInt("11th"));
        excel.setTwelve(rs.getInt("12th"));
        excel.setThirteen(rs.getInt("13th"));
        excel.setFourteen(rs.getInt("14th"));
        excel.setFifteen(rs.getInt("15th"));
        excel.setSixteen(rs.getInt("16th"));
        excel.setSeventeen(rs.getInt("17th"));
        excel.setEighteen(rs.getInt("18th"));
        excel.setNineteen(rs.getInt("19th"));
        excel.setTwenty(rs.getInt("20th"));
        excel.setTwentyone(rs.getInt("21st"));
        excel.setTwentytwo(rs.getInt("22nd"));
        excel.setTwentythree(rs.getInt("23rd"));
        excel.setTwentyfour(rs.getInt("24th"));
        excel.setTwentyfive(rs.getInt("25th"));
        excel.setTwentysix(rs.getInt("26th"));
        excel.setTwentyseven(rs.getInt("27th"));
        excel.setTwentyeight(rs.getInt("28th"));
        excel.setTwentynine(rs.getInt("29th"));
        excel.setThirty(rs.getInt("30th"));
        excel.setThirtyfirst(rs.getInt("31st"));
        excel.setTotal(rs.getInt("Total"));
        excel.setZone_name(rs.getString("zone_name"));
        return excel;

    }
}
