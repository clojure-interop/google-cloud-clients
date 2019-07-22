(ns com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings
  "Settings class to configure an instance of AllocationPoliciesServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (gameservices.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getAllocationPolicy to 30 seconds:



  AllocationPoliciesServiceSettings.Builder allocationPoliciesServiceSettingsBuilder =
      AllocationPoliciesServiceSettings.newBuilder();
  allocationPoliciesServiceSettingsBuilder.getAllocationPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AllocationPoliciesServiceSettings allocationPoliciesServiceSettings = allocationPoliciesServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha AllocationPoliciesServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AllocationPoliciesServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AllocationPoliciesServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AllocationPoliciesServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AllocationPoliciesServiceSettings/newBuilder client-context))
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings$Builder []
    (AllocationPoliciesServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AllocationPoliciesServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings`

  returns: `com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings [^com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings stub]
    (AllocationPoliciesServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (AllocationPoliciesServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AllocationPoliciesServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AllocationPoliciesServiceSettings/getDefaultServiceScopes )))

(defn delete-allocation-policy-settings
  "Returns the object with the settings used for calls to deleteAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AllocationPoliciesServiceSettings this]
    (-> this (.deleteAllocationPolicySettings))))

(defn get-allocation-policy-settings
  "Returns the object with the settings used for calls to getAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.GetAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AllocationPoliciesServiceSettings this]
    (-> this (.getAllocationPolicySettings))))

(defn create-allocation-policy-settings
  "Returns the object with the settings used for calls to createAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AllocationPoliciesServiceSettings this]
    (-> this (.createAllocationPolicySettings))))

(defn update-allocation-policy-settings
  "Returns the object with the settings used for calls to updateAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AllocationPoliciesServiceSettings this]
    (-> this (.updateAllocationPolicySettings))))

(defn delete-allocation-policy-operation-settings
  "Returns the object with the settings used for calls to deleteAllocationPolicy.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceSettings this]
    (-> this (.deleteAllocationPolicyOperationSettings))))

(defn update-allocation-policy-operation-settings
  "Returns the object with the settings used for calls to updateAllocationPolicy.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceSettings this]
    (-> this (.updateAllocationPolicyOperationSettings))))

(defn list-allocation-policies-settings
  "Returns the object with the settings used for calls to listAllocationPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.ListAllocationPoliciesResponse,com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AllocationPoliciesServiceSettings this]
    (-> this (.listAllocationPoliciesSettings))))

(defn create-allocation-policy-operation-settings
  "Returns the object with the settings used for calls to createAllocationPolicy.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceSettings this]
    (-> this (.createAllocationPolicyOperationSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceSettings$Builder [^AllocationPoliciesServiceSettings this]
    (-> this (.toBuilder))))

