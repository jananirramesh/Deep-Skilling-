interface ExternalApi {
    void getData(String param);
}

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        api.getData("user123");
    }
}