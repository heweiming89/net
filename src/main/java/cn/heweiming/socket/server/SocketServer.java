package cn.heweiming.socket.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("服务已开通");
		Socket socket = serverSocket.accept();
		System.out.println("开始服务");
		InputStream input = socket.getInputStream();
		StringBuilder sb = new StringBuilder();
		int read = -1;
		byte[] data = new byte[1024];
		while ((read = input.read(data)) > -1) {
			sb.append(new String(data, 0, read));
		}
		System.out.println(sb.toString().toUpperCase());
		input.close();
		serverSocket.close();
		System.out.println("服务终止");
	}
}
