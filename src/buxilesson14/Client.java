package buxilesson14;

import java.net.*;
import java.io.*;

public class Client
{
	private static final String HOST = "192.168.1.136";
	public static void main(String[] args)
		throws IOException
	{
		Socket socket = new Socket(HOST , 30000);
		// ��Socket��Ӧ����������װ��BufferedReader
		BufferedReader br = new BufferedReader(
		new InputStreamReader(socket.getInputStream()));
		// ������ͨIO����
		String line = br.readLine();
		System.out.println("���Է����������ݣ�" + line);
		// �ر���������socket
		br.close();
		socket.close();
	}
}