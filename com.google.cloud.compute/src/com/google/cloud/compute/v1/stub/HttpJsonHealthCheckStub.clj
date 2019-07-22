(ns com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonHealthCheckStub]))

(def *-delete-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHealthCheckStub/deleteHealthCheckMethodDescriptor)

(def *-get-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetHealthCheckHttpRequest,com.google.cloud.compute.v1.HealthCheck>"
  HttpJsonHealthCheckStub/getHealthCheckMethodDescriptor)

(def *-insert-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHealthCheckStub/insertHealthCheckMethodDescriptor)

(def *-list-health-checks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListHealthChecksHttpRequest,com.google.cloud.compute.v1.HealthCheckList>"
  HttpJsonHealthCheckStub/listHealthChecksMethodDescriptor)

(def *-patch-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHealthCheckStub/patchHealthCheckMethodDescriptor)

(def *-update-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHealthCheckStub/updateHealthCheckMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonHealthCheckStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonHealthCheckStub [^com.google.cloud.compute.v1.stub.HealthCheckStubSettings settings]
    (HttpJsonHealthCheckStub/create settings)))

(defn patch-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHealthCheckStub this]
    (-> this (.patchHealthCheckCallable))))

(defn list-health-checks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHealthChecksHttpRequest,com.google.cloud.compute.v1.HealthCheckList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHealthCheckStub this]
    (-> this (.listHealthChecksCallable))))

(defn insert-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHealthCheckStub this]
    (-> this (.insertHealthCheckCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonHealthCheckStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonHealthCheckStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonHealthCheckStub this]
    (-> this (.shutdown))))

(defn delete-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHealthCheckStub this]
    (-> this (.deleteHealthCheckCallable))))

(defn close
  ""
  ([^HttpJsonHealthCheckStub this]
    (-> this (.close))))

(defn get-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthCheckHttpRequest,com.google.cloud.compute.v1.HealthCheck>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHealthCheckStub this]
    (-> this (.getHealthCheckCallable))))

(defn update-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHealthCheckStub this]
    (-> this (.updateHealthCheckCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonHealthCheckStub this]
    (-> this (.isTerminated))))

(defn list-health-checks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHealthChecksHttpRequest,com.google.cloud.compute.v1.HealthCheckClient$ListHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHealthCheckStub this]
    (-> this (.listHealthChecksPagedCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonHealthCheckStub this]
    (-> this (.shutdownNow))))

