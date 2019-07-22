(ns com.google.cloud.compute.v1.stub.HealthCheckStubSettings
  "Settings class to configure an instance of HealthCheckStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteHealthCheck to 30 seconds:



  HealthCheckStubSettings.Builder healthCheckSettingsBuilder =
      HealthCheckStubSettings.newBuilder();
  healthCheckSettingsBuilder.deleteHealthCheckSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  HealthCheckStubSettings healthCheckSettings = healthCheckSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HealthCheckStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (HealthCheckStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (HealthCheckStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (HealthCheckStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (HealthCheckStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.HealthCheckStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.HealthCheckStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (HealthCheckStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.HealthCheckStubSettings$Builder []
    (HealthCheckStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (HealthCheckStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (HealthCheckStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (HealthCheckStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (HealthCheckStubSettings/getDefaultServiceScopes )))

(defn delete-health-check-settings
  "Returns the object with the settings used for calls to deleteHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HealthCheckStubSettings this]
    (-> this (.deleteHealthCheckSettings))))

(defn get-health-check-settings
  "Returns the object with the settings used for calls to getHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetHealthCheckHttpRequest,com.google.cloud.compute.v1.HealthCheck>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HealthCheckStubSettings this]
    (-> this (.getHealthCheckSettings))))

(defn insert-health-check-settings
  "Returns the object with the settings used for calls to insertHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HealthCheckStubSettings this]
    (-> this (.insertHealthCheckSettings))))

(defn list-health-checks-settings
  "Returns the object with the settings used for calls to listHealthChecks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListHealthChecksHttpRequest,com.google.cloud.compute.v1.HealthCheckList,com.google.cloud.compute.v1.HealthCheckClient$ListHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^HealthCheckStubSettings this]
    (-> this (.listHealthChecksSettings))))

(defn patch-health-check-settings
  "Returns the object with the settings used for calls to patchHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HealthCheckStubSettings this]
    (-> this (.patchHealthCheckSettings))))

(defn update-health-check-settings
  "Returns the object with the settings used for calls to updateHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HealthCheckStubSettings this]
    (-> this (.updateHealthCheckSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.HealthCheckStub`

  throws: java.io.IOException"
  ([^HealthCheckStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.HealthCheckStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.HealthCheckStubSettings$Builder [^HealthCheckStubSettings this]
    (-> this (.toBuilder))))

