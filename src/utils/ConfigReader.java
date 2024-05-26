package utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
	  Properties obj;
	    public ConfigReader() throws IOException
	    {
	        String path = "C:\\RestAssured\\Demo\\Object_Repository\\obj.Properties";
	        File fi = new File(path);
	        FileInputStream fis = new FileInputStream(fi);
	        obj  = new Properties();
	        obj.load(fis);
	    }
	    public String getEdgeKey()
	    {
	         return obj.getProperty("EdgeKey");
	    }
	    public String getEdgePath()
	    {
	        return obj.getProperty("EdgePath");
	    }
	    public String getBaseURL()
	    {
	        return obj.getProperty("BaseURL");
	    }
	    public String getExcelPath()
	    {
	    	return obj.getProperty("ExcelPath");
	    }

}
