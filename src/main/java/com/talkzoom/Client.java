package main.java.com.talkzoom;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description:
 * @author: zhuanglunhang
 * @create: 2020-11-10 18:40
 */
public class Client {

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(65532);
    System.out.println("等待连接");
    Socket socket = serverSocket.accept();
    System.out.println(socket.getInetAddress().getHostAddress() + "连接成功");
    InputStream inputStream = socket.getInputStream();
    byte[] data = new byte[1024];
    int len;
    StringBuilder stringBuilder = new StringBuilder();
    while((len = inputStream.read(data, 0, 1024)) > 0) {
      stringBuilder.append(new String(data, 0, len));
    }
    System.out.println(stringBuilder.toString());
  }
}