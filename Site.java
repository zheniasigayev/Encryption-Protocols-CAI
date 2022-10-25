

public interface Site {
    String receiveEncryptedMessage(String msg);
    String receiveDecryptedMessage(String msg);
    public void update();
}
