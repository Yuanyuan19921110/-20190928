package buxilesson04;

public class lesson {

	public void judge(lesson brand)
	{
		//switch�����ı��ʽ������ö��ֵ
		switch (brand)
		{
			case Nokia:
				System.out.println("WindowsPhone��4000");
				break;
			case Samsung:
				System.out.println("Android��5000");
				break;
			case iPhone:
				System.out.println("iOS��6000");
				break;
			case MI:
				System.out.println("Android��1999");
				break;
			case Vivo:
				System.out.println("Android��3000");
				break;
			case BlackBerry:
				System.out.println("Android��2500");
				break;
			case HuaWei:
				System.out.println("Android��2500");
				break;
			case HTC:
				System.out.println("WindowsPhone��3800");
				break;
			case OPPO:
				System.out.println("Android��2200");
				break;
		}
	}
	public static void main(String[] args)
	{
		//����ö���඼��һ��values���������ظ�ö���������ʵ��
		for (lesson brand : brand.values()){
			
		}
			
			
		{
			
			System.out.println(brand.toString());
		}
		//ƽ��ʹ��ö��ʵ��ʱ������ͨ��EnumClass.variable��ʽ������
		EnumTest enumTest = new EnumTest();
		enumTest.judge(SeasonEnum.SPRING);
		System.out.println();
		System.out.println(SeasonEnum.SPRING.toString());
	}
}
