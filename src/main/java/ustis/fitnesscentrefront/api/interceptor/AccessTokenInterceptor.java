package ustis.fitnesscentrefront.api.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ustis.fitnesscentrefront.StateManager;

import java.io.IOException;

public class AccessTokenInterceptor implements Interceptor {
    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request newRequest;

        newRequest = request.newBuilder()
                .addHeader("Authorization", StateManager.getInstance().getToken())
                .build();
        return chain.proceed(newRequest);
    }
}
