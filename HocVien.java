package test1803.ak221;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HocVien {
	private static String maSo, ten, ngaySinh, email, diaChi, sodt;
	private static Scanner s = new Scanner(System.in);

	public HocVien() {

	}

	public static void themHocVien() throws IOException {
		System.out.println("----------------------");
		System.out.println("Them hoc vien: ");
		do {
			System.out.println("Ho ten: ");
			ten = s.nextLine().trim();
		} while (ten.isEmpty());
		do {
			System.out.println("Ngay sinh: ");
			ngaySinh = s.nextLine().trim();
		} while (ngaySinh.isEmpty());
		do {
			System.out.println("Email: ");
			email = s.nextLine().trim();
		} while (email.isEmpty());
		do {
			System.out.println("Dia chi: ");
			diaChi = s.nextLine().trim();
		} while (diaChi.isEmpty());
		do {
			System.out.println("So dien thoai: ");
			sodt = s.nextLine().trim();
		} while (sodt.isEmpty());
		
		String path  = "/Users/Hoang/Documents/Eclipse/workspace/ak221/src/test1803/ak221/output.txt";
		FileReader fileReader = new FileReader(path);
		FileWriter fileWriter = new FileWriter(path, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String i;
		int count = 0;
		while((i=bufferedReader.readLine())!=null){
			count++;
		}
		
		maSo = "HV"+count;
		bufferedWriter.write("Ma_so:"+maSo+";Ho_ten:"+ten+";Ngay_sinh:"+ngaySinh+";Email:"+email+";Dia_chi:"+diaChi+";So_dt:"+sodt);
		bufferedWriter.newLine();
		
		bufferedReader.close();
		bufferedWriter.close();
	} 

	public static void xoaHocVien(String maSo) {

	}
	
	public static void xemDanhSachLop() throws IOException{
		String path  = "/Users/Hoang/Documents/Eclipse/workspace/ak221/src/test1803/ak221/output.txt";
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
	
		int count = 0;
		while((i=bufferedReader.readLine())!=null){
			count++;
		}
		
		if(count==0){
			System.out.println("Danh sach rong.");
		}else{
			String[] danhSach = new String[count];
			
		}
		
		
		
		bufferedReader.close();
	}
	
	public static void main(String[] args) throws IOException {
		HocVien.themHocVien();
	}
}
