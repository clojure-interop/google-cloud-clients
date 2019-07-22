(ns com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonHttpHealthCheckStub]))

(def *-delete-http-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHttpHealthCheckStub/deleteHttpHealthCheckMethodDescriptor)

(def *-get-http-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpHealthCheck2>"
  HttpJsonHttpHealthCheckStub/getHttpHealthCheckMethodDescriptor)

(def *-insert-http-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHttpHealthCheckStub/insertHttpHealthCheckMethodDescriptor)

(def *-list-http-health-checks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpHealthCheckList>"
  HttpJsonHttpHealthCheckStub/listHttpHealthChecksMethodDescriptor)

(def *-patch-http-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHttpHealthCheckStub/patchHttpHealthCheckMethodDescriptor)

(def *-update-http-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHttpHealthCheckStub/updateHttpHealthCheckMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonHttpHealthCheckStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonHttpHealthCheckStub [^com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings settings]
    (HttpJsonHttpHealthCheckStub/create settings)))

(defn list-http-health-checks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpHealthCheckList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpHealthCheckStub this]
    (-> this (.listHttpHealthChecksCallable))))

(defn patch-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpHealthCheckStub this]
    (-> this (.patchHttpHealthCheckCallable))))

(defn delete-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpHealthCheckStub this]
    (-> this (.deleteHttpHealthCheckCallable))))

(defn get-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpHealthCheckStub this]
    (-> this (.getHttpHealthCheckCallable))))

(defn insert-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpHealthCheckStub this]
    (-> this (.insertHttpHealthCheckCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonHttpHealthCheckStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonHttpHealthCheckStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonHttpHealthCheckStub this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^HttpJsonHttpHealthCheckStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonHttpHealthCheckStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonHttpHealthCheckStub this]
    (-> this (.shutdownNow))))

(defn update-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpHealthCheckStub this]
    (-> this (.updateHttpHealthCheckCallable))))

(defn list-http-health-checks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpHealthCheckClient$ListHttpHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpHealthCheckStub this]
    (-> this (.listHttpHealthChecksPagedCallable))))

