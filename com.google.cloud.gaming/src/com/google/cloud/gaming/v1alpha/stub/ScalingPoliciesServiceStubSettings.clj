(ns com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings
  "Settings class to configure an instance of ScalingPoliciesServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (gameservices.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getScalingPolicy to 30 seconds:



  ScalingPoliciesServiceStubSettings.Builder scalingPoliciesServiceSettingsBuilder =
      ScalingPoliciesServiceStubSettings.newBuilder();
  scalingPoliciesServiceSettingsBuilder.getScalingPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ScalingPoliciesServiceStubSettings scalingPoliciesServiceSettings = scalingPoliciesServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub ScalingPoliciesServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ScalingPoliciesServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ScalingPoliciesServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ScalingPoliciesServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ScalingPoliciesServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ScalingPoliciesServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ScalingPoliciesServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ScalingPoliciesServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ScalingPoliciesServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings$Builder []
    (ScalingPoliciesServiceStubSettings/newBuilder )))

(defn update-scaling-policy-settings
  "Returns the object with the settings used for calls to updateScalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ScalingPoliciesServiceStubSettings this]
    (-> this (.updateScalingPolicySettings))))

(defn create-scaling-policy-operation-settings
  "Returns the object with the settings used for calls to createScalingPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceStubSettings this]
    (-> this (.createScalingPolicyOperationSettings))))

(defn list-scaling-policies-settings
  "Returns the object with the settings used for calls to listScalingPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.gaming.v1alpha.ListScalingPoliciesRequest,com.google.cloud.gaming.v1alpha.ListScalingPoliciesResponse,com.google.cloud.gaming.v1alpha.ScalingPoliciesServiceClient$ListScalingPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ScalingPoliciesServiceStubSettings this]
    (-> this (.listScalingPoliciesSettings))))

(defn get-scaling-policy-settings
  "Returns the object with the settings used for calls to getScalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.GetScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ScalingPoliciesServiceStubSettings this]
    (-> this (.getScalingPolicySettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStub`

  throws: java.io.IOException"
  ([^ScalingPoliciesServiceStubSettings this]
    (-> this (.createStub))))

(defn create-scaling-policy-settings
  "Returns the object with the settings used for calls to createScalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.CreateScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ScalingPoliciesServiceStubSettings this]
    (-> this (.createScalingPolicySettings))))

(defn delete-scaling-policy-settings
  "Returns the object with the settings used for calls to deleteScalingPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ScalingPoliciesServiceStubSettings this]
    (-> this (.deleteScalingPolicySettings))))

(defn delete-scaling-policy-operation-settings
  "Returns the object with the settings used for calls to deleteScalingPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.DeleteScalingPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceStubSettings this]
    (-> this (.deleteScalingPolicyOperationSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.ScalingPoliciesServiceStubSettings$Builder [^ScalingPoliciesServiceStubSettings this]
    (-> this (.toBuilder))))

(defn update-scaling-policy-operation-settings
  "Returns the object with the settings used for calls to updateScalingPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.UpdateScalingPolicyRequest,com.google.cloud.gaming.v1alpha.ScalingPolicy,com.google.protobuf.Empty>`"
  ([^ScalingPoliciesServiceStubSettings this]
    (-> this (.updateScalingPolicyOperationSettings))))

