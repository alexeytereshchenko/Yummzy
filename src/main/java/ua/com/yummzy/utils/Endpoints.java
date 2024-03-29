package ua.com.yummzy.utils;

public final class Endpoints {
    public static final String API = "/api";
    private static final String VERSION = "/v1";
    public static final String API_PREFIX = API + VERSION;

    public static final String RESTAURANT = API_PREFIX + "/restaurants";
    public static final String DISH = API_PREFIX + "/dishes";

    private Endpoints() {
    }
}
