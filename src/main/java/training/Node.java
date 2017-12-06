package training;


public class Node {
    public static void main(String[] args) {

        Code code = new Code();

        NetworkHacker networkHacker = new NetworkHacker();
        ComputerHacker computerHacker = new ComputerHacker();
        SocialNetworkHacker socialNetworkHacker = new SocialNetworkHacker();

        networkHacker.Hack();
        computerHacker.Hack();
        computerHacker.Hack();
        socialNetworkHacker.Hack();


        System.out.println(code.a);
        System.out.println(code.b);
        System.out.println(code.g);
    }
}
