package ustis.fitnesscentrefront.api;

import okhttp3.*;
import ustis.fitnesscentrefront.api.interceptor.AccessTokenInterceptor;

import java.io.IOException;

public class FitnessCentreApi {
    private OkHttpClient client = new OkHttpClient.Builder()
            .build();

    private final String baseUrl = "http://localhost:8080/api";
    private final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    private FitnessCentreApi() {
    }

    private static class NotebookApiHolder {
        public static final FitnessCentreApi INSTANCE = new FitnessCentreApi();
    }

    public static FitnessCentreApi getInstance() {
        return NotebookApiHolder.INSTANCE;
    }

    public SimpleResponse execute(Request request) throws IOException {
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Запрос к серверу не был успешен: " +
                        response.code() + " " + response.message());
            }
            return new SimpleResponse(response.body().string(), response.message(), response.code());
        } catch (IOException e) {
            throw e;
        }
    }

    public SimpleResponse get(String url) throws IOException {
        Request request;

        request = new Request.Builder()
                .url(baseUrl + url)
                .build();

        return execute(request);
    }

    public SimpleResponse get(String url, String pathVariable) throws IOException {
        Request request = new Request.Builder()
                .url(baseUrl + url + pathVariable)
                .build();

        return execute(request);
    }

    public SimpleResponse post(String url) throws IOException {
        Request request;
        RequestBody body = RequestBody.create(null, new byte[]{});

        request = new Request.Builder()
                .url(baseUrl + url)
                .post(body)
                .build();

        return execute(request);
    }

    public SimpleResponse post(String url, String jsonBody) throws IOException {
        Request request;
        RequestBody body = RequestBody.create(jsonBody, JSON);

        request = new Request.Builder()
                .url(baseUrl + url)
                .post(body)
                .build();

        return execute(request);
    }

    public SimpleResponse put(String url, String jsonBody) throws IOException {
        Request request;
        RequestBody body = RequestBody.create(jsonBody, JSON);

        request = new Request.Builder()
                .url(baseUrl + url)
                .put(body)
                .build();

        return execute(request);
    }

    public SimpleResponse delete(String url, String pathVariable) throws IOException {
        Request request = new Request.Builder()
                .url(baseUrl + url + pathVariable)
                .delete()
                .build();

        return execute(request);
    }

    public void setAccessTokenInterceptor() {
        client = new OkHttpClient.Builder()
                .addInterceptor(new AccessTokenInterceptor())
                .build();
    }
}
