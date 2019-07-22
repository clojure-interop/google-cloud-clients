(ns com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings
  "Settings class to configure an instance of ForwardingRuleStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteForwardingRule to 30 seconds:



  ForwardingRuleStubSettings.Builder forwardingRuleSettingsBuilder =
      ForwardingRuleStubSettings.newBuilder();
  forwardingRuleSettingsBuilder.deleteForwardingRuleSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ForwardingRuleStubSettings forwardingRuleSettings = forwardingRuleSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub ForwardingRuleStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (ForwardingRuleStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ForwardingRuleStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ForwardingRuleStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ForwardingRuleStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ForwardingRuleStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings$Builder []
    (ForwardingRuleStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ForwardingRuleStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (ForwardingRuleStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ForwardingRuleStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ForwardingRuleStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-forwarding-rules-settings
  "Returns the object with the settings used for calls to aggregatedListForwardingRules.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleAggregatedList,com.google.cloud.compute.v1.ForwardingRuleClient$AggregatedListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ForwardingRuleStubSettings this]
    (-> this (.aggregatedListForwardingRulesSettings))))

(defn delete-forwarding-rule-settings
  "Returns the object with the settings used for calls to deleteForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ForwardingRuleStubSettings this]
    (-> this (.deleteForwardingRuleSettings))))

(defn get-forwarding-rule-settings
  "Returns the object with the settings used for calls to getForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetForwardingRuleHttpRequest,com.google.cloud.compute.v1.ForwardingRule>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ForwardingRuleStubSettings this]
    (-> this (.getForwardingRuleSettings))))

(defn insert-forwarding-rule-settings
  "Returns the object with the settings used for calls to insertForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ForwardingRuleStubSettings this]
    (-> this (.insertForwardingRuleSettings))))

(defn list-forwarding-rules-settings
  "Returns the object with the settings used for calls to listForwardingRules.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListForwardingRulesHttpRequest,com.google.cloud.compute.v1.ForwardingRuleList,com.google.cloud.compute.v1.ForwardingRuleClient$ListForwardingRulesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ForwardingRuleStubSettings this]
    (-> this (.listForwardingRulesSettings))))

(defn set-target-forwarding-rule-settings
  "Returns the object with the settings used for calls to setTargetForwardingRule.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetTargetForwardingRuleHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ForwardingRuleStubSettings this]
    (-> this (.setTargetForwardingRuleSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.ForwardingRuleStub`

  throws: java.io.IOException"
  ([^ForwardingRuleStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.ForwardingRuleStubSettings$Builder [^ForwardingRuleStubSettings this]
    (-> this (.toBuilder))))

