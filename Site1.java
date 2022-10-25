

public class Site1 implements Site{

    private CAI cai;
    private int key;
    private EncryptProtocol protocol;

    public Site1(CAI cai){
        this.cai = cai;
        protocol = null;
        cai.add(this);
    }

    public String receiveEncryptedMessage(String msg){ //requests CAI to encrypt a message
        return cai.sendMessage(msg, key);
    }

    public String receiveDecryptedMessage(String msg){ //requests CAI to decrypt a message
        return cai.receiveMessage(msg, key);
    }

    public void update(){ //updates the site with a new key and protocol
        key = cai.getKey();
        protocol = cai.getProtocol();
    }

    //other code should go here for site 1 to do something with

}
