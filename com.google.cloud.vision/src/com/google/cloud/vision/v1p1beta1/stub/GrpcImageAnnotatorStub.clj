(ns com.google.cloud.vision.v1p1beta1.stub.GrpcImageAnnotatorStub
  "gRPC stub implementation for Google Cloud Vision API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p1beta1.stub GrpcImageAnnotatorStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.vision.v1p1beta1.stub.GrpcImageAnnotatorStub`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p1beta1.stub.GrpcImageAnnotatorStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcImageAnnotatorStub/create client-context callable-factory))
  (^com.google.cloud.vision.v1p1beta1.stub.GrpcImageAnnotatorStub [^com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStubSettings settings]
    (GrpcImageAnnotatorStub/create settings)))

(defn batch-annotate-images-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p1beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcImageAnnotatorStub this]
    (-> this (.batchAnnotateImagesCallable))))

(defn close
  ""
  ([^GrpcImageAnnotatorStub this]
    (-> this (.close))))

(defn shutdown
  ""
  ([^GrpcImageAnnotatorStub this]
    (-> this (.shutdown))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcImageAnnotatorStub this]
    (-> this (.isShutdown))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcImageAnnotatorStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcImageAnnotatorStub this]
    (-> this (.shutdownNow))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcImageAnnotatorStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

