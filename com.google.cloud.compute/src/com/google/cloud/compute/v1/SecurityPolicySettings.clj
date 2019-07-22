(ns com.google.cloud.compute.v1.SecurityPolicySettings
  "Settings class to configure an instance of SecurityPolicyClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addRuleSecurityPolicy to 30 seconds:



  SecurityPolicySettings.Builder securityPolicySettingsBuilder =
      SecurityPolicySettings.newBuilder();
  securityPolicySettingsBuilder.addRuleSecurityPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SecurityPolicySettings securityPolicySettings = securityPolicySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicySettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (SecurityPolicySettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SecurityPolicySettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SecurityPolicySettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SecurityPolicySettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.SecurityPolicySettings$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicySettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SecurityPolicySettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.SecurityPolicySettings$Builder []
    (SecurityPolicySettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SecurityPolicySettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (SecurityPolicySettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings`

  returns: `com.google.cloud.compute.v1.SecurityPolicySettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SecurityPolicySettings [^com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings stub]
    (SecurityPolicySettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SecurityPolicySettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SecurityPolicySettings/getDefaultServiceScopes )))

(defn get-security-policy-settings
  "Returns the object with the settings used for calls to getSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicySettings this]
    (-> this (.getSecurityPolicySettings))))

(defn delete-security-policy-settings
  "Returns the object with the settings used for calls to deleteSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicySettings this]
    (-> this (.deleteSecurityPolicySettings))))

(defn list-security-policies-settings
  "Returns the object with the settings used for calls to listSecurityPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyList,com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SecurityPolicySettings this]
    (-> this (.listSecurityPoliciesSettings))))

(defn insert-security-policy-settings
  "Returns the object with the settings used for calls to insertSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicySettings this]
    (-> this (.insertSecurityPolicySettings))))

(defn add-rule-security-policy-settings
  "Returns the object with the settings used for calls to addRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicySettings this]
    (-> this (.addRuleSecurityPolicySettings))))

(defn remove-rule-security-policy-settings
  "Returns the object with the settings used for calls to removeRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicySettings this]
    (-> this (.removeRuleSecurityPolicySettings))))

(defn patch-security-policy-settings
  "Returns the object with the settings used for calls to patchSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicySettings this]
    (-> this (.patchSecurityPolicySettings))))

(defn get-rule-security-policy-settings
  "Returns the object with the settings used for calls to getRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicyRule>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicySettings this]
    (-> this (.getRuleSecurityPolicySettings))))

(defn patch-rule-security-policy-settings
  "Returns the object with the settings used for calls to patchRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicySettings this]
    (-> this (.patchRuleSecurityPolicySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.SecurityPolicySettings$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicySettings$Builder [^SecurityPolicySettings this]
    (-> this (.toBuilder))))

