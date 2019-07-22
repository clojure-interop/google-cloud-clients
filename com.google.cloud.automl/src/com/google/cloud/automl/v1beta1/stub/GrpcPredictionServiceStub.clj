(ns com.google.cloud.automl.v1beta1.stub.GrpcPredictionServiceStub
  "gRPC stub implementation for Cloud AutoML API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.automl.v1beta1.stub GrpcPredictionServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.automl.v1beta1.stub.GrpcPredictionServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.automl.v1beta1.stub.GrpcPredictionServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcPredictionServiceStub/create client-context callable-factory))
  (^com.google.cloud.automl.v1beta1.stub.GrpcPredictionServiceStub [^com.google.cloud.automl.v1beta1.stub.PredictionServiceStubSettings settings]
    (GrpcPredictionServiceStub/create settings)))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcPredictionServiceStub this]
    (-> this (.getOperationsStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcPredictionServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcPredictionServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcPredictionServiceStub this]
    (-> this (.shutdown))))

(defn batch-predict-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPredictionServiceStub this]
    (-> this (.batchPredictCallable))))

(defn close
  ""
  ([^GrpcPredictionServiceStub this]
    (-> this (.close))))

(defn predict-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.automl.v1beta1.PredictRequest,com.google.cloud.automl.v1beta1.PredictResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPredictionServiceStub this]
    (-> this (.predictCallable))))

(defn batch-predict-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.automl.v1beta1.BatchPredictRequest,com.google.cloud.automl.v1beta1.BatchPredictResult,com.google.cloud.automl.v1beta1.OperationMetadata>`"
  ([^GrpcPredictionServiceStub this]
    (-> this (.batchPredictOperationCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcPredictionServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcPredictionServiceStub this]
    (-> this (.shutdownNow))))

