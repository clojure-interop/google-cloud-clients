(ns com.google.cloud.compute.v1.stub.BackendServiceStubSettings$Builder
  "Builder for BackendServiceStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub BackendServiceStubSettings$Builder]))

(defn aggregated-list-backend-services-settings
  "Returns the builder for the settings used for calls to aggregatedListBackendServices.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceAggregatedList,com.google.cloud.compute.v1.BackendServiceClient$AggregatedListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.aggregatedListBackendServicesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.BackendServiceStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.BackendServiceStubSettings$Builder [^BackendServiceStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn update-backend-service-settings
  "Returns the builder for the settings used for calls to updateBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.updateBackendServiceSettings))))

(defn delete-signed-url-key-backend-service-settings
  "Returns the builder for the settings used for calls to deleteSignedUrlKeyBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.deleteSignedUrlKeyBackendServiceSettings))))

(defn set-security-policy-backend-service-settings
  "Returns the builder for the settings used for calls to setSecurityPolicyBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetSecurityPolicyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.setSecurityPolicyBackendServiceSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.BackendServiceStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.BackendServiceStubSettings [^BackendServiceStubSettings$Builder this]
    (-> this (.build))))

(defn patch-backend-service-settings
  "Returns the builder for the settings used for calls to patchBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.patchBackendServiceSettings))))

(defn add-signed-url-key-backend-service-settings
  "Returns the builder for the settings used for calls to addSignedUrlKeyBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.addSignedUrlKeyBackendServiceSettings))))

(defn get-health-backend-service-settings
  "Returns the builder for the settings used for calls to getHealthBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetHealthBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.getHealthBackendServiceSettings))))

(defn get-backend-service-settings
  "Returns the builder for the settings used for calls to getBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.getBackendServiceSettings))))

(defn insert-backend-service-settings
  "Returns the builder for the settings used for calls to insertBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.insertBackendServiceSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^BackendServiceStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-backend-service-settings
  "Returns the builder for the settings used for calls to deleteBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.deleteBackendServiceSettings))))

(defn list-backend-services-settings
  "Returns the builder for the settings used for calls to listBackendServices.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList,com.google.cloud.compute.v1.BackendServiceClient$ListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^BackendServiceStubSettings$Builder this]
    (-> this (.listBackendServicesSettings))))

