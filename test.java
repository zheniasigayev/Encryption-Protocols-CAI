

public class test {
    public static void main(String[] args) {
        CAI cai = new CAI();
        Site site1 = new Site1(cai);
        Site site2 = new Site2(cai);
        cai.setProtocol();

        String s1 = "helloworld";
        String s2 = "doodoofart";
        String s3 = "helloworld";
        String s4 = "doodoofart";
        System.out.println(site1.receiveEncryptedMessage(s1));
        System.out.println(site1.receiveEncryptedMessage(s2));
        s1 = site1.receiveEncryptedMessage(s1);
        s2 = site1.receiveEncryptedMessage(s2);
        System.out.println(site1.receiveDecryptedMessage(s1));
        System.out.println(site1.receiveDecryptedMessage(s2));
        System.out.println();
        System.out.println(site2.receiveEncryptedMessage(s3));
        System.out.println(site2.receiveEncryptedMessage(s4));
        s3 = site2.receiveEncryptedMessage(s3);
        s4 = site2.receiveEncryptedMessage(s4);
        System.out.println(site2.receiveDecryptedMessage(s3));
        System.out.println(site2.receiveDecryptedMessage(s4));


    }
}
