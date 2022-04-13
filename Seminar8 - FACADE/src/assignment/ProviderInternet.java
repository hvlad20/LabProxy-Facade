package assignment;

public class ProviderInternet implements Internet{

    @Override
    public void connectTo(String URL) {
        System.out.println("Conexiune OK");
    }
}
