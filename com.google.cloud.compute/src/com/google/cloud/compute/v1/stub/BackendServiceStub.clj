(ns com.google.cloud.compute.v1.stub.BackendServiceStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub BackendServiceStub]))

(defn ->backend-service-stub
  "Constructor."
  (^BackendServiceStub []
    (new BackendServiceStub )))

(defn list-backend-services-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceClient$ListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.listBackendServicesPagedCallable))))

(defn add-signed-url-key-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.addSignedUrlKeyBackendServiceCallable))))

(defn insert-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.insertBackendServiceCallable))))

(defn delete-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.deleteBackendServiceCallable))))

(defn update-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.updateBackendServiceCallable))))

(defn aggregated-list-backend-services-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.aggregatedListBackendServicesCallable))))

(defn patch-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.patchBackendServiceCallable))))

(defn list-backend-services-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.listBackendServicesCallable))))

(defn get-health-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.getHealthBackendServiceCallable))))

(defn aggregated-list-backend-services-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceClient$AggregatedListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.aggregatedListBackendServicesPagedCallable))))

(defn close
  ""
  ([^BackendServiceStub this]
    (-> this (.close))))

(defn delete-signed-url-key-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.deleteSignedUrlKeyBackendServiceCallable))))

(defn set-security-policy-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSecurityPolicyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.setSecurityPolicyBackendServiceCallable))))

(defn get-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BackendServiceStub this]
    (-> this (.getBackendServiceCallable))))

