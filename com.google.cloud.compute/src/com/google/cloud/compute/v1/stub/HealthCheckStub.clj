(ns com.google.cloud.compute.v1.stub.HealthCheckStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HealthCheckStub]))

(defn ->health-check-stub
  "Constructor."
  (^HealthCheckStub []
    (new HealthCheckStub )))

(defn delete-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckStub this]
    (-> this (.deleteHealthCheckCallable))))

(defn get-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthCheckHttpRequest,com.google.cloud.compute.v1.HealthCheck>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckStub this]
    (-> this (.getHealthCheckCallable))))

(defn insert-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckStub this]
    (-> this (.insertHealthCheckCallable))))

(defn list-health-checks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHealthChecksHttpRequest,com.google.cloud.compute.v1.HealthCheckClient$ListHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckStub this]
    (-> this (.listHealthChecksPagedCallable))))

(defn list-health-checks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHealthChecksHttpRequest,com.google.cloud.compute.v1.HealthCheckList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckStub this]
    (-> this (.listHealthChecksCallable))))

(defn patch-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckStub this]
    (-> this (.patchHealthCheckCallable))))

(defn update-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HealthCheckStub this]
    (-> this (.updateHealthCheckCallable))))

(defn close
  ""
  ([^HealthCheckStub this]
    (-> this (.close))))

