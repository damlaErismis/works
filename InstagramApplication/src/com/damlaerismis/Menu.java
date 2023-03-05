package com.damlaerismis;

import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

public class Menu extends UserManager{

	public void showUserMenu() {
		System.out.println("****************");
		System.out.println("*     MENU     *");
		System.out.println("****************");
        System.out.println("Hoş geldiniz! Lütfen aşağıdaki seçeneklerden birini seçin:");
        System.out.println("0. Kayıt ol!");
        System.out.println("1. Giriş yap!");
        System.out.println("2. Şifremi unuttum!");
        System.out.println("3. Kullanıcı adımı güncelle.");
        System.out.println("4. Post Ekle!");
        System.out.println("5. ÇIKIŞ YAP!");
    }
	UserManager user = new UserManager();

	public void chooseAction() {
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
				user.addPost(getUsername());
				break;
			case 5:
				check = false;
				System.err.println("ÇIKIŞ");
				break;

			}
		}
	}
}
