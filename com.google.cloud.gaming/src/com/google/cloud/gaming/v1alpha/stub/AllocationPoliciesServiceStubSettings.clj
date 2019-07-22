(ns com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings
  "Settings class to configure an instance of AllocationPoliciesServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (gameservices.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getAllocationPolicy to 30 seconds:



  AllocationPoliciesServiceStubSettings.Builder allocationPoliciesServiceSettingsBuilder =
      AllocationPoliciesServiceStubSettings.newBuilder();
  allocationPoliciesServiceSettingsBuilder.getAllocationPolicySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  AllocationPoliciesServiceStubSettings allocationPoliciesServiceSettings = allocationPoliciesServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha.stub AllocationPoliciesServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (AllocationPoliciesServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (AllocationPoliciesServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (AllocationPoliciesServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (AllocationPoliciesServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (AllocationPoliciesServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (AllocationPoliciesServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (AllocationPoliciesServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (AllocationPoliciesServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder []
    (AllocationPoliciesServiceStubSettings/newBuilder )))

(defn delete-allocation-policy-settings
  "Returns the object with the settings used for calls to deleteAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AllocationPoliciesServiceStubSettings this]
    (-> this (.deleteAllocationPolicySettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStub`

  throws: java.io.IOException"
  ([^AllocationPoliciesServiceStubSettings this]
    (-> this (.createStub))))

(defn get-allocation-policy-settings
  "Returns the object with the settings used for calls to getAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.GetAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AllocationPoliciesServiceStubSettings this]
    (-> this (.getAllocationPolicySettings))))

(defn create-allocation-policy-settings
  "Returns the object with the settings used for calls to createAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AllocationPoliciesServiceStubSettings this]
    (-> this (.createAllocationPolicySettings))))

(defn update-allocation-policy-settings
  "Returns the object with the settings used for calls to updateAllocationPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^AllocationPoliciesServiceStubSettings this]
    (-> this (.updateAllocationPolicySettings))))

(defn delete-allocation-policy-operation-settings
  "Returns the object with the settings used for calls to deleteAllocationPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.DeleteAllocationPolicyRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceStubSettings this]
    (-> this (.deleteAllocationPolicyOperationSettings))))

(defn update-allocation-policy-operation-settings
  "Returns the object with the settings used for calls to updateAllocationPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.UpdateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceStubSettings this]
    (-> this (.updateAllocationPolicyOperationSettings))))

(defn list-allocation-policies-settings
  "Returns the object with the settings used for calls to listAllocationPolicies.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.gaming.v1alpha.ListAllocationPoliciesRequest,com.google.cloud.gaming.v1alpha.ListAllocationPoliciesResponse,com.google.cloud.gaming.v1alpha.AllocationPoliciesServiceClient$ListAllocationPoliciesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^AllocationPoliciesServiceStubSettings this]
    (-> this (.listAllocationPoliciesSettings))))

(defn create-allocation-policy-operation-settings
  "Returns the object with the settings used for calls to createAllocationPolicy.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.gaming.v1alpha.CreateAllocationPolicyRequest,com.google.cloud.gaming.v1alpha.AllocationPolicy,com.google.protobuf.Empty>`"
  ([^AllocationPoliciesServiceStubSettings this]
    (-> this (.createAllocationPolicyOperationSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder`"
  (^com.google.cloud.gaming.v1alpha.stub.AllocationPoliciesServiceStubSettings$Builder [^AllocationPoliciesServiceStubSettings this]
    (-> this (.toBuilder))))

