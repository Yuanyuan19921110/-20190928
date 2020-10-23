package Weather;

public class TestWeatherImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weather weather;
		//父类  对象名      子类无参构造
		//Weather w=new WeatherImp();
		weather = new WeatherImp();
		System.out.println(weather.getInfo("南京"));
		System.out.println(weather.getTime());
		
		
	}

}
