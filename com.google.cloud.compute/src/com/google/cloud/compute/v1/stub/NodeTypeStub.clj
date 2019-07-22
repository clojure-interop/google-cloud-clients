(ns com.google.cloud.compute.v1.stub.NodeTypeStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub NodeTypeStub]))

(defn ->node-type-stub
  "Constructor."
  (^NodeTypeStub []
    (new NodeTypeStub )))

(defn aggregated-list-node-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeClient$AggregatedListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeStub this]
    (-> this (.aggregatedListNodeTypesPagedCallable))))

(defn aggregated-list-node-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeStub this]
    (-> this (.aggregatedListNodeTypesCallable))))

(defn get-node-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetNodeTypeHttpRequest,com.google.cloud.compute.v1.NodeType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeStub this]
    (-> this (.getNodeTypeCallable))))

(defn list-node-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeClient$ListNodeTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeStub this]
    (-> this (.listNodeTypesPagedCallable))))

(defn list-node-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListNodeTypesHttpRequest,com.google.cloud.compute.v1.NodeTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NodeTypeStub this]
    (-> this (.listNodeTypesCallable))))

(defn close
  ""
  ([^NodeTypeStub this]
    (-> this (.close))))

