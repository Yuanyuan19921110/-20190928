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
		
		if("����".equals(loc)) {
			return"������";
		}
		else if("�Ͼ�".equals(loc)) {
			return"��";
		}
		else {
			return"��";
		
		}
	}
}

