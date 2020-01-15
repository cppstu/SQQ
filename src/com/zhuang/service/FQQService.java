package com.zhuang.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Properties;

public class FQQService {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(65532);
		Socket socket = serverSocket.accept();
		
		//加载配置文件
		Properties properties = new Properties();
		File file = new File("link.properties");
		if(!file.exists()) {
			
		}
			
		//获取客户端的目标ip和客户端ip
		//将内容拆解，把信息提取出来，将时间戳加上
		//将打包后的信息发送给目标ip
		//将内容记录下来
		//等待
	}
	private String linkProperties;
	private String messageText;
	public FQQService(String linkProperties, String messageText) {
		super();
		this.linkProperties = linkProperties;
		this.messageText = messageText;
	}
	public String getLinkProperties() {
		return linkProperties;
	}
	public void setLinkProperties(String linkProperties) {
		this.linkProperties = linkProperties;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	//加载配置文件
	public void init() {
		
	}
	//将内容拆解，把信息提取出来,客户端的目标ip,端口和客户端ip，端口，将时间戳加上
	public String checkPacket(String message) {
		return "";
	}
	//将打包后的信息发送给目标ip
	public int sendMessage(String message) {
		return 1;
	}
	//将内容记录下来
	public int writePacket(String message) {
		return 1;
	}
	//等待
	public void waitPacket() {
		
	}
}
