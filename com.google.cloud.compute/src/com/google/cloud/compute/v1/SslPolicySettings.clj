(ns com.google.cloud.compute.v1.SslPolicySettings
  "Settings class to configure an instance of SslPolicyClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteSslPolicy to 30 seconds:



  SslPolicySettings.Builder sslPolicySettingsBuilder =
      SslPolicySettings.newBuilder();
  sslPolicySettingsBuilder.deleteSslPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SslPolicySettings sslPolicySettings = sslPolicySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslPolicySettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (SslPolicySettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SslPolicySettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SslPolicySettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SslPolicySettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.SslPolicySettings$Builder`"
  (^com.google.cloud.compute.v1.SslPolicySettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SslPolicySettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.SslPolicySettings$Builder []
    (SslPolicySettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SslPolicySettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (SslPolicySettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.SslPolicyStubSettings`

  returns: `com.google.cloud.compute.v1.SslPolicySettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SslPolicySettings [^com.google.cloud.compute.v1.stub.SslPolicyStubSettings stub]
    (SslPolicySettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SslPolicySettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SslPolicySettings/getDefaultServiceScopes )))

(defn delete-ssl-policy-settings
  "Returns the object with the settings used for calls to deleteSslPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslPolicySettings this]
    (-> this (.deleteSslPolicySettings))))

(defn get-ssl-policy-settings
  "Returns the object with the settings used for calls to getSslPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetSslPolicyHttpRequest,com.google.cloud.compute.v1.SslPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslPolicySettings this]
    (-> this (.getSslPolicySettings))))

(defn insert-ssl-policy-settings
  "Returns the object with the settings used for calls to insertSslPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslPolicySettings this]
    (-> this (.insertSslPolicySettings))))

(defn list-ssl-policies-settings
  "Returns the object with the settings used for calls to listSslPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesList,com.google.cloud.compute.v1.SslPolicyClient$ListSslPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SslPolicySettings this]
    (-> this (.listSslPoliciesSettings))))

(defn list-available-features-ssl-policies-settings
  "Returns the object with the settings used for calls to listAvailableFeaturesSslPolicies.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ListAvailableFeaturesSslPoliciesHttpRequest,com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslPolicySettings this]
    (-> this (.listAvailableFeaturesSslPoliciesSettings))))

(defn patch-ssl-policy-settings
  "Returns the object with the settings used for calls to patchSslPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchSslPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SslPolicySettings this]
    (-> this (.patchSslPolicySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.SslPolicySettings$Builder`"
  (^com.google.cloud.compute.v1.SslPolicySettings$Builder [^SslPolicySettings this]
    (-> this (.toBuilder))))

