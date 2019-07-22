(ns com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings
  "Settings class to configure an instance of AlertPolicyServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (monitoring.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getAlertPolicy to 30 seconds:



  AlertPolicyServiceStubSettings.Builder alertPolicyServiceSettingsBuilder =
      AlertPolicyServiceStubSettings.newBuilder();
  alertPolicyServiceSettingsBuilder.getAlertPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AlertPolicyServiceStubSettings alertPolicyServiceSettings = alertPolicyServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub AlertPolicyServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AlertPolicyServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AlertPolicyServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AlertPolicyServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AlertPolicyServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (AlertPolicyServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AlertPolicyServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AlertPolicyServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AlertPolicyServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder []
    (AlertPolicyServiceStubSettings/newBuilder )))

(defn list-alert-policies-settings
  "Returns the object with the settings used for calls to listAlertPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListAlertPoliciesRequest,com.google.monitoring.v3.ListAlertPoliciesResponse,com.google.cloud.monitoring.v3.AlertPolicyServiceClient$ListAlertPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AlertPolicyServiceStubSettings this]
    (-> this (.listAlertPoliciesSettings))))

(defn get-alert-policy-settings
  "Returns the object with the settings used for calls to getAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.GetAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AlertPolicyServiceStubSettings this]
    (-> this (.getAlertPolicySettings))))

(defn create-alert-policy-settings
  "Returns the object with the settings used for calls to createAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.CreateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AlertPolicyServiceStubSettings this]
    (-> this (.createAlertPolicySettings))))

(defn delete-alert-policy-settings
  "Returns the object with the settings used for calls to deleteAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.DeleteAlertPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AlertPolicyServiceStubSettings this]
    (-> this (.deleteAlertPolicySettings))))

(defn update-alert-policy-settings
  "Returns the object with the settings used for calls to updateAlertPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.UpdateAlertPolicyRequest,com.google.monitoring.v3.AlertPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AlertPolicyServiceStubSettings this]
    (-> this (.updateAlertPolicySettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStub`

  throws: java.io.IOException"
  ([^AlertPolicyServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.AlertPolicyServiceStubSettings$Builder [^AlertPolicyServiceStubSettings this]
    (-> this (.toBuilder))))

