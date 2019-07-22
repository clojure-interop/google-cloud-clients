(ns com.google.cloud.spanner.spi.v1.SpannerErrorInterceptor
  "Adds error details to statuses returned by the Cloud Spanner API. TODO(user): Add integration
  tests to check for error details."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.spi.v1 SpannerErrorInterceptor]))

(defn ->spanner-error-interceptor
  "Constructor."
  (^SpannerErrorInterceptor []
    (new SpannerErrorInterceptor )))

(defn intercept-call
  "method - `io.grpc.MethodDescriptor`
  call-options - `io.grpc.CallOptions`
  next - `io.grpc.Channel`

  returns: `<ReqT,RespT> io.grpc.ClientCall<ReqT,RespT>`"
  ([^SpannerErrorInterceptor this ^io.grpc.MethodDescriptor method ^io.grpc.CallOptions call-options ^io.grpc.Channel next]
    (-> this (.interceptCall method call-options next))))

