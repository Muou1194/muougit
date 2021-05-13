public class Proxy implements Rent{
    Host host = new Host();

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        lookHouse();
        host.rent();
        fare();
    }

    public void fare() {
        System.out.println("show me money");
    }

    public void lookHouse() {
        System.out.println("just look");
    }

}
