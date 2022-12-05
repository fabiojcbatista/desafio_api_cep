package Utilidades;

public class Endpoints {
    protected static final String BASE_URI = FileOperation.getProperties("Environment").getProperty("baseUri");
    protected static final String PATH_WS = FileOperation.getProperties("Environment").getProperty("ws");
    protected static final String PATH_FORMAT = FileOperation.getProperties("Environment").getProperty("format");
}
