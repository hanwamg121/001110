package JavaP;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
 
//import com.Podcast.entity.*;
//import com.Podcast.dbutil.*;
 
public class GetPostDao {
 
	public List<PostBar> GetPost(int Pid){
		
		List<PostBar> lstpost=new ArrayList<PostBar>();
		DBconn dbconn=new DBconn();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String strSQL="select * from temp";
		ResultSet rs=dbconn.execQuery(strSQL,new Object[]{Pid});
		try{
			while(rs.next()){
				PostBar postbar=new PostBar();
//				postbar.setPid(rs.getInt("Pid"));
//				postbar.setTopic(rs.getString("Topic"));
				postbar.setMessage(rs.getString("Message"));
//				postbar.setPDate(rs.getString("PDate"));
//				postbar.setChangeDate(rs.getString("ChangeDate"));
//				postbar.setUid(rs.getInt("Uid"));
//				postbar.setPkind(rs.getString("PKind"));
				lstpost.add(postbar);
			}
			return lstpost;
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			dbconn.closeConn();
		}
		
	}
	
	private static void test(String fileDir) { 
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
	    } 
	  } 
	
	
}

