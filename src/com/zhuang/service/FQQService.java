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
		
		//���������ļ�
		Properties properties = new Properties();
		File file = new File("link.properties");
		if(!file.exists()) {
			
		}
			
		//��ȡ�ͻ��˵�Ŀ��ip�Ϳͻ���ip
		//�����ݲ�⣬����Ϣ��ȡ��������ʱ�������
		//����������Ϣ���͸�Ŀ��ip
		//�����ݼ�¼����
		//�ȴ�
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
	//���������ļ�
	public void init() {
		
	}
	//�����ݲ�⣬����Ϣ��ȡ����,�ͻ��˵�Ŀ��ip,�˿ںͿͻ���ip���˿ڣ���ʱ�������
	public String checkPacket(String message) {
		return "";
	}
	//����������Ϣ���͸�Ŀ��ip
	public int sendMessage(String message) {
		return 1;
	}
	//�����ݼ�¼����
	public int writePacket(String message) {
		return 1;
	}
	//�ȴ�
	public void waitPacket() {
		
	}
}
