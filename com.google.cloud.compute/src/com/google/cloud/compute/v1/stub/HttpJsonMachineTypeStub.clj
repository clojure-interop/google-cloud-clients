(ns com.google.cloud.compute.v1.stub.HttpJsonMachineTypeStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonMachineTypeStub]))

(def *-aggregated-list-machine-types-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeAggregatedList>"
  HttpJsonMachineTypeStub/aggregatedListMachineTypesMethodDescriptor)

(def *-get-machine-type-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetMachineTypeHttpRequest,com.google.cloud.compute.v1.MachineType>"
  HttpJsonMachineTypeStub/getMachineTypeMethodDescriptor)

(def *-list-machine-types-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeList>"
  HttpJsonMachineTypeStub/listMachineTypesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonMachineTypeStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonMachineTypeStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonMachineTypeStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonMachineTypeStub [^com.google.cloud.compute.v1.stub.MachineTypeStubSettings settings]
    (HttpJsonMachineTypeStub/create settings)))

(defn aggregated-list-machine-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonMachineTypeStub this]
    (-> this (.aggregatedListMachineTypesCallable))))

(defn aggregated-list-machine-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeClient$AggregatedListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonMachineTypeStub this]
    (-> this (.aggregatedListMachineTypesPagedCallable))))

(defn list-machine-types-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeClient$ListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonMachineTypeStub this]
    (-> this (.listMachineTypesPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonMachineTypeStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonMachineTypeStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn get-machine-type-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetMachineTypeHttpRequest,com.google.cloud.compute.v1.MachineType>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonMachineTypeStub this]
    (-> this (.getMachineTypeCallable))))

(defn shutdown
  ""
  ([^HttpJsonMachineTypeStub this]
    (-> this (.shutdown))))

(defn list-machine-types-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonMachineTypeStub this]
    (-> this (.listMachineTypesCallable))))

(defn close
  ""
  ([^HttpJsonMachineTypeStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonMachineTypeStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonMachineTypeStub this]
    (-> this (.shutdownNow))))

