package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author geswe
 * @version 28.02.25
 */
public class PropertiesUtility
{
	/**
	 * This is a generic method to fetch a data from properties file
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromPropertiesFile(String key) throws Exception
	{
		FileInputStream fs=new FileInputStream(IPathUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fs);
		String value= prop.getProperty(key);
		return value;
	}
	

}
