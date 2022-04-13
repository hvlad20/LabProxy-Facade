package assignment;

import java.util.ArrayList;

public class ProxyInternet implements Internet {
    ArrayList<String> blackList = new ArrayList<>();
    ProviderInternet providerInternet = new ProviderInternet();

    public void addToBlackList(String URL) {
        blackList.add(URL);
    }

    public ProxyInternet() {
        addToBlackList("abc.com");
    }

    @Override
    public void connectTo(String URL) {
        for (String urlbl : blackList) {
            if(urlbl == URL)
            {
                System.out.println("Conexiune blocata!");
            }
            else {
                providerInternet.connectTo(URL);
            }
        }
    }
}
