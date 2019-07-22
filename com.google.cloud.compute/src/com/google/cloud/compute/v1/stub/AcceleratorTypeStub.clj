(ns com.google.cloud.compute.v1.stub.AcceleratorTypeStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub AcceleratorTypeStub]))

(defn ->accelerator-type-stub
  "Constructor."
  (^AcceleratorTypeStub []
    (new AcceleratorTypeStub )))

(defn aggregated-list-accelerator-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeClient$AggregatedListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeStub this]
    (-> this (.aggregatedListAcceleratorTypesPagedCallable))))

(defn aggregated-list-accelerator-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeStub this]
    (-> this (.aggregatedListAcceleratorTypesCallable))))

(defn get-accelerator-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetAcceleratorTypeHttpRequest,com.google.cloud.compute.v1.AcceleratorType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeStub this]
    (-> this (.getAcceleratorTypeCallable))))

(defn list-accelerator-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeClient$ListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeStub this]
    (-> this (.listAcceleratorTypesPagedCallable))))

(defn list-accelerator-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AcceleratorTypeStub this]
    (-> this (.listAcceleratorTypesCallable))))

(defn close
  ""
  ([^AcceleratorTypeStub this]
    (-> this (.close))))

