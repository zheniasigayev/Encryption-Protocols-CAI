

public interface EncryptProtocol {
    String encrypt(String msg, int key);
    String decrypt (String msg, int key);
}
