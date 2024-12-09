package constants;

public class Constants
{
public static final String TESTDATAFILE=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx";//if we 
//need to give any constant values like path of something(eg: word ,image,error message,excel)give it in constant class
public static final String TOMATOIMAGE=System.getProperty("user.dir")+"\\src\\test\\resources\\TOMATO.jpg";
//Static variable and also can't change if it is final
//Static variable call as classname.variable name ie,constants.testdatafile
//test data file is a constant,final can't change if we want to give anything constant the
//constant class is using but should use static final 
public static final String SALTIMAGE=System.getProperty("user.dir")+"\\src\\test\\resources\\SALT.jpg";
public static final String CONFIG_FILE=System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";

public static final String MESSAGE="Homepage is not loaded with valid credentials";
public static final String ALERTMESSAGE="Alert message is not displayed";
public static final String NOBUTTONFOUND="Update Button not displayed";
}
