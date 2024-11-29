package constants;

public class Constants
{
public static final String TESTDATAFILE=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx";//if we need to give any constant values like path of somthing(eg: word ,image,error message,excel)give it in constant class
public static final String TOMATOIMAGE=System.getProperty("user.dir")+"\\src\\test\\resources\\TOMATO.jpg";
//ststic variable and also cnt change if it is final
//statice variable call as classname.variable name ie,constants.testdatafile
//test data file is a constant,final cant change if we want to give anything constant the constant class is using but should use static final 
public static final String SALTIMAGE=System.getProperty("user.dir")+"\\src\\test\\resources\\SALT.jpg";
public static final String CONFIG_FILE=System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";


}
