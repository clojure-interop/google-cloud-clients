(ns com.google.cloud.compute.v1.BackendServiceSettings
  "Settings class to configure an instance of BackendServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addSignedUrlKeyBackendService to 30 seconds:



  BackendServiceSettings.Builder backendServiceSettingsBuilder =
      BackendServiceSettings.newBuilder();
  backendServiceSettingsBuilder.addSignedUrlKeyBackendServiceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  BackendServiceSettings backendServiceSettings = backendServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (BackendServiceSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (BackendServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (BackendServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (BackendServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.BackendServiceSettings$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (BackendServiceSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.BackendServiceSettings$Builder []
    (BackendServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (BackendServiceSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (BackendServiceSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.BackendServiceStubSettings`

  returns: `com.google.cloud.compute.v1.BackendServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.BackendServiceSettings [^com.google.cloud.compute.v1.stub.BackendServiceStubSettings stub]
    (BackendServiceSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (BackendServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (BackendServiceSettings/getDefaultServiceScopes )))

(defn aggregated-list-backend-services-settings
  "Returns the object with the settings used for calls to aggregatedListBackendServices.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceAggregatedList,com.google.cloud.compute.v1.BackendServiceClient$AggregatedListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^BackendServiceSettings this]
    (-> this (.aggregatedListBackendServicesSettings))))

(defn update-backend-service-settings
  "Returns the object with the settings used for calls to updateBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceSettings this]
    (-> this (.updateBackendServiceSettings))))

(defn delete-signed-url-key-backend-service-settings
  "Returns the object with the settings used for calls to deleteSignedUrlKeyBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceSettings this]
    (-> this (.deleteSignedUrlKeyBackendServiceSettings))))

(defn set-security-policy-backend-service-settings
  "Returns the object with the settings used for calls to setSecurityPolicyBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetSecurityPolicyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceSettings this]
    (-> this (.setSecurityPolicyBackendServiceSettings))))

(defn patch-backend-service-settings
  "Returns the object with the settings used for calls to patchBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceSettings this]
    (-> this (.patchBackendServiceSettings))))

(defn add-signed-url-key-backend-service-settings
  "Returns the object with the settings used for calls to addSignedUrlKeyBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceSettings this]
    (-> this (.addSignedUrlKeyBackendServiceSettings))))

(defn get-health-backend-service-settings
  "Returns the object with the settings used for calls to getHealthBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetHealthBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceSettings this]
    (-> this (.getHealthBackendServiceSettings))))

(defn get-backend-service-settings
  "Returns the object with the settings used for calls to getBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceSettings this]
    (-> this (.getBackendServiceSettings))))

(defn insert-backend-service-settings
  "Returns the object with the settings used for calls to insertBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceSettings this]
    (-> this (.insertBackendServiceSettings))))

(defn delete-backend-service-settings
  "Returns the object with the settings used for calls to deleteBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceSettings this]
    (-> this (.deleteBackendServiceSettings))))

(defn list-backend-services-settings
  "Returns the object with the settings used for calls to listBackendServices.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList,com.google.cloud.compute.v1.BackendServiceClient$ListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^BackendServiceSettings this]
    (-> this (.listBackendServicesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.BackendServiceSettings$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceSettings$Builder [^BackendServiceSettings this]
    (-> this (.toBuilder))))

