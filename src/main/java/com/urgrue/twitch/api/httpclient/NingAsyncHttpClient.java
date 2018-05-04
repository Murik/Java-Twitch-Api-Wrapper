package com.urgrue.twitch.api.httpclient;

import org.asynchttpclient.AsyncCompletionHandler;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Response;
import static org.asynchttpclient.Dsl.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class NingAsyncHttpClient extends HttpClient {

    private static final AsyncHttpClient asyncHttpClient = asyncHttpClient(); // can reuse

//    public NingAsyncHttpClient() {
//        super();
//        new AsyncHttpClient(new JDKAsyncHttpProvider(new AsyncHttpClientConfig.Builder().build()));
//    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(final String url, final HttpResponseHandler handler) {
        delete(url, new RequestParams(), handler);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(final String url, final RequestParams params, final HttpResponseHandler handler) {
            asyncHttpClient.prepareDelete(url)
                    .setHeaders(convertHeaders(getHeaders()))
                    .setQueryParams(convertParams(params))
                    .execute(new AsyncCompletionHandler<Response>() {

                        @Override
                        public Response onCompleted(Response response) throws Exception {
                            int statusCode = response.getStatusCode();
//                            Map<String, List<String>> headers = new HashMap<>(response.getHeaders());
                            String responseString = response.getResponseBody();

                            if (!isSuccessful(statusCode)) {
                                handler.onFailure(statusCode, response.getHeaders(), responseString);
                                return response;
                            }

                            handler.onSuccess(statusCode, response.getHeaders(), responseString);
                            return response;
                        }

                        @Override
                        public void onThrowable(Throwable t) {
                            handler.onFailure(t);
                        }
                    });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void get(final String url, final HttpResponseHandler handler) {
        get(url, new RequestParams(), handler);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void get(final String url, final RequestParams params, final HttpResponseHandler handler) {
            asyncHttpClient.prepareGet(url)
                    .setHeaders(convertHeaders(getHeaders()))
                    .setQueryParams(convertParams(params))
                    .execute(new AsyncCompletionHandler<Response>() {

                        @Override
                        public Response onCompleted(Response response) throws Exception {
                            int statusCode = response.getStatusCode();
//                            Map<String, List<String>> headers = new HashMap<>(response.getHeaders());
                            String responseString = response.getResponseBody();

                            if (!isSuccessful(statusCode)) {
                                handler.onFailure(statusCode, response.getHeaders(), responseString);
                                return response;
                            }

                            handler.onSuccess(statusCode, response.getHeaders(), responseString);
                            return response;
                        }

                        @Override
                        public void onThrowable(Throwable t) {
                            handler.onFailure(t);
                        }
                    });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void head(final String url, final HttpResponseHandler handler) {
        head(url, new RequestParams(), handler);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void head(final String url, final RequestParams params, final HttpResponseHandler handler) {
            asyncHttpClient.prepareHead(url)
                    .setHeaders(convertHeaders(getHeaders()))
                    .setQueryParams(convertParams(params))
                    .execute(new AsyncCompletionHandler<Response>() {

                        @Override
                        public Response onCompleted(Response response) throws Exception {
                            int statusCode = response.getStatusCode();
//                            Map<String, List<String>> headers = new HashMap<>(response.getHeaders());
                            String responseString = response.getResponseBody();

                            if (!isSuccessful(statusCode)) {
                                handler.onFailure(statusCode, response.getHeaders(), responseString);
                                return response;
                            }

                            handler.onSuccess(statusCode, response.getHeaders(), responseString);
                            return response;
                        }

                        @Override
                        public void onThrowable(Throwable t) {
                            handler.onFailure(t);
                        }
                    });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void post(final String url, final HttpResponseHandler handler) {
        post(url, new RequestParams(), handler);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void post(final String url, final RequestParams params, final HttpResponseHandler handler) {
            asyncHttpClient.preparePost(url)
                    .setHeaders(convertHeaders(getHeaders()))
                    .setFormParams(convertParams(params))
                    .execute(new AsyncCompletionHandler<Response>() {

                        @Override
                        public Response onCompleted(Response response) throws Exception {
                            int statusCode = response.getStatusCode();
//                            Map<String, List<String>> headers = new HashMap<>(response.getHeaders());
                            String responseString = response.getResponseBody();

                            if (!isSuccessful(statusCode)) {
                                handler.onFailure(statusCode, response.getHeaders(), responseString);
                                return response;
                            }

                            handler.onSuccess(statusCode, response.getHeaders(), responseString);
                            return response;
                        }

                        @Override
                        public void onThrowable(Throwable t) {
                            handler.onFailure(t);
                        }
                    });
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void put(final String url, final HttpResponseHandler handler) {
        put(url, new RequestParams(), handler);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void put(final String url, final RequestParams params, final HttpResponseHandler handler) {
            asyncHttpClient.preparePut(url)
                    .setHeaders(convertHeaders(getHeaders()))
                    .setFormParams(convertParams(params))
                    .execute(new AsyncCompletionHandler<Response>() {

                        @Override
                        public Response onCompleted(Response response) throws Exception {
                            int statusCode = response.getStatusCode();
//                            Map<String, List<String>> headers = new HashMap<>(response.getHeaders());
                            String responseString = response.getResponseBody();

                            if (!isSuccessful(statusCode)) {
                                handler.onFailure(statusCode, response.getHeaders(), responseString);
                                return response;
                            }

                            handler.onSuccess(statusCode, response.getHeaders(), responseString);
                            return response;
                        }

                        @Override
                        public void onThrowable(Throwable t) {
                            handler.onFailure(t);
                        }
                    });
    }

    /**
     * Converts a {@link RequestParams} object into the object type that the
     * {@link AsyncHttpClient} expects.
     *
     * @param params The parameters that should be sent with the HTTP request.
     * @return A {@link Map} object of all the request parameters.
     */
    private Map<String, List<String>> convertParams(RequestParams params) {
        Map<String, List<String>> ningParams = new HashMap<String, List<String>>();
        for (ConcurrentHashMap.Entry<String, String> param : params.entrySet()) {
            List<String> paramValues = new ArrayList<String>();
            paramValues.add(param.getValue());
            ningParams.put(param.getKey(), paramValues);
        }
        return ningParams;
    }

    /**
     * Converts the {@link HttpClient} headers object into the object type that the
     * {@link AsyncHttpClient} expects.
     *
     * @param headers The headers that should be sent with the HTTP request.
     * @return A {@link Map} object of all the Headers.
     */
    private Map<CharSequence, Collection<String>> convertHeaders(Map<String, String> headers) {
        Map<CharSequence, Collection<String>> ningHeaders = new HashMap<CharSequence, Collection<String>>();
        for (ConcurrentHashMap.Entry<String, String> param : headers.entrySet()) {
            Collection<String> paramValues = new ArrayList<String>();
            paramValues.add(param.getValue());
            ningHeaders.put(param.getKey(), paramValues);
        }
        return ningHeaders;
    }

    /**
     * Check if a HTTP response status code represents a successful
     * request or not.
     *
     * @param statusCode the HTTP response status code.
     * @return True if request was successful; otherwise, false.
     */
    private boolean isSuccessful(int statusCode) {
        return (statusCode >= 200 && statusCode <= 299);
    }
}
