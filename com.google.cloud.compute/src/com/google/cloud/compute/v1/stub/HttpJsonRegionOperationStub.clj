(ns com.google.cloud.compute.v1.stub.HttpJsonRegionOperationStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonRegionOperationStub]))

(def *-delete-region-operation-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteRegionOperationHttpRequest,java.lang.Void>"
  HttpJsonRegionOperationStub/deleteRegionOperationMethodDescriptor)

(def *-get-region-operation-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetRegionOperationHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonRegionOperationStub/getRegionOperationMethodDescriptor)

(def *-list-region-operations-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>"
  HttpJsonRegionOperationStub/listRegionOperationsMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonRegionOperationStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionOperationStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonRegionOperationStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonRegionOperationStub [^com.google.cloud.compute.v1.stub.RegionOperationStubSettings settings]
    (HttpJsonRegionOperationStub/create settings)))

(defn list-region-operations-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.RegionOperationClient$ListRegionOperationsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionOperationStub this]
    (-> this (.listRegionOperationsPagedCallable))))

(defn delete-region-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionOperationHttpRequest,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionOperationStub this]
    (-> this (.deleteRegionOperationCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionOperationStub this]
    (-> this (.isShutdown))))

(defn get-region-operation-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionOperationHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionOperationStub this]
    (-> this (.getRegionOperationCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonRegionOperationStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonRegionOperationStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonRegionOperationStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonRegionOperationStub this]
    (-> this (.isTerminated))))

(defn list-region-operations-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionOperationsHttpRequest,com.google.cloud.compute.v1.OperationList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonRegionOperationStub this]
    (-> this (.listRegionOperationsCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonRegionOperationStub this]
    (-> this (.shutdownNow))))

