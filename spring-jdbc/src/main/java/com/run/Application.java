package com.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		 String jdbcURL = "jdbc:mysql://localhost:3306/test";
	        String username = "root";
	        String password = "welcome";
	 
	        String excelFilePath ="C:\\Users\\Tejaswini Ahire\\Desktop\\New folder\\exceldata\\table1.xlsx";
	       
	        int batchSize = 50;
	 
	        Connection connection = null;
	 
	        try {
	            long start = System.currentTimeMillis();
	             
	            FileInputStream inputStream = new FileInputStream(excelFilePath);
	 
	            Workbook workbook = new XSSFWorkbook(inputStream);
	 
	            Sheet firstSheet = workbook.getSheetAt(0);
	            Iterator<Row> rowIterator = firstSheet.iterator();
	 
	            connection = DriverManager.getConnection(jdbcURL, username, password);
	            connection.setAutoCommit(false);
	  
	            String sql = "INSERT INTO months (id,state,state_id,month,year,1st,2nd,3rd,4th,5th,6th,7th,8th,9th,10th,11th,12th,13th,14th,15th,16th,17th,18th,19th,20th,21st,22nd,23rd,24th,25th,26th,27th,28th,29th,30th,31st,Total" + 
	            		") VALUES (?,?,?,?,?, ?,?,?,?, ?,?,?,?, ?,?,?,?, ?,?,?,?, ?,?,?,?, ?,?,?,? ,?,?,?,? ,?,?,?,?)";
	            PreparedStatement statement = connection.prepareStatement(sql);    
	             
	            int count = 0;
	             
	            rowIterator.next(); // skip the header row
	             
	            while (rowIterator.hasNext()) {
	                Row nextRow = rowIterator.next();
	                Iterator<Cell> cellIterator = nextRow.cellIterator();
	 
	                while (cellIterator.hasNext()) {
	                    Cell nextCell = cellIterator.next();
	 
	                    int columnIndex = nextCell.getColumnIndex();
	 
	                    switch (columnIndex) {
	                    case 1:
	                        int id = (int) nextCell.getNumericCellValue();
	                        statement.setInt(1, id);
	                    break;
	                    case 2:
	                        String state = nextCell.getStringCellValue();
	                        statement.setString(2, state);
	                        break;
	                    case 3:
	                        int month = (int) nextCell.getNumericCellValue();
	                        statement.setInt(3, month);
	                    break;
	                    case 4:
	                        int year = (int) nextCell.getNumericCellValue();
	                        statement.setInt(4, year);
	                    break;
	                    case 5:
	                        int first = (int) nextCell.getNumericCellValue();
	                        statement.setInt(5, first);
	                    break;
	                    case 6:
	                        int second = (int) nextCell.getNumericCellValue();
	                        statement.setInt(6, second);
	                    break;
	                    case 7:
	                        int third = (int) nextCell.getNumericCellValue();
	                        statement.setInt(7, third);
	                    break;
	                    case 8:
	                        int fourth = (int) nextCell.getNumericCellValue();
	                        statement.setInt(8, fourth);
	                    break;
	                    case 9:
	                        int fifth = (int) nextCell.getNumericCellValue();
	                        statement.setInt(9, fifth);
	                    break;
	                    case 10:
	                        int six = (int) nextCell.getNumericCellValue();
	                        statement.setInt(10, six);
	                    break;
	                    case 11:
	                        Integer seven = (int) nextCell.getNumericCellValue();
	                        statement.setInt(11, seven);
	                        break;
	                    case 12:
	                        Integer eight = (int) nextCell.getNumericCellValue();
	                        statement.setInt(12, eight);
	                        break;
	                    case 13:
	                        Integer nine = (int) nextCell.getNumericCellValue();
	                        statement.setInt(13, nine);
	                        break;
	                    case 14:
	                        Integer ten = (int) nextCell.getNumericCellValue();
	                        statement.setInt(14, ten);
	                        break;
	                    
	                    case 15:
	                        int eleven = (int) nextCell.getNumericCellValue();
	                        statement.setInt(15, eleven);
	                    break;
	                    case 16:
	                        int twelve = (int) nextCell.getNumericCellValue();
	                        statement.setInt(16, twelve);
	                    break;
	                    case 17:
	                        int thirteen = (int) nextCell.getNumericCellValue();
	                        statement.setInt(17, thirteen);
	                    break;
	                    case 18:
	                        int fourteen = (int) nextCell.getNumericCellValue();
	                        statement.setInt(18, fourteen);
	                    break;
	                    case 19:
	                        int fifteen = (int) nextCell.getNumericCellValue();
	                        statement.setInt(19, fifteen);
	                    break;
	                    case 20:
	                        Integer sixteen = (int) nextCell.getNumericCellValue();
	                        statement.setInt(20, sixteen);
	                        break;
	                    case 21:
	                        Integer seventeen = (int) nextCell.getNumericCellValue();
	                        statement.setInt(21, seventeen);
	                        break;
	                    case 22:
	                        Integer eightteen = (int) nextCell.getNumericCellValue();
	                        statement.setInt(22,eightteen);
	                        break;
	                    case 23:
	                        Integer nineteen = (int) nextCell.getNumericCellValue();
	                        statement.setInt(23, nineteen);
	                        break;
	                    case 24:
	                        Integer twenty = (int) nextCell.getNumericCellValue();
	                        statement.setInt(24, twenty);
	                        break;
	                    case 25:
	                        Integer twentyone = (int) nextCell.getNumericCellValue();
	                        statement.setInt(25, twentyone);
	                        break;
	                    case 26:
	                        Integer twentytwo= (int) nextCell.getNumericCellValue();
	                        statement.setInt(26, twentytwo);
	                        break;
	                    case 27:
	                        Integer twentythree= (int) nextCell.getNumericCellValue();
	                        statement.setInt(27, twentythree);
	                        break;
	                   
	                case 28:
	                    Integer twentyfour= (int) nextCell.getNumericCellValue();
	                    statement.setInt(28, twentyfour);
	                    break;
	                case 29:
	                    Integer twentyfive= (int) nextCell.getNumericCellValue();
	                    statement.setInt(29, twentyfive);
	                    break;
	                case 30:
	                    Integer twentysix= (int) nextCell.getNumericCellValue();
	                    statement.setInt(30, twentysix);
	                    break;
	                case 31:
	                    Integer twentyseven= (int) nextCell.getNumericCellValue();
	                    statement.setInt(31, twentyseven);
	                    break;
	                case 32:
	                    Integer twentyeight= (int) nextCell.getNumericCellValue();
	                    statement.setInt(32, twentyeight);
	                    break;
	                case 33:
	                    Integer twentynine= (int) nextCell.getNumericCellValue();
	                    statement.setInt(33, twentynine);
	                    break;
	                case 34:
	                    Integer thirty= (int) nextCell.getNumericCellValue();
	                    statement.setInt(34, thirty);
	                    break;
	                case 35:
	                    Integer thirtyone= (int) nextCell.getNumericCellValue();
	                    statement.setInt(35, thirtyone);
	                    break;
	                case 36:
	                    Integer Total= (int) nextCell.getNumericCellValue();
	                    statement.setInt(36, Total);
	                    break;
	                case 37:
	                    Integer state_id= (int) nextCell.getNumericCellValue();
	                    statement.setInt(37, state_id);
	                    break;
	                	
	                    }
	 
	                }
	                 
	                statement.addBatch();
	                 
	                if (count % batchSize == 0) {
	                    statement.executeBatch();
	                }              
	 
	            }
	 
	            //((FileInputStream) workbook).close();
	             
	            // execute the remaining queries
	            statement.executeBatch();
	  
	            connection.commit();
	            connection.close();
	             
	            long end = System.currentTimeMillis();
	            System.out.printf("Import done in %d ms\n", (end - start));
	             
	        } catch (IOException ex1) {
	            System.out.println("Error reading file");
	            ex1.printStackTrace();
	        } catch (SQLException ex2) {
	            System.out.println("Database error");
	            ex2.printStackTrace();
	        }
	 
    }
	}