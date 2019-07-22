(ns com.google.cloud.videointelligence.v1p3beta1.stub.GrpcStreamingVideoIntelligenceServiceStub
  "gRPC stub implementation for Cloud Video Intelligence API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1p3beta1.stub GrpcStreamingVideoIntelligenceServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.videointelligence.v1p3beta1.stub.GrpcStreamingVideoIntelligenceServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.videointelligence.v1p3beta1.stub.GrpcStreamingVideoIntelligenceServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcStreamingVideoIntelligenceServiceStub/create client-context callable-factory))
  (^com.google.cloud.videointelligence.v1p3beta1.stub.GrpcStreamingVideoIntelligenceServiceStub [^com.google.cloud.videointelligence.v1p3beta1.stub.StreamingVideoIntelligenceServiceStubSettings settings]
    (GrpcStreamingVideoIntelligenceServiceStub/create settings)))

(defn streaming-annotate-video-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoRequest,com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^GrpcStreamingVideoIntelligenceServiceStub this]
    (-> this (.streamingAnnotateVideoCallable))))

(defn close
  ""
  ([^GrpcStreamingVideoIntelligenceServiceStub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcStreamingVideoIntelligenceServiceStub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcStreamingVideoIntelligenceServiceStub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcStreamingVideoIntelligenceServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcStreamingVideoIntelligenceServiceStub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcStreamingVideoIntelligenceServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

