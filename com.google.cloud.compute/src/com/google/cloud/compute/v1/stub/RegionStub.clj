(ns com.google.cloud.compute.v1.stub.RegionStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionStub]))

(defn ->region-stub
  "Constructor."
  (^RegionStub []
    (new RegionStub )))

(defn get-region-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionHttpRequest,com.google.cloud.compute.v1.Region>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionStub this]
    (-> this (.getRegionCallable))))

(defn list-regions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionClient$ListRegionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionStub this]
    (-> this (.listRegionsPagedCallable))))

(defn list-regions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionStub this]
    (-> this (.listRegionsCallable))))

(defn close
  ""
  ([^RegionStub this]
    (-> this (.close))))

