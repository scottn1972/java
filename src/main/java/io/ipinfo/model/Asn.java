package io.ipinfo.model;


public class Asn {
    private final String asn;
    private final String name;
    private final String domain;
    private final String route;
    private final String type;

    public Asn(String asn, String name, String domain, String route, String type) {
        this.asn = asn;
        this.name = name;
        this.domain = domain;
        this.route = route;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Asn{" +
                "asn='" + asn + '\'' +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", route='" + route + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
