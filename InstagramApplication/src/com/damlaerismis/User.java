package com.damlaerismis;

import java.util.Scanner;

public class User {

	private String email;
	private String password;
	private String confirmPassword;
	private String securityQuestion;
	private String securityAnswer;
	private String username;

	// kayıt olma işlemi:
	public void register() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kullanıcı adı giriniz: ");
		this.username = scanner.nextLine();
		System.out.print("E-posta adresiniz: ");
		this.email = scanner.nextLine();
		System.out.print("Şifreniz: ");
		this.password = scanner.nextLine();
		System.out.println("Şifrenizi tekrar girin: ");
		this.confirmPassword = scanner.nextLine();

		while (!password.equals(confirmPassword)) {
			System.out.println("Şifreler eşleşmiyor. Lütfen yeniden şifre oluşturmayı deneyin.");
			System.out.println("Şifre giriniz: ");
			password = scanner.nextLine();
			System.out.println("Şifrenizi tekrar giriniz: ");
			confirmPassword = scanner.nextLine();
		}

		System.out.print("Güvenlik sorusu: ");
		this.securityQuestion = scanner.nextLine();
		System.out.print("Güvenlik cevabı: ");
		this.securityAnswer = scanner.nextLine();
		System.out.println("Kaydınız başarıyla tamamlandı.");
	}

	// giriş yapma işlemi:
	public void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı adı girin: ");
		String inputUserName = scanner.nextLine();
		if (inputUserName.equals(getUsername())) {
			System.out.print("Lütfen şifrenizi girin: ");
			String inputPassword = scanner.nextLine();
			if (inputPassword.equals(getPassword())) {
				System.out.println("Giriş başarılı.");
			} else {
				System.out.println("Giriş başarısız. Şifrenizi kontrol edin.");
				login();
			}
		}

	}

	// şifremi unuttum şifre güncelleme işlemi:
	public void updatePassword() {
		Scanner scanner = new Scanner(System.in);
		String inputAnswer;
		boolean isAnswerCorrect = false;
		int numberOfAnswers = 0;

		// kullanıcıya 3 kere cevap girme hakkı tanıdık:
		do {
			System.out.print("Lütfen güvenlik sorusuna cevap verin: ");
			inputAnswer = scanner.nextLine();

			if (inputAnswer.equals(this.securityAnswer)) {
				isAnswerCorrect = true;
			} else {
				System.out.println("Güvenlik cevabınız yanlış. Lütfen tekrar deneyin.");
				numberOfAnswers++;
			}
		} while (!isAnswerCorrect && numberOfAnswers < 3);
		// kurtarma sorusunun cevabı doğruysa güncelleme işlemi başlayacak:
		if (isAnswerCorrect) {
			System.out.print("Yeni şifrenizi girin: ");
			String newPassword = scanner.nextLine();
			System.out.print("Yeni şifrenizi tekrar girin: ");
			String newConfirmPassword = scanner.nextLine();
			// şifreler uyuşmuyorsa tekrar girmesini isteyecek:
			while (!newPassword.equals(newConfirmPassword)) {
				System.out.println("Şifreler eşleşmiyor. Lütfen yeniden şifre oluşturmayı deneyin.");
				System.out.println("Yeni şifrenizi girin: ");
				newPassword = scanner.nextLine();
				System.out.println("Yeni şifrenizi tekrar giriniz: ");
				newConfirmPassword = scanner.nextLine();
				if (newPassword.equals(newConfirmPassword)) {
					break;
				} else {
					continue;
				}
			}
			this.password = newPassword;
			System.out.println("Şifreniz başarıyla güncellendi.");
		} else {
			System.out.println("Güvenlik cevabınız 3 kez yanlış girildi. Şifreniz güncellenemedi.");
		}
	}

	// kullanıcı adı güncelleme:
	public void updateUsername() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yeni kullanıcı adınızı girin: ");
		String newUsername = scanner.nextLine();
		this.username = newUsername;
		System.out.println("Kullanıcı adınız başarıyla güncellendi.");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
