(ns com.google.cloud.compute.v1.stub.HttpJsonDiskTypeStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonDiskTypeStub]))

(def *-aggregated-list-disk-types-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeAggregatedList>"
  HttpJsonDiskTypeStub/aggregatedListDiskTypesMethodDescriptor)

(def *-get-disk-type-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>"
  HttpJsonDiskTypeStub/getDiskTypeMethodDescriptor)

(def *-list-disk-types-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeList>"
  HttpJsonDiskTypeStub/listDiskTypesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonDiskTypeStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonDiskTypeStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonDiskTypeStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonDiskTypeStub [^com.google.cloud.compute.v1.stub.DiskTypeStubSettings settings]
    (HttpJsonDiskTypeStub/create settings)))

(defn list-disk-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeClient$ListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskTypeStub this]
    (-> this (.listDiskTypesPagedCallable))))

(defn get-disk-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetDiskTypeHttpRequest,com.google.cloud.compute.v1.DiskType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskTypeStub this]
    (-> this (.getDiskTypeCallable))))

(defn aggregated-list-disk-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskTypeStub this]
    (-> this (.aggregatedListDiskTypesCallable))))

(defn aggregated-list-disk-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeClient$AggregatedListDiskTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskTypeStub this]
    (-> this (.aggregatedListDiskTypesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonDiskTypeStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonDiskTypeStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonDiskTypeStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonDiskTypeStub this]
    (-> this (.close))))

(defn list-disk-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListDiskTypesHttpRequest,com.google.cloud.compute.v1.DiskTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonDiskTypeStub this]
    (-> this (.listDiskTypesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonDiskTypeStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonDiskTypeStub this]
    (-> this (.shutdownNow))))

