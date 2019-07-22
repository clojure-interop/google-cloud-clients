(ns com.google.cloud.compute.v1.stub.HttpsHealthCheckStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpsHealthCheckStub]))

(defn ->https-health-check-stub
  "Constructor."
  (^HttpsHealthCheckStub []
    (new HttpsHealthCheckStub )))

(defn delete-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckStub this]
    (-> this (.deleteHttpsHealthCheckCallable))))

(defn get-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckStub this]
    (-> this (.getHttpsHealthCheckCallable))))

(defn insert-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckStub this]
    (-> this (.insertHttpsHealthCheckCallable))))

(defn list-https-health-checks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckClient$ListHttpsHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckStub this]
    (-> this (.listHttpsHealthChecksPagedCallable))))

(defn list-https-health-checks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckStub this]
    (-> this (.listHttpsHealthChecksCallable))))

(defn patch-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckStub this]
    (-> this (.patchHttpsHealthCheckCallable))))

(defn update-https-health-check-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpsHealthCheckStub this]
    (-> this (.updateHttpsHealthCheckCallable))))

(defn close
  ""
  ([^HttpsHealthCheckStub this]
    (-> this (.close))))

