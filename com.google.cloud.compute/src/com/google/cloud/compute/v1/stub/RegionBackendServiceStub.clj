(ns com.google.cloud.compute.v1.stub.RegionBackendServiceStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionBackendServiceStub]))

(defn ->region-backend-service-stub
  "Constructor."
  (^RegionBackendServiceStub []
    (new RegionBackendServiceStub )))

(defn list-region-backend-services-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceStub this]
    (-> this (.listRegionBackendServicesCallable))))

(defn patch-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceStub this]
    (-> this (.patchRegionBackendServiceCallable))))

(defn get-health-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetHealthRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceStub this]
    (-> this (.getHealthRegionBackendServiceCallable))))

(defn list-region-backend-services-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionBackendServicesHttpRequest,com.google.cloud.compute.v1.RegionBackendServiceClient$ListRegionBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceStub this]
    (-> this (.listRegionBackendServicesPagedCallable))))

(defn close
  ""
  ([^RegionBackendServiceStub this]
    (-> this (.close))))

(defn update-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceStub this]
    (-> this (.updateRegionBackendServiceCallable))))

(defn insert-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceStub this]
    (-> this (.insertRegionBackendServiceCallable))))

(defn get-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceStub this]
    (-> this (.getRegionBackendServiceCallable))))

(defn delete-region-backend-service-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionBackendServiceStub this]
    (-> this (.deleteRegionBackendServiceCallable))))

