package com.springcore.classtaskD7;

import java.util.Scanner;

interface Logic {
	public String convertTo(String fileName);
}

class WORDMessageConverter implements Logic {

	@Override
	public String convertTo(String fileName) {
		return "<WORD>" + fileName + "</WORD>";
	}

}

class PDFMessageConverter implements Logic {

	@Override
	public String convertTo(String fileName) {
		return "<PDF>" + fileName + "</PDF>";
	}

}

class FactoryMessage {

	public static Logic factoryMethod(String type)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Logic data = null;

		if (type.equalsIgnoreCase("PDF")) {
			Class<?> forName = Class.forName("com.springboot.practice.PDFMessageConverter");
			data = (Logic) forName.newInstance();

		} else if (type.equalsIgnoreCase("WORD")) {
			Class<?> forName = Class.forName("com.springboot.practice.WORDMessageConverter");
			data = (Logic) forName.newInstance();
		}else {
			data = null;
		}

		return data;
	}
}

class ModificationLogic {

	Logic converter;

	public String modify(String fileName, String FormatType) {
		try {
			converter = FactoryMessage.factoryMethod(FormatType);
			String data = converter.convertTo(fileName);
			return data;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			return "Converting failed: Please give a appropriate format type of file";
		}
	}

}

public class DocumentConvertorApp {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Scanner scan = new Scanner(System.in);

		System.out.println("\u001B[32m" + "Welcome to my simple convertor application!!!" + "\u001B[0m");
		System.out.println(System.lineSeparator());

		System.out.println("\u001B[33m" + "Give your file name below" + "\u001B[0m");
		String name = scan.nextLine();

		System.out.println("\u001B[35m" + "Give the File Formate type below" + "\u001B[0m");
		String type = scan.nextLine();

		System.out.println("\u001B[36m" + "Wait your file is Converting..." + "\u001B[0m");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(System.lineSeparator());

		ModificationLogic mod = new ModificationLogic();
		String result = mod.modify(name, type);

		System.out.println("\u001B[38;5;208m" + result + "\u001B[0m");
	}

}
