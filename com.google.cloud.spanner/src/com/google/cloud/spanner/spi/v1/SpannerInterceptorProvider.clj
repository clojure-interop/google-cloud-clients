(ns com.google.cloud.spanner.spi.v1.SpannerInterceptorProvider
  "For internal use only. An interceptor provider that provides a list of grpc interceptors for
  GapicSpannerRpc to handle logging and error augmentation by intercepting grpc calls."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.spi.v1 SpannerInterceptorProvider]))

(defn *create-default
  "returns: `com.google.cloud.spanner.spi.v1.SpannerInterceptorProvider`"
  (^com.google.cloud.spanner.spi.v1.SpannerInterceptorProvider []
    (SpannerInterceptorProvider/createDefault )))

(defn with
  "client-interceptor - `io.grpc.ClientInterceptor`

  returns: `com.google.cloud.spanner.spi.v1.SpannerInterceptorProvider`"
  (^com.google.cloud.spanner.spi.v1.SpannerInterceptorProvider [^SpannerInterceptorProvider this ^io.grpc.ClientInterceptor client-interceptor]
    (-> this (.with client-interceptor))))

(defn get-interceptors
  "returns: `java.util.List<io.grpc.ClientInterceptor>`"
  (^java.util.List [^SpannerInterceptorProvider this]
    (-> this (.getInterceptors))))

