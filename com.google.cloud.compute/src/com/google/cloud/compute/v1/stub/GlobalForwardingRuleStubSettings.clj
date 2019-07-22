(ns com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings
  "Settings class to configure an instance of GlobalForwardingRuleStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteGlobalForwardingRule to 30 seconds:



  GlobalForwardingRuleStubSettings.Builder globalForwardingRuleSettingsBuilder =
      GlobalForwardingRuleStubSettings.newBuilder();
  globalForwardingRuleSettingsBuilder.deleteGlobalForwardingRuleSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GlobalForwardingRuleStubSettings globalForwardingRuleSettings = globalForwardingRuleSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub GlobalForwardingRuleStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (GlobalForwardingRuleStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GlobalForwardingRuleStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GlobalForwardingRuleStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GlobalForwardingRuleStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GlobalForwardingRuleStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder []
    (GlobalForwardingRuleStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GlobalForwardingRuleStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (GlobalForwardingRuleStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GlobalForwardingRuleStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GlobalForwardingRuleStubSettings/getDefaultServiceScopes )))

(defn delete-global-forwarding-rule-settings
  "Returns the object with the settings used for calls to deleteGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalForwardingRuleStubSettings this]
    (-> this (.deleteGlobalForwardingRuleSettings))))

(defn get-global-forwarding-rule-settings
  "Returns the object with the settings used for calls to getGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalForwardingRuleStubSettings this]
    (-> this (.getGlobalForwardingRuleSettings))))

(defn insert-global-forwarding-rule-settings
  "Returns the object with the settings used for calls to insertGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalForwardingRuleStubSettings this]
    (-> this (.insertGlobalForwardingRuleSettings))))

(defn list-global-forwarding-rules-settings
  "Returns the object with the settings used for calls to listGlobalForwardingRules.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListGlobalForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList,com.google.cloud.compute.v1.GlobalForwardingRuleClient$ListGlobalForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GlobalForwardingRuleStubSettings this]
    (-> this (.listGlobalForwardingRulesSettings))))

(defn set-target-global-forwarding-rule-settings
  "Returns the object with the settings used for calls to setTargetGlobalForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetTargetGlobalForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GlobalForwardingRuleStubSettings this]
    (-> this (.setTargetGlobalForwardingRuleSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.GlobalForwardingRuleStub`

  throws: java.io.IOException"
  ([^GlobalForwardingRuleStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.GlobalForwardingRuleStubSettings$Builder [^GlobalForwardingRuleStubSettings this]
    (-> this (.toBuilder))))

