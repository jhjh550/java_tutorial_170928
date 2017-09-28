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
			System.out.println("동작을 입력해주세요.");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 출력");
			System.out.println("3. 데이터 저장");
			System.out.println("4. 데이터 열기");
			
			int type = s.nextInt();
			s.nextLine();
		
			if(type == 1) {			
				System.out.println("날짜를 입력해주세요.");
				String date = s.nextLine();
				
				System.out.println("음식명을 입력해주세요.");
				String name = s.nextLine();
				
				System.out.println("열량을 입력해주세요.");
				int kcal = s.nextInt();				
				
				Food f = new Food(name, kcal, date);
				myList.add(f);
			}else if(type ==2) {
//				for(int i=0;i<myList.size(); i++) {
//					Food f = myList.get(i);
//					System.out.println("name : "+f.getName() + 
//							" kcal : "+f.getKcal());
//				}
				
				System.out.println("검색할 날짜를 입력해 주세요 ex) 2017-9-27");
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
					System.out.println("해당날짜에 데이터가 없습니다.");
				}	
				if(totalKCal > 0) {
					System.out.println("총 열량은 : "+totalKCal);
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










