import org.mindrot.jbcrypt.BCrypt;

public class BCryptExample {

	public static void main(String[] args) {
	     // 加密密码
        String rawPassword = "123";
        String hashedPassword = BCrypt.hashpw(rawPassword, BCrypt.gensalt());
        System.out.println("Hashed Password: " + hashedPassword);
        
        //驗證密碼
        String userPassword = "123";	//模擬用戶輸入的密碼(明碼)
        boolean isPasswordMatch = BCrypt.checkpw(userPassword,"$2a$10$bhA5PxoYXKsPQrAiKofw7e.5a9RF.7biUwWPpUcsTCDWvzzKhB1C6");
        System.out.println("Password Match: " + isPasswordMatch);
        

	}

}
