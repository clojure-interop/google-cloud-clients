(ns com.google.cloud.compute.v1.stub.HttpJsonZoneStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonZoneStub]))

(def *-get-zone-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetZoneHttpRequest,com.google.cloud.compute.v1.Zone>"
  HttpJsonZoneStub/getZoneMethodDescriptor)

(def *-list-zones-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneList>"
  HttpJsonZoneStub/listZonesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonZoneStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonZoneStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonZoneStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonZoneStub [^com.google.cloud.compute.v1.stub.ZoneStubSettings settings]
    (HttpJsonZoneStub/create settings)))

(defn list-zones-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonZoneStub this]
    (-> this (.listZonesCallable))))

(defn get-zone-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetZoneHttpRequest,com.google.cloud.compute.v1.Zone>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonZoneStub this]
    (-> this (.getZoneCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonZoneStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonZoneStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonZoneStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonZoneStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonZoneStub this]
    (-> this (.isTerminated))))

(defn list-zones-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZonesHttpRequest,com.google.cloud.compute.v1.ZoneClient$ListZonesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonZoneStub this]
    (-> this (.listZonesPagedCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonZoneStub this]
    (-> this (.shutdownNow))))

