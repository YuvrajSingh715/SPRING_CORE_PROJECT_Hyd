package com.springcore.classtaskD7;

import java.util.Scanner;

interface NotificationService {
	String sendNotifiaction(String message);
}

class EmailNotification implements NotificationService {

	@Override
	public String sendNotifiaction(String message) {
		return "Email sent successfully!! ";
	}

}

class SMSNotification implements NotificationService {

	@Override
	public String sendNotifiaction(String message) {
		return "SMS sent successfully!!!";
	}

}

class NotificationFactory {

	public static NotificationService getObject(String mode) {

		NotificationService input = null;

		if (mode.equalsIgnoreCase("Email")) {
			try {
				Class<?> forName = Class.forName("com.springboot.practice.EmailNotification");
				input = (NotificationService) forName.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		} else if (mode.equalsIgnoreCase("Sms")) {
			try {
				Class<?> forName = Class.forName("com.springboot.practice.SMSNotification");
				input = (NotificationService) forName.newInstance();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} else {
			input = null;
		}

		return input;
	}
}

class NotificationLogic {

	NotificationService notification;

	public String sendNotification(String message, String messageType) {
		try {
			notification = NotificationFactory.getObject(messageType);
		String notificationStatus = notification.sendNotifiaction(messageType);
		return notificationStatus;
		
		} catch (Exception e) {
			return "Notificaton failed: use appropate notificaion service";
		}
	}
}

public class NotificationApp {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\u001B[32m" + "Welcome to my simple Notification application!!!" + "\u001B[0m");
		System.out.println(System.lineSeparator());
		
		System.out.println("\u001B[33m" + "Give your message below" + "\u001B[0m");
		String message = scan.nextLine();
		
		System.out.println("\u001B[35m" + "Give a notification type below" + "\u001B[0m");
		String notificationType = scan.nextLine();
		
		System.out.println("\u001B[36m" + "Wait your Message is Sending..." + "\u001B[0m");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(System.lineSeparator());
		
		NotificationLogic nl = new NotificationLogic();
		String result = nl.sendNotification(message, notificationType);
		System.out.println("\u001B[38;5;208m" + result + "\u001B[0m");
	}

}
