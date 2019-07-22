(ns com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonHttpsHealthCheckStub]))

(def *-delete-https-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHttpsHealthCheckStub/deleteHttpsHealthCheckMethodDescriptor)

(def *-get-https-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheck2>"
  HttpJsonHttpsHealthCheckStub/getHttpsHealthCheckMethodDescriptor)

(def *-insert-https-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHttpsHealthCheckStub/insertHttpsHealthCheckMethodDescriptor)

(def *-list-https-health-checks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckList>"
  HttpJsonHttpsHealthCheckStub/listHttpsHealthChecksMethodDescriptor)

(def *-patch-https-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHttpsHealthCheckStub/patchHttpsHealthCheckMethodDescriptor)

(def *-update-https-health-check-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonHttpsHealthCheckStub/updateHttpsHealthCheckMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonHttpsHealthCheckStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonHttpsHealthCheckStub [^com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings settings]
    (HttpJsonHttpsHealthCheckStub/create settings)))

(defn patch-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpsHealthCheckStub this]
    (-> this (.patchHttpsHealthCheckCallable))))

(defn get-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpsHealthCheckStub this]
    (-> this (.getHttpsHealthCheckCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonHttpsHealthCheckStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonHttpsHealthCheckStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonHttpsHealthCheckStub this]
    (-> this (.shutdown))))

(defn delete-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpsHealthCheckStub this]
    (-> this (.deleteHttpsHealthCheckCallable))))

(defn list-https-health-checks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpsHealthCheckStub this]
    (-> this (.listHttpsHealthChecksCallable))))

(defn update-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpsHealthCheckStub this]
    (-> this (.updateHttpsHealthCheckCallable))))

(defn close
  ""
  ([^HttpJsonHttpsHealthCheckStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonHttpsHealthCheckStub this]
    (-> this (.isTerminated))))

(defn list-https-health-checks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckClient$ListHttpsHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpsHealthCheckStub this]
    (-> this (.listHttpsHealthChecksPagedCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonHttpsHealthCheckStub this]
    (-> this (.shutdownNow))))

(defn insert-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonHttpsHealthCheckStub this]
    (-> this (.insertHttpsHealthCheckCallable))))

