package Weather;

public abstract class WeatherAbs implements Weather {

/*	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public String getInfo(String loc) {
		// TODO Auto-generated method stub
		
		if("大连".equals(loc)) {
			return"天气晴";
		}
		else if("南京".equals(loc)) {
			return"阴";
		}
		else {
			return"雨";
		
		}
	}
}

