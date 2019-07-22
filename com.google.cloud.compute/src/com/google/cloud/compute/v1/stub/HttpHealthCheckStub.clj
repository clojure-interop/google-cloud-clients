(ns com.google.cloud.compute.v1.stub.HttpHealthCheckStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpHealthCheckStub]))

(defn ->http-health-check-stub
  "Constructor."
  (^HttpHealthCheckStub []
    (new HttpHealthCheckStub )))

(defn delete-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckStub this]
    (-> this (.deleteHttpHealthCheckCallable))))

(defn get-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckStub this]
    (-> this (.getHttpHealthCheckCallable))))

(defn insert-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckStub this]
    (-> this (.insertHttpHealthCheckCallable))))

(defn list-http-health-checks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpHealthCheckClient$ListHttpHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckStub this]
    (-> this (.listHttpHealthChecksPagedCallable))))

(defn list-http-health-checks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpHealthCheckList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckStub this]
    (-> this (.listHttpHealthChecksCallable))))

(defn patch-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckStub this]
    (-> this (.patchHttpHealthCheckCallable))))

(defn update-http-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpHealthCheckStub this]
    (-> this (.updateHttpHealthCheckCallable))))

(defn close
  ""
  ([^HttpHealthCheckStub this]
    (-> this (.close))))

