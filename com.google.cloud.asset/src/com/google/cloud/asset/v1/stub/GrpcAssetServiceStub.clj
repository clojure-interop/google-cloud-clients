(ns com.google.cloud.asset.v1.stub.GrpcAssetServiceStub
  "gRPC stub implementation for Cloud Asset API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.asset.v1.stub GrpcAssetServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.asset.v1.stub.GrpcAssetServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.asset.v1.stub.GrpcAssetServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcAssetServiceStub/create client-context callable-factory))
  (^com.google.cloud.asset.v1.stub.GrpcAssetServiceStub [^com.google.cloud.asset.v1.stub.AssetServiceStubSettings settings]
    (GrpcAssetServiceStub/create settings)))

(defn batch-get-assets-history-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.asset.v1.BatchGetAssetsHistoryRequest,com.google.cloud.asset.v1.BatchGetAssetsHistoryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAssetServiceStub this]
    (-> this (.batchGetAssetsHistoryCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcAssetServiceStub this]
    (-> this (.getOperationsStub))))

(defn export-assets-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.asset.v1.ExportAssetsRequest,com.google.cloud.asset.v1.ExportAssetsResponse,com.google.cloud.asset.v1.ExportAssetsRequest>`"
  ([^GrpcAssetServiceStub this]
    (-> this (.exportAssetsOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcAssetServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcAssetServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcAssetServiceStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^GrpcAssetServiceStub this]
    (-> this (.close))))

(defn export-assets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.asset.v1.ExportAssetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcAssetServiceStub this]
    (-> this (.exportAssetsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcAssetServiceStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^GrpcAssetServiceStub this]
    (-> this (.shutdownNow))))

