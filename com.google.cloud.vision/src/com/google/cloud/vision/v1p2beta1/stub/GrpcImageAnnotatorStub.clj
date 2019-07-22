(ns com.google.cloud.vision.v1p2beta1.stub.GrpcImageAnnotatorStub
  "gRPC stub implementation for Google Cloud Vision API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p2beta1.stub GrpcImageAnnotatorStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.vision.v1p2beta1.stub.GrpcImageAnnotatorStub`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p2beta1.stub.GrpcImageAnnotatorStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcImageAnnotatorStub/create client-context callable-factory))
  (^com.google.cloud.vision.v1p2beta1.stub.GrpcImageAnnotatorStub [^com.google.cloud.vision.v1p2beta1.stub.ImageAnnotatorStubSettings settings]
    (GrpcImageAnnotatorStub/create settings)))

(defn async-batch-annotate-files-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcImageAnnotatorStub this]
    (-> this (.asyncBatchAnnotateFilesCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcImageAnnotatorStub this]
    (-> this (.getOperationsStub))))

(defn async-batch-annotate-files-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesRequest,com.google.cloud.vision.v1p2beta1.AsyncBatchAnnotateFilesResponse,com.google.cloud.vision.v1p2beta1.OperationMetadata>`"
  ([^GrpcImageAnnotatorStub this]
    (-> this (.asyncBatchAnnotateFilesOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcImageAnnotatorStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcImageAnnotatorStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcImageAnnotatorStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcImageAnnotatorStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcImageAnnotatorStub this]
    (-> this (.isTerminated))))

(defn batch-annotate-images-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesRequest,com.google.cloud.vision.v1p2beta1.BatchAnnotateImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcImageAnnotatorStub this]
    (-> this (.batchAnnotateImagesCallable))))

(defn shutdown-now
  ""
  ([^GrpcImageAnnotatorStub this]
    (-> this (.shutdownNow))))

