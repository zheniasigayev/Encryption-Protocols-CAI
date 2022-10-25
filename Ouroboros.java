

public class Ouroboros implements EncryptProtocol{
    private static final int[] OUROBOROS_ONE = new int[] {3, 1, 0, 2};
    private static final int[] OUROBOROS_TWO = new int[] {2, 5, 4, 1, 3, 0};

    public String encrypt(String in, int key){
        int[] am = new int[0];

        if(key == 0){ //assigns am value based on key chosen
            am = OUROBOROS_ONE;
        }
        else if(key == 1){
            am = OUROBOROS_TWO;
        }

        StringBuilder out = new StringBuilder(); //encryption
        String use = in + new String(new char[am.length - (in.length() % am.length)]).replace("\0", " ");
        for(int i = 0; i < use.length(); i += am.length) {
            char[] next = new char[am.length];
            for(int j = 0; j < am.length; j++) {
                next[j] = use.charAt(i + am[j]);
            }
            out.append(new String(next));
        }
        return out.toString();
    }

    public String decrypt(String in, int key){
        int[] am = new int[0];

        if(key == 0){ //assigns am value based on key chosen
            am = OUROBOROS_ONE;
        }
        else if(key == 1){
            am = OUROBOROS_TWO;
        }

        StringBuilder out = new StringBuilder();
        String use = in+"";
        for(int i = 0; i < use.length(); i += am.length) {
            char[] next = new char[am.length];
            for(int j = 0; j < am.length; j++) {
                next[am[j]] = use.charAt(i + j);
            }
            out.append(new String(next));
        }
        return out.toString();

    }

}
