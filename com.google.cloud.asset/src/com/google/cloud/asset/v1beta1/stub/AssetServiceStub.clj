(ns com.google.cloud.asset.v1beta1.stub.AssetServiceStub
  "Base stub class for Cloud Asset API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.asset.v1beta1.stub AssetServiceStub]))

(defn ->asset-service-stub
  "Constructor."
  (^AssetServiceStub []
    (new AssetServiceStub )))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.OperationsStub`"
  ([^AssetServiceStub this]
    (-> this (.getOperationsStub))))

(defn export-assets-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.asset.v1beta1.ExportAssetsRequest,com.google.cloud.asset.v1beta1.ExportAssetsResponse,com.google.cloud.asset.v1beta1.ExportAssetsRequest>`"
  ([^AssetServiceStub this]
    (-> this (.exportAssetsOperationCallable))))

(defn export-assets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.asset.v1beta1.ExportAssetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AssetServiceStub this]
    (-> this (.exportAssetsCallable))))

(defn batch-get-assets-history-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryRequest,com.google.cloud.asset.v1beta1.BatchGetAssetsHistoryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AssetServiceStub this]
    (-> this (.batchGetAssetsHistoryCallable))))

(defn close
  ""
  ([^AssetServiceStub this]
    (-> this (.close))))

