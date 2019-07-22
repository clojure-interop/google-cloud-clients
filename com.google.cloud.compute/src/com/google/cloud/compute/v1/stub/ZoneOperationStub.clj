(ns com.google.cloud.compute.v1.stub.ZoneOperationStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ZoneOperationStub]))

(defn ->zone-operation-stub
  "Constructor."
  (^ZoneOperationStub []
    (new ZoneOperationStub )))

(defn delete-zone-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneOperationStub this]
    (-> this (.deleteZoneOperationCallable))))

(defn get-zone-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetZoneOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneOperationStub this]
    (-> this (.getZoneOperationCallable))))

(defn list-zone-operations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneOperationStub this]
    (-> this (.listZoneOperationsPagedCallable))))

(defn list-zone-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneOperationStub this]
    (-> this (.listZoneOperationsCallable))))

(defn close
  ""
  ([^ZoneOperationStub this]
    (-> this (.close))))

