package com.damlaerismis;

import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

public class Menu extends User{

	public void showUserMenu() {
		System.out.println("****************");
		System.out.println("*     MENU     *");
		System.out.println("****************");
        System.out.println("Hoş geldiniz! Lütfen aşağıdaki seçeneklerden birini seçin:");
        System.out.println("0. Kayıt ol!");
        System.out.println("1. Giriş yap!");
        System.out.println("2. Şifremi unuttum!");
        System.out.println("3. Kullanıcı adımı güncelle.");
        System.out.println("4. Çıkış yap!");
    }
	
	public void chooseAction() {
		User user = new User();
		showUserMenu();
		boolean check = true;
		while(check) {
			System.out.println("Lütfen menüden yapmak istediğiniz işlemi seçiniz.");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 0:
				user.register();
				break;
			case 1:
				user.login();
				break;
			case 2:
				user.updatePassword();
				break;
			case 3:
				user.updateUsername();
				break;
			case 4:
				check = false;
				System.err.println("ÇIKIŞ");
				break;
			}
		}
	}
}
