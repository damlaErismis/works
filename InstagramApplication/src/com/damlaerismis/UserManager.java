package com.damlaerismis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class UserManager {

	private String email;
	private String password;
	private String confirmPassword;
	private String securityQuestion;
	private String securityAnswer;
	private String username;
	private HashMap<String, ArrayList<Post>> posts;

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
			System.err.println("Şifreler eşleşmiyor. Lütfen yeniden şifre oluşturmayı deneyin.");
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
		System.out.print("Lütfen şifrenizi girin: ");
		String inputPassword = scanner.nextLine();
		if (inputUserName.equals(getUsername()) && inputPassword.equals(getPassword())) {
			System.out.println("Giriş başarılı.");
		} else {
			System.err.println("Kullanıcı adı veya şifre hatalı. Tekrar deneyin.");
			login();
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
				System.err.println("Güvenlik cevabınız yanlış. Lütfen tekrar deneyin.");
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
				System.err.println("Şifreler eşleşmiyor. Lütfen yeniden şifre oluşturmayı deneyin.");
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
			System.err.println("Güvenlik cevabı 3 kez yanlış girildi. Şifreniz güncellenemedi.");
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

	// post ekleme:
	public UserManager() {
		this.posts = new HashMap<String, ArrayList<Post>>();
	}

	public void addPost(String username) {
		Scanner captionScanner = new Scanner(System.in);
	    System.out.println("Gönderiye açıklama ekle:");
	    String caption = captionScanner.nextLine();

	    Scanner imageUrlScanner = new Scanner(System.in);
	    System.out.println("Görsel URL'si:");
	    String imageURL = imageUrlScanner.nextLine();

	    Post newPost = new Post(username, caption, imageURL);
	    ArrayList<Post> userPosts = posts.get(username);
	    if (userPosts == null) {
	        userPosts = new ArrayList<Post>();
	        posts.put(this.username, userPosts);
	    }
	    userPosts.add(newPost);
	    System.out.println("Gönderi başarıyla eklendi!");
	    
	    // Kullanıcının tüm postlarını göstermek için for-each döngüsü kullandık:
	    System.out.println(this.username + " kullanıcısının tüm postları:");
	    for (Post post : userPosts) {
	        System.out.println(caption + " - " + imageURL);
	    }
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

	public HashMap<String, ArrayList<Post>> getPostsByUser() {
		return posts;
	}

	public void setPostsByUser(HashMap<String, ArrayList<Post>> postsByUser) {
		this.posts = postsByUser;
	}

	//constructor method:
	public UserManager(String email, String password, String confirmPassword, String securityQuestion,
			String securityAnswer, String username, HashMap<String, ArrayList<Post>> posts) {
		super();
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.username = username;
		this.posts = posts;
	}

}
