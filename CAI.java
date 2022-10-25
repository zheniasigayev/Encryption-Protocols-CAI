

import java.util.ArrayList;
import java.util.Random;

public class CAI extends AbstractCAI{

    private ArrayList<EncryptProtocol> roster;
    private EncryptProtocol currentProtocol;
    private Random rand;

    public CAI(){
        roster = new ArrayList<EncryptProtocol>();
        roster.add(new Cerberus());
        roster.add(new Ouroboros());
        currentProtocol = new Cerberus();
        rand = new Random();
    }

    public int getKey(){
        int key = rand.nextInt(2);
        return key;
    }

    public EncryptProtocol getProtocol(){
        return currentProtocol;
    }

    public void setProtocol(){
        int protocolNum = rand.nextInt(roster.size());
        currentProtocol = roster.get(protocolNum);
        notifySites();
    }

    protected void notifySites(){
        super.notifySites();
    }

    public String receiveMessage(String in, int key){
        return currentProtocol.decrypt(in, key);

    }

    public String sendMessage(String in, int key){
        return currentProtocol.encrypt(in, key);
    }

}
