(ns com.google.cloud.compute.v1.stub.HttpJsonZoneOperationStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonZoneOperationStub]))

(def *-delete-zone-operation-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest,java.lang.Void>"
  HttpJsonZoneOperationStub/deleteZoneOperationMethodDescriptor)

(def *-get-zone-operation-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetZoneOperationHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonZoneOperationStub/getZoneOperationMethodDescriptor)

(def *-list-zone-operations-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>"
  HttpJsonZoneOperationStub/listZoneOperationsMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonZoneOperationStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonZoneOperationStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonZoneOperationStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonZoneOperationStub [^com.google.cloud.compute.v1.stub.ZoneOperationStubSettings settings]
    (HttpJsonZoneOperationStub/create settings)))

(defn list-zone-operations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.ZoneOperationClient$ListZoneOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonZoneOperationStub this]
    (-> this (.listZoneOperationsPagedCallable))))

(defn get-zone-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetZoneOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonZoneOperationStub this]
    (-> this (.getZoneOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonZoneOperationStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonZoneOperationStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonZoneOperationStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonZoneOperationStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonZoneOperationStub this]
    (-> this (.isTerminated))))

(defn delete-zone-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonZoneOperationStub this]
    (-> this (.deleteZoneOperationCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonZoneOperationStub this]
    (-> this (.shutdownNow))))

(defn list-zone-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListZoneOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonZoneOperationStub this]
    (-> this (.listZoneOperationsCallable))))

