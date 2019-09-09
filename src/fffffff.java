 import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

  
public class fffffff { 
		
		private static void test(String fileDir) throws ClassNotFoundException, SQLException { 
			List<File> fileList = new ArrayList<File>(); 
			File file = new File(fileDir); 
			File[] files = file.listFiles();// 获取目录下的所有文件或文件夹 
			if (files == null) {// 如果目录为空，直接退出 
				return; 
			} 
   
    // 遍历，目录下的所有文件 
    	for (File f : files) { 
    		if (f.isFile()) { 
    	  	fileList.add(f);
      		} else if (f.isDirectory()) { 
    	  test(f.getAbsolutePath()); 
      		} 
    	} 
   
    	
    	for (File f1 : fileList) { 
        	System.out.println(f1.getName()); 
        	System.out.println(f1.length()); 
        	System.out.println(f1.getAbsolutePath());
        } 
//    	Class.forName("com.mysql.jdbc.Driver");
//	  
////  	一开始必须填一个已经存在的数据库       
//    	String url = "jdbc:mysql://127.0.0.1:3306/temp?useUnicode=true&characterEncoding=utf-8&useSSL=false";   
//    	Connection conn = DriverManager.getConnection(url, "root", "301635");
//    	Statement stat = conn.createStatement();
//  
////创建数据库hello
//    	stat.executeUpdate("create database test111");
//
//  //打开创建的数据库
//    	stat.close();
//    	conn.close();
//    	url = "jdbc:mysql://localhost:3306/test111?useUnicode=true&characterEncoding=utf-8";
//    	conn = DriverManager.getConnection(url, "root", "301635");
//    	stat = conn.createStatement();
//  
//    	stat.executeUpdate("create table tes(length int, path varchar(3000),abPath varchar(3000))");
//  
//  
//  
//    	for (File f1 : fileList) { 
//	     System.out.println(f1.getName()); 
//	     //添加数据
//	  	String sql = "insert into tes(length,path,abPath) values('"+f1.length()+"','"+f1.getName()+"','"+f1.getAbsolutePath()+"')";
//  		stat.executeUpdate(sql);
////	    stat.executeUpdate("insert into tes values(2, '李四','2014')");
//	    } 
//    
//    	ResultSet result = stat.executeQuery("select * from tes");
//        while (result.next())
//        {
//            System.out.println(result.getString("tes"));
//        }
// 
//        //关闭数据库
//        result.close();
//        stat.close();
//        conn.close();
//    
//    
    
    
    
    
  } 

  public static void main(String[] args) throws ClassNotFoundException, SQLException {  
	
    
	  
    test("E:\\"); 
  } }