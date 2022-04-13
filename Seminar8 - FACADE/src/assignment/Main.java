package assignment;

public class Main {


    public static void testConexion (Internet c, String URL) {
        c.connectTo(URL);
    }

    public static void main(String[] args) {
//        DealerAuto dealerAuto = new DealerAuto();
//
//        dealerAuto.getDetailsME();
//
        Internet conn = new ProxyInternet();
        conn.connectTo("abc.com");
        conn.connectTo("a1b1c1.ro");

        testConexion(conn, "abc.com");

    }
}
