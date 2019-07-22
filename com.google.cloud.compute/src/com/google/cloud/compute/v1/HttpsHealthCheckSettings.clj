(ns com.google.cloud.compute.v1.HttpsHealthCheckSettings
  "Settings class to configure an instance of HttpsHealthCheckClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteHttpsHealthCheck to 30 seconds:



  HttpsHealthCheckSettings.Builder httpsHealthCheckSettingsBuilder =
      HttpsHealthCheckSettings.newBuilder();
  httpsHealthCheckSettingsBuilder.deleteHttpsHealthCheckSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  HttpsHealthCheckSettings httpsHealthCheckSettings = httpsHealthCheckSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HttpsHealthCheckSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (HttpsHealthCheckSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (HttpsHealthCheckSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (HttpsHealthCheckSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (HttpsHealthCheckSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.HttpsHealthCheckSettings$Builder`"
  (^com.google.cloud.compute.v1.HttpsHealthCheckSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (HttpsHealthCheckSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.HttpsHealthCheckSettings$Builder []
    (HttpsHealthCheckSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (HttpsHealthCheckSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (HttpsHealthCheckSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings`

  returns: `com.google.cloud.compute.v1.HttpsHealthCheckSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.HttpsHealthCheckSettings [^com.google.cloud.compute.v1.stub.HttpsHealthCheckStubSettings stub]
    (HttpsHealthCheckSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (HttpsHealthCheckSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (HttpsHealthCheckSettings/getDefaultServiceScopes )))

(defn delete-https-health-check-settings
  "Returns the object with the settings used for calls to deleteHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckSettings this]
    (-> this (.deleteHttpsHealthCheckSettings))))

(defn get-https-health-check-settings
  "Returns the object with the settings used for calls to getHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheck2>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckSettings this]
    (-> this (.getHttpsHealthCheckSettings))))

(defn insert-https-health-check-settings
  "Returns the object with the settings used for calls to insertHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckSettings this]
    (-> this (.insertHttpsHealthCheckSettings))))

(defn list-https-health-checks-settings
  "Returns the object with the settings used for calls to listHttpsHealthChecks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListHttpsHealthChecksHttpRequest,com.google.cloud.compute.v1.HttpsHealthCheckList,com.google.cloud.compute.v1.HttpsHealthCheckClient$ListHttpsHealthChecksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^HttpsHealthCheckSettings this]
    (-> this (.listHttpsHealthChecksSettings))))

(defn patch-https-health-check-settings
  "Returns the object with the settings used for calls to patchHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckSettings this]
    (-> this (.patchHttpsHealthCheckSettings))))

(defn update-https-health-check-settings
  "Returns the object with the settings used for calls to updateHttpsHealthCheck.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateHttpsHealthCheckHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^HttpsHealthCheckSettings this]
    (-> this (.updateHttpsHealthCheckSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.HttpsHealthCheckSettings$Builder`"
  (^com.google.cloud.compute.v1.HttpsHealthCheckSettings$Builder [^HttpsHealthCheckSettings this]
    (-> this (.toBuilder))))

