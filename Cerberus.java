

public class Cerberus implements EncryptProtocol {

    private static final int CEREBUS_ONE = 18;
    private static final int CEREBUS_TWO = 31;
    private static final int CEREBUS_INIT_VALUE = 32;
    private static final int CEREBUS_ALPH_SIZE = 128;

    public String encrypt(String in, int key) {
        int am = 0;

        if (key == 0) { //assigning the am value based on key chosen
            am = CEREBUS_ONE;
        } else if (key == 1) {
            am = CEREBUS_TWO;
        }

        StringBuilder out = new StringBuilder(); //encryption
        String use = in.toLowerCase();
        for (char a : use.toCharArray()) {
            out.append((char) (((a + am - CEREBUS_INIT_VALUE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE) + "");
        }
        return out.toString();
    }

    public String decrypt(String in, int key){
        int am = 0;

        if(key == 0){ //assigning the am value based on key chosen
            am = CEREBUS_ONE;
        }
        else if(key == 1){
            am = CEREBUS_TWO;
        }

            StringBuilder out = new StringBuilder(); //decryption
            String use = in.toLowerCase();
            for(char a : use.toCharArray()) {
                out.append((char)(((a - am  - CEREBUS_INIT_VALUE + CEREBUS_ALPH_SIZE) % CEREBUS_ALPH_SIZE) + CEREBUS_INIT_VALUE)+"");
            }
            return out.toString();
    }

}
