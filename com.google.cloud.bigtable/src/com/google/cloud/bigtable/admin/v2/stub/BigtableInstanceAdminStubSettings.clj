(ns com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings
  "Settings class to configure an instance of BigtableInstanceAdminStub.

  The default instance has everything set to sensible defaults:


    The default service address (bigtableadmin.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getInstance to 30 seconds:



  BigtableInstanceAdminStubSettings.Builder baseBigtableInstanceAdminSettingsBuilder =
      BigtableInstanceAdminStubSettings.newBuilder();
  baseBigtableInstanceAdminSettingsBuilder.getInstanceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  BigtableInstanceAdminStubSettings baseBigtableInstanceAdminSettings = baseBigtableInstanceAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.stub BigtableInstanceAdminStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (BigtableInstanceAdminStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (BigtableInstanceAdminStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (BigtableInstanceAdminStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (BigtableInstanceAdminStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (BigtableInstanceAdminStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (BigtableInstanceAdminStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (BigtableInstanceAdminStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (BigtableInstanceAdminStubSettings/newBuilder client-context))
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder []
    (BigtableInstanceAdminStubSettings/newBuilder )))

(defn delete-instance-settings
  "Returns the object with the settings used for calls to deleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.DeleteInstanceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.deleteInstanceSettings))))

(defn get-instance-settings
  "Returns the object with the settings used for calls to getInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.GetInstanceRequest,com.google.bigtable.admin.v2.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.getInstanceSettings))))

(defn create-app-profile-settings
  "Returns the object with the settings used for calls to createAppProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.CreateAppProfileRequest,com.google.bigtable.admin.v2.AppProfile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.createAppProfileSettings))))

(defn list-instances-settings
  "Returns the object with the settings used for calls to listInstances.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.ListInstancesRequest,com.google.bigtable.admin.v2.ListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.listInstancesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStub`

  throws: java.io.IOException"
  ([^BigtableInstanceAdminStubSettings this]
    (-> this (.createStub))))

(defn update-app-profile-settings
  "Returns the object with the settings used for calls to updateAppProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.UpdateAppProfileRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.updateAppProfileSettings))))

(defn delete-app-profile-settings
  "Returns the object with the settings used for calls to deleteAppProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.DeleteAppProfileRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.deleteAppProfileSettings))))

(defn create-cluster-operation-settings
  "Returns the object with the settings used for calls to createCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.bigtable.admin.v2.CreateClusterRequest,com.google.bigtable.admin.v2.Cluster,com.google.bigtable.admin.v2.CreateClusterMetadata>`"
  ([^BigtableInstanceAdminStubSettings this]
    (-> this (.createClusterOperationSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn update-cluster-settings
  "Returns the object with the settings used for calls to updateCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.Cluster,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.updateClusterSettings))))

(defn partial-update-instance-settings
  "Returns the object with the settings used for calls to partialUpdateInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.PartialUpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.partialUpdateInstanceSettings))))

(defn list-app-profiles-settings
  "Returns the object with the settings used for calls to listAppProfiles.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.bigtable.admin.v2.ListAppProfilesRequest,com.google.bigtable.admin.v2.ListAppProfilesResponse,com.google.cloud.bigtable.admin.v2.BaseBigtableInstanceAdminClient.ListAppProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.listAppProfilesSettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.setIamPolicySettings))))

(defn create-instance-settings
  "Returns the object with the settings used for calls to createInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.createInstanceSettings))))

(defn delete-cluster-settings
  "Returns the object with the settings used for calls to deleteCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.DeleteClusterRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.deleteClusterSettings))))

(defn update-cluster-operation-settings
  "Returns the object with the settings used for calls to updateCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.bigtable.admin.v2.Cluster,com.google.bigtable.admin.v2.Cluster,com.google.bigtable.admin.v2.UpdateClusterMetadata>`"
  ([^BigtableInstanceAdminStubSettings this]
    (-> this (.updateClusterOperationSettings))))

(defn create-instance-operation-settings
  "Returns the object with the settings used for calls to createInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.bigtable.admin.v2.CreateInstanceRequest,com.google.bigtable.admin.v2.Instance,com.google.bigtable.admin.v2.CreateInstanceMetadata>`"
  ([^BigtableInstanceAdminStubSettings this]
    (-> this (.createInstanceOperationSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.getIamPolicySettings))))

(defn list-clusters-settings
  "Returns the object with the settings used for calls to listClusters.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.ListClustersRequest,com.google.bigtable.admin.v2.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.listClustersSettings))))

(defn get-app-profile-settings
  "Returns the object with the settings used for calls to getAppProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.GetAppProfileRequest,com.google.bigtable.admin.v2.AppProfile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.getAppProfileSettings))))

(defn create-cluster-settings
  "Returns the object with the settings used for calls to createCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.CreateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.createClusterSettings))))

(defn update-app-profile-operation-settings
  "Returns the object with the settings used for calls to updateAppProfile.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.bigtable.admin.v2.UpdateAppProfileRequest,com.google.bigtable.admin.v2.AppProfile,com.google.bigtable.admin.v2.UpdateAppProfileMetadata>`"
  ([^BigtableInstanceAdminStubSettings this]
    (-> this (.updateAppProfileOperationSettings))))

(defn get-cluster-settings
  "Returns the object with the settings used for calls to getCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.bigtable.admin.v2.GetClusterRequest,com.google.bigtable.admin.v2.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableInstanceAdminStubSettings this]
    (-> this (.getClusterSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder [^BigtableInstanceAdminStubSettings this]
    (-> this (.toBuilder))))

(defn partial-update-instance-operation-settings
  "Returns the object with the settings used for calls to partialUpdateInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.bigtable.admin.v2.PartialUpdateInstanceRequest,com.google.bigtable.admin.v2.Instance,com.google.bigtable.admin.v2.UpdateInstanceMetadata>`"
  ([^BigtableInstanceAdminStubSettings this]
    (-> this (.partialUpdateInstanceOperationSettings))))

