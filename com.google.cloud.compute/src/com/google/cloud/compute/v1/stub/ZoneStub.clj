(ns com.google.cloud.compute.v1.stub.ZoneStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ZoneStub]))

(defn ->zone-stub
  "Constructor."
  (^ZoneStub []
    (new ZoneStub )))

(defn get-zone-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetZoneHttpRequest,com.google.cloud.compute.v1.Zone>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneStub this]
    (-> this (.getZoneCallable))))

(defn list-zones-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneClient$ListZonesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneStub this]
    (-> this (.listZonesPagedCallable))))

(defn list-zones-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ZoneStub this]
    (-> this (.listZonesCallable))))

(defn close
  ""
  ([^ZoneStub this]
    (-> this (.close))))

