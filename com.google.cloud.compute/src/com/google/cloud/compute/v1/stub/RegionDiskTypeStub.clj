(ns com.google.cloud.compute.v1.stub.RegionDiskTypeStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionDiskTypeStub]))

(defn ->region-disk-type-stub
  "Constructor."
  (^RegionDiskTypeStub []
    (new RegionDiskTypeStub )))

(defn get-region-disk-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskTypeStub this]
    (-> this (.getRegionDiskTypeCallable))))

(defn list-region-disk-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeClient$ListRegionDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskTypeStub this]
    (-> this (.listRegionDiskTypesPagedCallable))))

(defn list-region-disk-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionDiskTypeStub this]
    (-> this (.listRegionDiskTypesCallable))))

(defn close
  ""
  ([^RegionDiskTypeStub this]
    (-> this (.close))))

