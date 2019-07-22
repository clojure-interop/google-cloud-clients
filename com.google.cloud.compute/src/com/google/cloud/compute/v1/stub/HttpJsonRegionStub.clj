(ns com.google.cloud.compute.v1.stub.HttpJsonRegionStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionStub]))

(def *-get-region-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRegionHttpRequest,com.google.cloud.compute.v1.Region>"
  HttpJsonRegionStub/getRegionMethodDescriptor)

(def *-list-regions-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionList>"
  HttpJsonRegionStub/listRegionsMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRegionStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRegionStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionStub [^com.google.cloud.compute.v1.stub.RegionStubSettings settings]
    (HttpJsonRegionStub/create settings)))

(defn list-regions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionStub this]
    (-> this (.listRegionsCallable))))

(defn get-region-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionHttpRequest,com.google.cloud.compute.v1.Region>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionStub this]
    (-> this (.getRegionCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRegionStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonRegionStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonRegionStub this]
    (-> this (.close))))

(defn list-regions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionsHttpRequest,com.google.cloud.compute.v1.RegionClient$ListRegionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionStub this]
    (-> this (.listRegionsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonRegionStub this]
    (-> this (.shutdownNow))))

