(ns com.google.cloud.compute.v1.stub.HttpJsonRegionDiskTypeStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionDiskTypeStub]))

(def *-get-region-disk-type-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>"
  HttpJsonRegionDiskTypeStub/getRegionDiskTypeMethodDescriptor)

(def *-list-region-disk-types-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeList>"
  HttpJsonRegionDiskTypeStub/listRegionDiskTypesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRegionDiskTypeStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionDiskTypeStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRegionDiskTypeStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionDiskTypeStub [^com.google.cloud.compute.v1.stub.RegionDiskTypeStubSettings settings]
    (HttpJsonRegionDiskTypeStub/create settings)))

(defn get-region-disk-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskTypeStub this]
    (-> this (.getRegionDiskTypeCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionDiskTypeStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRegionDiskTypeStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonRegionDiskTypeStub this]
    (-> this (.shutdown))))

(defn list-region-disk-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeClient$ListRegionDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskTypeStub this]
    (-> this (.listRegionDiskTypesPagedCallable))))

(defn close
  ""
  ([^HttpJsonRegionDiskTypeStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionDiskTypeStub this]
    (-> this (.isTerminated))))

(defn list-region-disk-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionDiskTypesHttpRequest,com.google.cloud.compute.v1.RegionDiskTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionDiskTypeStub this]
    (-> this (.listRegionDiskTypesCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonRegionDiskTypeStub this]
    (-> this (.shutdownNow))))

