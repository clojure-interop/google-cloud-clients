(ns com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings
  "Settings class to configure an instance of AutoscalingPolicyServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (dataproc.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createAutoscalingPolicy to 30 seconds:



  AutoscalingPolicyServiceSettings.Builder autoscalingPolicyServiceSettingsBuilder =
      AutoscalingPolicyServiceSettings.newBuilder();
  autoscalingPolicyServiceSettingsBuilder.createAutoscalingPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AutoscalingPolicyServiceSettings autoscalingPolicyServiceSettings = autoscalingPolicyServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1beta2 AutoscalingPolicyServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AutoscalingPolicyServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AutoscalingPolicyServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AutoscalingPolicyServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AutoscalingPolicyServiceSettings/newBuilder client-context))
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings$Builder []
    (AutoscalingPolicyServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AutoscalingPolicyServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStubSettings`

  returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings [^com.google.cloud.dataproc.v1beta2.stub.AutoscalingPolicyServiceStubSettings stub]
    (AutoscalingPolicyServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (AutoscalingPolicyServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AutoscalingPolicyServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AutoscalingPolicyServiceSettings/getDefaultServiceScopes )))

(defn create-autoscaling-policy-settings
  "Returns the object with the settings used for calls to createAutoscalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.CreateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoscalingPolicyServiceSettings this]
    (-> this (.createAutoscalingPolicySettings))))

(defn update-autoscaling-policy-settings
  "Returns the object with the settings used for calls to updateAutoscalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.UpdateAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoscalingPolicyServiceSettings this]
    (-> this (.updateAutoscalingPolicySettings))))

(defn get-autoscaling-policy-settings
  "Returns the object with the settings used for calls to getAutoscalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.GetAutoscalingPolicyRequest,com.google.cloud.dataproc.v1beta2.AutoscalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoscalingPolicyServiceSettings this]
    (-> this (.getAutoscalingPolicySettings))))

(defn list-autoscaling-policies-settings
  "Returns the object with the settings used for calls to listAutoscalingPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesRequest,com.google.cloud.dataproc.v1beta2.ListAutoscalingPoliciesResponse,com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceClient$ListAutoscalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AutoscalingPolicyServiceSettings this]
    (-> this (.listAutoscalingPoliciesSettings))))

(defn delete-autoscaling-policy-settings
  "Returns the object with the settings used for calls to deleteAutoscalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1beta2.DeleteAutoscalingPolicyRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AutoscalingPolicyServiceSettings this]
    (-> this (.deleteAutoscalingPolicySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings$Builder`"
  (^com.google.cloud.dataproc.v1beta2.AutoscalingPolicyServiceSettings$Builder [^AutoscalingPolicyServiceSettings this]
    (-> this (.toBuilder))))

