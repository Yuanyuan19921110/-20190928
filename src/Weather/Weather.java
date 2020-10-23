package Weather;
public interface Weather{
	public static final int Day=7;
	public String getTime();
	public abstract String getInfo(String loc);
	
}