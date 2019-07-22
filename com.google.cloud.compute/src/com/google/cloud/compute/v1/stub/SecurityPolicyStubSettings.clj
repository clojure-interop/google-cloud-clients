(ns com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings
  "Settings class to configure an instance of SecurityPolicyStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addRuleSecurityPolicy to 30 seconds:



  SecurityPolicyStubSettings.Builder securityPolicySettingsBuilder =
      SecurityPolicyStubSettings.newBuilder();
  securityPolicySettingsBuilder.addRuleSecurityPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SecurityPolicyStubSettings securityPolicySettings = securityPolicySettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SecurityPolicyStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (SecurityPolicyStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SecurityPolicyStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SecurityPolicyStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SecurityPolicyStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SecurityPolicyStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder []
    (SecurityPolicyStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SecurityPolicyStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (SecurityPolicyStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SecurityPolicyStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SecurityPolicyStubSettings/getDefaultServiceScopes )))

(defn get-security-policy-settings
  "Returns the object with the settings used for calls to getSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicyStubSettings this]
    (-> this (.getSecurityPolicySettings))))

(defn delete-security-policy-settings
  "Returns the object with the settings used for calls to deleteSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicyStubSettings this]
    (-> this (.deleteSecurityPolicySettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.SecurityPolicyStub`

  throws: java.io.IOException"
  ([^SecurityPolicyStubSettings this]
    (-> this (.createStub))))

(defn list-security-policies-settings
  "Returns the object with the settings used for calls to listSecurityPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListSecurityPoliciesHttpRequest,com.google.cloud.compute.v1.SecurityPolicyList,com.google.cloud.compute.v1.SecurityPolicyClient$ListSecurityPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SecurityPolicyStubSettings this]
    (-> this (.listSecurityPoliciesSettings))))

(defn insert-security-policy-settings
  "Returns the object with the settings used for calls to insertSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicyStubSettings this]
    (-> this (.insertSecurityPolicySettings))))

(defn add-rule-security-policy-settings
  "Returns the object with the settings used for calls to addRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicyStubSettings this]
    (-> this (.addRuleSecurityPolicySettings))))

(defn remove-rule-security-policy-settings
  "Returns the object with the settings used for calls to removeRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.RemoveRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicyStubSettings this]
    (-> this (.removeRuleSecurityPolicySettings))))

(defn patch-security-policy-settings
  "Returns the object with the settings used for calls to patchSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicyStubSettings this]
    (-> this (.patchSecurityPolicySettings))))

(defn get-rule-security-policy-settings
  "Returns the object with the settings used for calls to getRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.SecurityPolicyRule>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicyStubSettings this]
    (-> this (.getRuleSecurityPolicySettings))))

(defn patch-rule-security-policy-settings
  "Returns the object with the settings used for calls to patchRuleSecurityPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchRuleSecurityPolicyHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SecurityPolicyStubSettings this]
    (-> this (.patchRuleSecurityPolicySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SecurityPolicyStubSettings$Builder [^SecurityPolicyStubSettings this]
    (-> this (.toBuilder))))

