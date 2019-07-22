(ns com.google.cloud.compute.v1.stub.HttpJsonGlobalOperationStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonGlobalOperationStub]))

(def *-aggregated-list-global-operations-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationAggregatedList>"
  HttpJsonGlobalOperationStub/aggregatedListGlobalOperationsMethodDescriptor)

(def *-delete-global-operation-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest,java.lang.Void>"
  HttpJsonGlobalOperationStub/deleteGlobalOperationMethodDescriptor)

(def *-get-global-operation-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetGlobalOperationHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonGlobalOperationStub/getGlobalOperationMethodDescriptor)

(def *-list-global-operations-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>"
  HttpJsonGlobalOperationStub/listGlobalOperationsMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonGlobalOperationStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonGlobalOperationStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonGlobalOperationStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonGlobalOperationStub [^com.google.cloud.compute.v1.stub.GlobalOperationStubSettings settings]
    (HttpJsonGlobalOperationStub/create settings)))

(defn get-global-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetGlobalOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalOperationStub this]
    (-> this (.getGlobalOperationCallable))))

(defn aggregated-list-global-operations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.GlobalOperationClient$AggregatedListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalOperationStub this]
    (-> this (.aggregatedListGlobalOperationsPagedCallable))))

(defn list-global-operations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.GlobalOperationClient$ListGlobalOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalOperationStub this]
    (-> this (.listGlobalOperationsPagedCallable))))

(defn aggregated-list-global-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalOperationStub this]
    (-> this (.aggregatedListGlobalOperationsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonGlobalOperationStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonGlobalOperationStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonGlobalOperationStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonGlobalOperationStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonGlobalOperationStub this]
    (-> this (.isTerminated))))

(defn delete-global-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteGlobalOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalOperationStub this]
    (-> this (.deleteGlobalOperationCallable))))

(defn list-global-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListGlobalOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonGlobalOperationStub this]
    (-> this (.listGlobalOperationsCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonGlobalOperationStub this]
    (-> this (.shutdownNow))))

