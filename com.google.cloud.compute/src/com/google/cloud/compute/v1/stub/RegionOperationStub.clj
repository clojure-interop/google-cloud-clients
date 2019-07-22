(ns com.google.cloud.compute.v1.stub.RegionOperationStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionOperationStub]))

(defn ->region-operation-stub
  "Constructor."
  (^RegionOperationStub []
    (new RegionOperationStub )))

(defn delete-region-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionOperationStub this]
    (-> this (.deleteRegionOperationCallable))))

(defn get-region-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionOperationStub this]
    (-> this (.getRegionOperationCallable))))

(defn list-region-operations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionOperationStub this]
    (-> this (.listRegionOperationsPagedCallable))))

(defn list-region-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionOperationStub this]
    (-> this (.listRegionOperationsCallable))))

(defn close
  ""
  ([^RegionOperationStub this]
    (-> this (.close))))

