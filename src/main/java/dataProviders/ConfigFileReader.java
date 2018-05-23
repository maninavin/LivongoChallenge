package dataProviders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public  class ConfigFileReader {
	
	private static Properties properties;
	private static final String pathToPropertiesFile = Paths.get("").toAbsolutePath().toString() + File.separator + "Configuration//Configuration.properties"
			+ File.separator;
	//private static final String pathToPropertiesFile = "Configuration//Configuration.properties";
	
	public static void ConfigFileReaderX(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(pathToPropertiesFile));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + pathToPropertiesFile);
		}		
	}
	
	public static String getURL() {
		ConfigFileReaderX();
		String url = properties.getProperty("URL");
		if(url!=null) 
		return url;
		else throw new RuntimeException("URL not specified in the Configuration.properties file.");
	}
	
	public static String getFirstName() {
		ConfigFileReaderX();
		String firstName = properties.getProperty("FirstName");
		if(firstName!=null) 
		return firstName;
		else throw new RuntimeException("firstName not specified in the Configuration.properties file.");
	}
	
	public static String getLastName() {
		ConfigFileReaderX();
		String lastName = properties.getProperty("LastName");
		if(lastName!=null) 
		return lastName;
		else throw new RuntimeException("lastName not specified in the Configuration.properties file.");
	}
	
	public static String mM() {
		ConfigFileReaderX();
		String mm = properties.getProperty("MM");
		if(mm!=null) 
		return mm;
		else throw new RuntimeException("Month not specified in the Configuration.properties file.");
	}
	
	public static String dD() {
		ConfigFileReaderX();
		String dd = properties.getProperty("DD");
		if(dd!=null) 
		return dd;
		else throw new RuntimeException("DD not specified in the Configuration.properties file.");
	}
	
	public static String yYYY() {
		ConfigFileReaderX();
		String yyyy = properties.getProperty("YYYY");
		if(yyyy!=null) 
		return yyyy;
		else throw new RuntimeException("YYYY not specified in the Configuration.properties file.");
	}
	
	public static String emailAddress() {
		ConfigFileReaderX();
		String emailAddress = properties.getProperty("EmailAddress");
		if(emailAddress!=null) 
		return emailAddress;
		else throw new RuntimeException("emailAddress not specified in the Configuration.properties file.");
	}
	
	public static String password() {
		ConfigFileReaderX();
		String password = properties.getProperty("Password");
		if(password!=null) 
		return password;
		else throw new RuntimeException("password not specified in the Configuration.properties file.");
	}
	
	public static String streetAddress() {
		ConfigFileReaderX();
		String streetAddress = properties.getProperty("StreetAddress");
		if(streetAddress!=null) 
		return streetAddress;
		else throw new RuntimeException("streetAddress not specified in the Configuration.properties file.");
	}
	
	public static String aptNo() {
		ConfigFileReaderX();
		String aptNo = properties.getProperty("AptNo");
		if(aptNo!=null) 
		return aptNo;
		else throw new RuntimeException("aptNo not specified in the Configuration.properties file.");
	}
	
	public static String city() {
		ConfigFileReaderX();
		String city = properties.getProperty("City");
		if(city!=null) 
		return city;
		else throw new RuntimeException("city not specified in the Configuration.properties file.");
	}
	
	public static String zipcode() {
		ConfigFileReaderX();
		String zipcode = properties.getProperty("ZipCode");
		if(zipcode!=null) 
		return zipcode;
		else throw new RuntimeException("zipcode not specified in the Configuration.properties file.");
	}
	
	public static String phoneNo() {
		ConfigFileReaderX();
		String phoneNo = properties.getProperty("PhoneNo");
		if(phoneNo!=null) 
		return phoneNo;
		else throw new RuntimeException("phoneNo not specified in the Configuration.properties file.");
	}
	
	public static String regCode() {
		ConfigFileReaderX();
		String regCode = properties.getProperty("RegCode");
		if(regCode!=null) 
		return regCode;
		else throw new RuntimeException("regCode not specified in the Configuration.properties file.");
	}
	
	public static String member() {
		ConfigFileReaderX();
		String member = properties.getProperty("Member");
		if(member!=null) 
		return member;
		else throw new RuntimeException("member not specified in the Configuration.properties file.");
	}
	
	public static String group() {
		ConfigFileReaderX();
		String group = properties.getProperty("Group");
		if(group!=null) 
		return group;
		else throw new RuntimeException("group not specified in the Configuration.properties file.");
	}

	
}


