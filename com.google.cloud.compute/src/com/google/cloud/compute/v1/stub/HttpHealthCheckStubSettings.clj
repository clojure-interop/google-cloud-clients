(ns com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings
  "Settings class to configure an instance of HttpHealthCheckStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteHttpHealthCheck to 30 seconds:



  HttpHealthCheckStubSettings.Builder httpHealthCheckSettingsBuilder =
      HttpHealthCheckStubSettings.newBuilder();
  httpHealthCheckSettingsBuilder.deleteHttpHealthCheckSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  HttpHealthCheckStubSettings httpHealthCheckSettings = httpHealthCheckSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpHealthCheckStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (HttpHealthCheckStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (HttpHealthCheckStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (HttpHealthCheckStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (HttpHealthCheckStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (HttpHealthCheckStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings$Builder []
    (HttpHealthCheckStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (HttpHealthCheckStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (HttpHealthCheckStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (HttpHealthCheckStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (HttpHealthCheckStubSettings/getDefaultServiceScopes )))

(defn delete-http-health-check-settings
  "Returns the object with the settings used for calls to deleteHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpHealthCheckStubSettings this]
    (-> this (.deleteHttpHealthCheckSettings))))

(defn get-http-health-check-settings
  "Returns the object with the settings used for calls to getHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpHealthCheckStubSettings this]
    (-> this (.getHttpHealthCheckSettings))))

(defn insert-http-health-check-settings
  "Returns the object with the settings used for calls to insertHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpHealthCheckStubSettings this]
    (-> this (.insertHttpHealthCheckSettings))))

(defn list-http-health-checks-settings
  "Returns the object with the settings used for calls to listHttpHealthChecks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListHttpHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpHealthCheckList,com.google.cloud.compute.v1.HttpHealthCheckClient$ListHttpHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^HttpHealthCheckStubSettings this]
    (-> this (.listHttpHealthChecksSettings))))

(defn patch-http-health-check-settings
  "Returns the object with the settings used for calls to patchHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpHealthCheckStubSettings this]
    (-> this (.patchHttpHealthCheckSettings))))

(defn update-http-health-check-settings
  "Returns the object with the settings used for calls to updateHttpHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateHttpHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpHealthCheckStubSettings this]
    (-> this (.updateHttpHealthCheckSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.HttpHealthCheckStub`

  throws: java.io.IOException"
  ([^HttpHealthCheckStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.HttpHealthCheckStubSettings$Builder [^HttpHealthCheckStubSettings this]
    (-> this (.toBuilder))))

