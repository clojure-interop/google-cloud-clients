(ns com.google.cloud.compute.v1.stub.InterconnectLocationStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InterconnectLocationStub]))

(defn ->interconnect-location-stub
  "Constructor."
  (^InterconnectLocationStub []
    (new InterconnectLocationStub )))

(defn get-interconnect-location-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInterconnectLocationHttpRequest,com.google.cloud.compute.v1.InterconnectLocation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectLocationStub this]
    (-> this (.getInterconnectLocationCallable))))

(defn list-interconnect-locations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationClient$ListInterconnectLocationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectLocationStub this]
    (-> this (.listInterconnectLocationsPagedCallable))))

(defn list-interconnect-locations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectLocationStub this]
    (-> this (.listInterconnectLocationsCallable))))

(defn close
  ""
  ([^InterconnectLocationStub this]
    (-> this (.close))))

