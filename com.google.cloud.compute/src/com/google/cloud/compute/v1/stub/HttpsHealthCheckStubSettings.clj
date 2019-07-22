(ns com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings
  "Settings class to configure an instance of HttpsHealthCheckStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteHttpsHealthCheck to 30 seconds:



  HttpsHealthCheckStubSettings.Builder httpsHealthCheckSettingsBuilder =
      HttpsHealthCheckStubSettings.newBuilder();
  httpsHealthCheckSettingsBuilder.deleteHttpsHealthCheckSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  HttpsHealthCheckStubSettings httpsHealthCheckSettings = httpsHealthCheckSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpsHealthCheckStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (HttpsHealthCheckStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (HttpsHealthCheckStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (HttpsHealthCheckStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (HttpsHealthCheckStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (HttpsHealthCheckStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder []
    (HttpsHealthCheckStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (HttpsHealthCheckStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (HttpsHealthCheckStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (HttpsHealthCheckStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (HttpsHealthCheckStubSettings/getDefaultServiceScopes )))

(defn delete-https-health-check-settings
  "Returns the object with the settings used for calls to deleteHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckStubSettings this]
    (-> this (.deleteHttpsHealthCheckSettings))))

(defn get-https-health-check-settings
  "Returns the object with the settings used for calls to getHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckStubSettings this]
    (-> this (.getHttpsHealthCheckSettings))))

(defn insert-https-health-check-settings
  "Returns the object with the settings used for calls to insertHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckStubSettings this]
    (-> this (.insertHttpsHealthCheckSettings))))

(defn list-https-health-checks-settings
  "Returns the object with the settings used for calls to listHttpsHealthChecks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckList,com.google.cloud.compute.v1.HttpsHealthCheckClient$ListHttpsHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^HttpsHealthCheckStubSettings this]
    (-> this (.listHttpsHealthChecksSettings))))

(defn patch-https-health-check-settings
  "Returns the object with the settings used for calls to patchHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckStubSettings this]
    (-> this (.patchHttpsHealthCheckSettings))))

(defn update-https-health-check-settings
  "Returns the object with the settings used for calls to updateHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckStubSettings this]
    (-> this (.updateHttpsHealthCheckSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.HttpsHealthCheckStub`

  throws: java.io.IOException"
  ([^HttpsHealthCheckStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings$Builder [^HttpsHealthCheckStubSettings this]
    (-> this (.toBuilder))))

