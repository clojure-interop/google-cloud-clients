(ns com.google.cloud.compute.v1.stub.GlobalOperationStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub GlobalOperationStub]))

(defn ->global-operation-stub
  "Constructor."
  (^GlobalOperationStub []
    (new GlobalOperationStub )))

(defn aggregated-list-global-operations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.GlobalOperationClient$AggregatedListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationStub this]
    (-> this (.aggregatedListGlobalOperationsPagedCallable))))

(defn aggregated-list-global-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationStub this]
    (-> this (.aggregatedListGlobalOperationsCallable))))

(defn delete-global-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationStub this]
    (-> this (.deleteGlobalOperationCallable))))

(defn get-global-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetGlobalOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationStub this]
    (-> this (.getGlobalOperationCallable))))

(defn list-global-operations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.GlobalOperationClient$ListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationStub this]
    (-> this (.listGlobalOperationsPagedCallable))))

(defn list-global-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GlobalOperationStub this]
    (-> this (.listGlobalOperationsCallable))))

(defn close
  ""
  ([^GlobalOperationStub this]
    (-> this (.close))))

