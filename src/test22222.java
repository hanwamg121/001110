	import java.io.File;
	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;
	public class test22222
	{
		public static List<File> fileList = new ArrayList<File>();
		public static File file;

		
	    public static void main(String[] args) throws Exception
	    {
	        Class.forName("com.mysql.jdbc.Driver");
	 
//	        一开始必须填一个已经存在的数据库       
	        String url = "jdbc:mysql://127.0.0.1:3306/temp?useUnicode=true&characterEncoding=utf-8&useSSL=false";   
	        Connection conn = DriverManager.getConnection(url, "root", "301635");
	        Statement stat = conn.createStatement();
	        
	 
	        //创建数据库hello
	        stat.executeUpdate("create database test1");
	 
	        //打开创建的数据库
	        stat.close();
	        conn.close();
	        url = "jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=utf-8";
	        conn = DriverManager.getConnection(url, "root", "301635");
	        stat = conn.createStatement();
	 

////	        test("C:\\"); 
////		    test("D:\\"); 
////		    test("E:\\"); 
		    test("F:\\");
//		    for (File f1 : fileList) { 
//	    	System.out.println(f1.getName()); 
//	    	System.out.println(f1.length()); 
//	    	System.out.println(f1.getAbsolutePath());
//	    } 
	        //创建表test
	        stat.executeUpdate("create table tes(name varchar(1000), length varchar(1000),abPath varchar(1000))");
	        
	        
	        
	        for (File f1 : fileList) { 
	  	      System.out.println(f1.getName()); 
	  	     //添加数据
	          String sql = "insert into tes(name,length,abPath) values('"+f1.getName()+"','"+f1.length()+"','"+f1.getAbsolutePath()+"','"+reader.createFileReader(f1.getName())+"')";
	  	      stat.executeUpdate(sql);
//		      stat.executeUpdate("insert into tes values(2, '李四','2014')");
	  	    } 
	        
	        

	        //查询数据
	        ResultSet result = stat.executeQuery("select * from tes");
	        while (result.next())
	        {
	            System.out.println(result.getString("tes"));
	        }
	 
	        //关闭数据库
	        result.close();
	        stat.close();
	        conn.close();
	    }
	    private static void test(String fileDir) { 
		     
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
		   
//		    for (File f1 : fileList) { 
//		    	System.out.println(f1.getName()); 
//		    	System.out.println(f1.length()); 
//		    	System.out.println(f1.getAbsolutePath());
//		    	
//		    	
//		    } 
		    
		  } 
		  
		  public static void test01() {  
		    test("C:\\"); 
		    test("D:\\"); 
		    test("E:\\");
		    test("F:\\"); 
		  } 
	}