(ns com.google.cloud.compute.v1.RegionBackendServiceSettings$Builder
  "Builder for RegionBackendServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionBackendServiceSettings$Builder]))

(defn get-health-region-backend-service-settings
  "Returns the builder for the settings used for calls to getHealthRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetHealthRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionBackendServiceSettings$Builder this]
    (-> this (.getHealthRegionBackendServiceSettings))))

(defn delete-region-backend-service-settings
  "Returns the builder for the settings used for calls to deleteRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionBackendServiceSettings$Builder this]
    (-> this (.deleteRegionBackendServiceSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.RegionBackendServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.RegionBackendServiceSettings$Builder [^RegionBackendServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn list-region-backend-services-settings
  "Returns the builder for the settings used for calls to listRegionBackendServices.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListRegionBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList,com.google.cloud.compute.v1.RegionBackendServiceClient$ListRegionBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^RegionBackendServiceSettings$Builder this]
    (-> this (.listRegionBackendServicesSettings))))

(defn get-region-backend-service-settings
  "Returns the builder for the settings used for calls to getRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionBackendServiceSettings$Builder this]
    (-> this (.getRegionBackendServiceSettings))))

(defn update-region-backend-service-settings
  "Returns the builder for the settings used for calls to updateRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionBackendServiceSettings$Builder this]
    (-> this (.updateRegionBackendServiceSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.RegionBackendServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionBackendServiceSettings [^RegionBackendServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionBackendServiceStubSettings$Builder [^RegionBackendServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn insert-region-backend-service-settings
  "Returns the builder for the settings used for calls to insertRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionBackendServiceSettings$Builder this]
    (-> this (.insertRegionBackendServiceSettings))))

(defn patch-region-backend-service-settings
  "Returns the builder for the settings used for calls to patchRegionBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchRegionBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^RegionBackendServiceSettings$Builder this]
    (-> this (.patchRegionBackendServiceSettings))))

