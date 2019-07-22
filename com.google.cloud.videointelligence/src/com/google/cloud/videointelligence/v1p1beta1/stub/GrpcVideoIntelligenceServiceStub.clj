(ns com.google.cloud.videointelligence.v1p1beta1.stub.GrpcVideoIntelligenceServiceStub
  "gRPC stub implementation for Cloud Video Intelligence API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.videointelligence.v1p1beta1.stub GrpcVideoIntelligenceServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.videointelligence.v1p1beta1.stub.GrpcVideoIntelligenceServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.videointelligence.v1p1beta1.stub.GrpcVideoIntelligenceServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcVideoIntelligenceServiceStub/create client-context callable-factory))
  (^com.google.cloud.videointelligence.v1p1beta1.stub.GrpcVideoIntelligenceServiceStub [^com.google.cloud.videointelligence.v1p1beta1.stub.VideoIntelligenceServiceStubSettings settings]
    (GrpcVideoIntelligenceServiceStub/create settings)))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcVideoIntelligenceServiceStub this]
    (-> this (.getOperationsStub))))

(defn annotate-video-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.videointelligence.v1p1beta1.AnnotateVideoRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcVideoIntelligenceServiceStub this]
    (-> this (.annotateVideoCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcVideoIntelligenceServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcVideoIntelligenceServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcVideoIntelligenceServiceStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcVideoIntelligenceServiceStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcVideoIntelligenceServiceStub this]
    (-> this (.isTerminated))))

(defn annotate-video-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.videointelligence.v1p1beta1.AnnotateVideoRequest,com.google.cloud.videointelligence.v1p1beta1.AnnotateVideoResponse,com.google.cloud.videointelligence.v1p1beta1.AnnotateVideoProgress>`"
  ([^GrpcVideoIntelligenceServiceStub this]
    (-> this (.annotateVideoOperationCallable))))

(defn shutdown-now
  ""
  ([^GrpcVideoIntelligenceServiceStub this]
    (-> this (.shutdownNow))))

