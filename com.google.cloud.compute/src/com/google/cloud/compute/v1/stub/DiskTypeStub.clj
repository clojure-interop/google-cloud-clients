(ns com.google.cloud.compute.v1.stub.DiskTypeStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub DiskTypeStub]))

(defn ->disk-type-stub
  "Constructor."
  (^DiskTypeStub []
    (new DiskTypeStub )))

(defn aggregated-list-disk-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeClient$AggregatedListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeStub this]
    (-> this (.aggregatedListDiskTypesPagedCallable))))

(defn aggregated-list-disk-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeStub this]
    (-> this (.aggregatedListDiskTypesCallable))))

(defn get-disk-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeStub this]
    (-> this (.getDiskTypeCallable))))

(defn list-disk-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeClient$ListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeStub this]
    (-> this (.listDiskTypesPagedCallable))))

(defn list-disk-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DiskTypeStub this]
    (-> this (.listDiskTypesCallable))))

(defn close
  ""
  ([^DiskTypeStub this]
    (-> this (.close))))

