package com.talkzoom;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @description:
 * @author: zhuanglunhang
 * @create: 2020-11-10 18:50
 */
public class ClientA {

  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("x.x.x.x", 65532);
    OutputStream outputStream = socket.getOutputStream();
    outputStream.write("你好".getBytes());
    outputStream.close();
//    InputStream inputStream = socket.getInputStream();
//    byte[] data = new byte[1024];
//    int len;
//    while((len = inputStream.read(data, 0, 1024)) != 0) {
//      System.out.println(new String(data, 0, len));
//    }
  }
}