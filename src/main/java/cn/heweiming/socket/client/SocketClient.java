package cn.heweiming.socket.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner input = new Scanner(System.in);
		Socket sc = new Socket("127.0.0.1",9999);
		System.out.println("请输入要转换的字母");
		String inputData = input.next();
		OutputStream output = sc.getOutputStream();
		output.write(inputData.getBytes());
		output.flush();
		output.close();
		input.close();
		sc.close();
	}
	
}
