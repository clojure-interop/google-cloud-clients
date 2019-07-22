(ns com.google.cloud.compute.v1.stub.HttpJsonAcceleratorTypeStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonAcceleratorTypeStub]))

(def *-aggregated-list-accelerator-types-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeAggregatedList>"
  HttpJsonAcceleratorTypeStub/aggregatedListAcceleratorTypesMethodDescriptor)

(def *-get-accelerator-type-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetAcceleratorTypeHttpRequest,com.google.cloud.compute.v1.AcceleratorType>"
  HttpJsonAcceleratorTypeStub/getAcceleratorTypeMethodDescriptor)

(def *-list-accelerator-types-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeList>"
  HttpJsonAcceleratorTypeStub/listAcceleratorTypesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonAcceleratorTypeStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonAcceleratorTypeStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonAcceleratorTypeStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonAcceleratorTypeStub [^com.google.cloud.compute.v1.stub.AcceleratorTypeStubSettings settings]
    (HttpJsonAcceleratorTypeStub/create settings)))

(defn aggregated-list-accelerator-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeClient$AggregatedListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAcceleratorTypeStub this]
    (-> this (.aggregatedListAcceleratorTypesPagedCallable))))

(defn get-accelerator-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetAcceleratorTypeHttpRequest,com.google.cloud.compute.v1.AcceleratorType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAcceleratorTypeStub this]
    (-> this (.getAcceleratorTypeCallable))))

(defn aggregated-list-accelerator-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAcceleratorTypeStub this]
    (-> this (.aggregatedListAcceleratorTypesCallable))))

(defn list-accelerator-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAcceleratorTypeStub this]
    (-> this (.listAcceleratorTypesCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonAcceleratorTypeStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonAcceleratorTypeStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonAcceleratorTypeStub this]
    (-> this (.shutdown))))

(defn list-accelerator-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAcceleratorTypesHttpRequest,com.google.cloud.compute.v1.AcceleratorTypeClient$ListAcceleratorTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonAcceleratorTypeStub this]
    (-> this (.listAcceleratorTypesPagedCallable))))

(defn close
  ""
  ([^HttpJsonAcceleratorTypeStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonAcceleratorTypeStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonAcceleratorTypeStub this]
    (-> this (.shutdownNow))))

