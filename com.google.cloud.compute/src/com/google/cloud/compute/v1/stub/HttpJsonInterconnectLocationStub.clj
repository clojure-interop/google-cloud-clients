(ns com.google.cloud.compute.v1.stub.HttpJsonInterconnectLocationStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonInterconnectLocationStub]))

(def *-get-interconnect-location-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetInterconnectLocationHttpRequest,com.google.cloud.compute.v1.InterconnectLocation>"
  HttpJsonInterconnectLocationStub/getInterconnectLocationMethodDescriptor)

(def *-list-interconnect-locations-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationList>"
  HttpJsonInterconnectLocationStub/listInterconnectLocationsMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonInterconnectLocationStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonInterconnectLocationStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonInterconnectLocationStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonInterconnectLocationStub [^com.google.cloud.compute.v1.stub.InterconnectLocationStubSettings settings]
    (HttpJsonInterconnectLocationStub/create settings)))

(defn list-interconnect-locations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationClient$ListInterconnectLocationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectLocationStub this]
    (-> this (.listInterconnectLocationsPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInterconnectLocationStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonInterconnectLocationStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonInterconnectLocationStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonInterconnectLocationStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonInterconnectLocationStub this]
    (-> this (.isTerminated))))

(defn list-interconnect-locations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectLocationsHttpRequest,com.google.cloud.compute.v1.InterconnectLocationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectLocationStub this]
    (-> this (.listInterconnectLocationsCallable))))

(defn get-interconnect-location-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInterconnectLocationHttpRequest,com.google.cloud.compute.v1.InterconnectLocation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonInterconnectLocationStub this]
    (-> this (.getInterconnectLocationCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonInterconnectLocationStub this]
    (-> this (.shutdownNow))))

