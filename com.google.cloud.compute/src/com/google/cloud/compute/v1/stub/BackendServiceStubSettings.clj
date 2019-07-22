(ns com.google.cloud.compute.v1.stub.BackendServiceStubSettings
  "Settings class to configure an instance of BackendServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addSignedUrlKeyBackendService to 30 seconds:



  BackendServiceStubSettings.Builder backendServiceSettingsBuilder =
      BackendServiceStubSettings.newBuilder();
  backendServiceSettingsBuilder.addSignedUrlKeyBackendServiceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  BackendServiceStubSettings backendServiceSettings = backendServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub BackendServiceStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (BackendServiceStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (BackendServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (BackendServiceStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (BackendServiceStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.BackendServiceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.BackendServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (BackendServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.BackendServiceStubSettings$Builder []
    (BackendServiceStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (BackendServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (BackendServiceStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (BackendServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (BackendServiceStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-backend-services-settings
  "Returns the object with the settings used for calls to aggregatedListBackendServices.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceAggregatedList,com.google.cloud.compute.v1.BackendServiceClient$AggregatedListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^BackendServiceStubSettings this]
    (-> this (.aggregatedListBackendServicesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.BackendServiceStub`

  throws: java.io.IOException"
  ([^BackendServiceStubSettings this]
    (-> this (.createStub))))

(defn update-backend-service-settings
  "Returns the object with the settings used for calls to updateBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceStubSettings this]
    (-> this (.updateBackendServiceSettings))))

(defn delete-signed-url-key-backend-service-settings
  "Returns the object with the settings used for calls to deleteSignedUrlKeyBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceStubSettings this]
    (-> this (.deleteSignedUrlKeyBackendServiceSettings))))

(defn set-security-policy-backend-service-settings
  "Returns the object with the settings used for calls to setSecurityPolicyBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetSecurityPolicyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceStubSettings this]
    (-> this (.setSecurityPolicyBackendServiceSettings))))

(defn patch-backend-service-settings
  "Returns the object with the settings used for calls to patchBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceStubSettings this]
    (-> this (.patchBackendServiceSettings))))

(defn add-signed-url-key-backend-service-settings
  "Returns the object with the settings used for calls to addSignedUrlKeyBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddSignedUrlKeyBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceStubSettings this]
    (-> this (.addSignedUrlKeyBackendServiceSettings))))

(defn get-health-backend-service-settings
  "Returns the object with the settings used for calls to getHealthBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetHealthBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendServiceGroupHealth>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceStubSettings this]
    (-> this (.getHealthBackendServiceSettings))))

(defn get-backend-service-settings
  "Returns the object with the settings used for calls to getBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetBackendServiceHttpRequest,com.google.cloud.compute.v1.BackendService>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceStubSettings this]
    (-> this (.getBackendServiceSettings))))

(defn insert-backend-service-settings
  "Returns the object with the settings used for calls to insertBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceStubSettings this]
    (-> this (.insertBackendServiceSettings))))

(defn delete-backend-service-settings
  "Returns the object with the settings used for calls to deleteBackendService.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteBackendServiceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendServiceStubSettings this]
    (-> this (.deleteBackendServiceSettings))))

(defn list-backend-services-settings
  "Returns the object with the settings used for calls to listBackendServices.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListBackendServicesHttpRequest,com.google.cloud.compute.v1.BackendServiceList,com.google.cloud.compute.v1.BackendServiceClient$ListBackendServicesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^BackendServiceStubSettings this]
    (-> this (.listBackendServicesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.BackendServiceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.BackendServiceStubSettings$Builder [^BackendServiceStubSettings this]
    (-> this (.toBuilder))))

