package myproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class MyDietManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		ArrayList<Food> myList = new ArrayList<Food>();
		
		while(true) {			
			System.out.println("������ �Է����ּ���.");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ������ ���");
			System.out.println("3. ������ ����");
			System.out.println("4. ������ ����");
			
			int type = s.nextInt();
			s.nextLine();
		
			if(type == 1) {			
				System.out.println("��¥�� �Է����ּ���.");
				String date = s.nextLine();
				
				System.out.println("���ĸ��� �Է����ּ���.");
				String name = s.nextLine();
				
				System.out.println("������ �Է����ּ���.");
				int kcal = s.nextInt();				
				
				Food f = new Food(name, kcal, date);
				myList.add(f);
			}else if(type ==2) {
//				for(int i=0;i<myList.size(); i++) {
//					Food f = myList.get(i);
//					System.out.println("name : "+f.getName() + 
//							" kcal : "+f.getKcal());
//				}
				
				System.out.println("�˻��� ��¥�� �Է��� �ּ��� ex) 2017-9-27");
				String date = s.nextLine();
				int count = 0;
				int totalKCal = 0;
				for(int i=0; i<myList.size(); i++) {
					Food f = myList.get(i);
					if(date.equals(f.getDate())) {
						System.out.println("name : "+f.getName() + 
								" kcal : "+f.getKcal());
						count++;
						totalKCal += f.getKcal();
					}
				}
				if(count == 0) {
					System.out.println("�ش糯¥�� �����Ͱ� �����ϴ�.");
				}	
				if(totalKCal > 0) {
					System.out.println("�� ������ : "+totalKCal);
				}
			}else if(type ==3) {
				String fileName = "MyData.csv";
				try {
					BufferedWriter writer = new BufferedWriter(
							new OutputStreamWriter(
							new FileOutputStream(fileName), "MS949"));
					for(int i=0; i<myList.size(); i++) {
						Food f = myList.get(i);
						String str = f.getDate()+","+f.getName()+","+f.getKcal()+"\r\n";
						writer.write(str);
					}
					
					writer.close();
					
				}catch(IOException e) {
					
				}
			}else if(type ==4) {
				myList.clear();
				
				String fileName = "MyData.csv";
				BufferedReader br = null;
		        String line = null;
		        String cvsSplitBy = ",";
		        try {
					br = new BufferedReader(
							new InputStreamReader(
							new FileInputStream(fileName), "MS949"));
										
		            while ((line = br.readLine()) != null) {
		                String[] field = line.split(cvsSplitBy);
		                String date = field[0];
		                String name = field[1];
		                int kcal = Integer.parseInt(field[2]);
		                
		                Food f = new Food(name, kcal, date);
						myList.add(f);
		            }
		        }catch(Exception e) {
		        	
		        }
			}else if(type == 5) {
				try {
					URL oracle = new URL("http://keenset.dothome.co.kr/MyData.csv");
				    BufferedReader in = new BufferedReader(
				    new InputStreamReader(oracle.openStream()));
	
				    String inputLine;
				    while ((inputLine = in.readLine()) != null)
				        System.out.println(inputLine);
				    in.close();
				}catch(Exception e) {
					
				}
			}
		}
	}
}










