(ns com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder
  "Builder for BigtableInstanceAdminStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.stub BigtableInstanceAdminStubSettings$Builder]))

(defn delete-instance-settings
  "Returns the builder for the settings used for calls to deleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.DeleteInstanceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.deleteInstanceSettings))))

(defn get-instance-settings
  "Returns the builder for the settings used for calls to getInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.GetInstanceRequest,com.google.bigtable.admin.v2.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.getInstanceSettings))))

(defn create-app-profile-settings
  "Returns the builder for the settings used for calls to createAppProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.CreateAppProfileRequest,com.google.bigtable.admin.v2.AppProfile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.createAppProfileSettings))))

(defn list-instances-settings
  "Returns the builder for the settings used for calls to listInstances.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.ListInstancesRequest,com.google.bigtable.admin.v2.ListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.listInstancesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder [^BigtableInstanceAdminStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn update-app-profile-settings
  "Returns the builder for the settings used for calls to updateAppProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.UpdateAppProfileRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.updateAppProfileSettings))))

(defn delete-app-profile-settings
  "Returns the builder for the settings used for calls to deleteAppProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.DeleteAppProfileRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.deleteAppProfileSettings))))

(defn create-cluster-operation-settings
  "Returns the builder for the settings used for calls to createCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.bigtable.admin.v2.CreateClusterRequest,com.google.bigtable.admin.v2.Cluster,com.google.bigtable.admin.v2.CreateClusterMetadata>`"
  ([^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.createClusterOperationSettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn update-cluster-settings
  "Returns the builder for the settings used for calls to updateCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.Cluster,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.updateClusterSettings))))

(defn partial-update-instance-settings
  "Returns the builder for the settings used for calls to partialUpdateInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.PartialUpdateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.partialUpdateInstanceSettings))))

(defn list-app-profiles-settings
  "Returns the builder for the settings used for calls to listAppProfiles.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.bigtable.admin.v2.ListAppProfilesRequest,com.google.bigtable.admin.v2.ListAppProfilesResponse,com.google.cloud.bigtable.admin.v2.BaseBigtableInstanceAdminClient.ListAppProfilesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.listAppProfilesSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn build
  "returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.build))))

(defn create-instance-settings
  "Returns the builder for the settings used for calls to createInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.CreateInstanceRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.createInstanceSettings))))

(defn delete-cluster-settings
  "Returns the builder for the settings used for calls to deleteCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.DeleteClusterRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.deleteClusterSettings))))

(defn update-cluster-operation-settings
  "Returns the builder for the settings used for calls to updateCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.bigtable.admin.v2.Cluster,com.google.bigtable.admin.v2.Cluster,com.google.bigtable.admin.v2.UpdateClusterMetadata>`"
  ([^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.updateClusterOperationSettings))))

(defn create-instance-operation-settings
  "Returns the builder for the settings used for calls to createInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.bigtable.admin.v2.CreateInstanceRequest,com.google.bigtable.admin.v2.Instance,com.google.bigtable.admin.v2.CreateInstanceMetadata>`"
  ([^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.createInstanceOperationSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn list-clusters-settings
  "Returns the builder for the settings used for calls to listClusters.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.ListClustersRequest,com.google.bigtable.admin.v2.ListClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.listClustersSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-app-profile-settings
  "Returns the builder for the settings used for calls to getAppProfile.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.GetAppProfileRequest,com.google.bigtable.admin.v2.AppProfile>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.getAppProfileSettings))))

(defn create-cluster-settings
  "Returns the builder for the settings used for calls to createCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.CreateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.createClusterSettings))))

(defn update-app-profile-operation-settings
  "Returns the builder for the settings used for calls to updateAppProfile.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.bigtable.admin.v2.UpdateAppProfileRequest,com.google.bigtable.admin.v2.AppProfile,com.google.bigtable.admin.v2.UpdateAppProfileMetadata>`"
  ([^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.updateAppProfileOperationSettings))))

(defn get-cluster-settings
  "Returns the builder for the settings used for calls to getCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.bigtable.admin.v2.GetClusterRequest,com.google.bigtable.admin.v2.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.getClusterSettings))))

(defn partial-update-instance-operation-settings
  "Returns the builder for the settings used for calls to partialUpdateInstance.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.bigtable.admin.v2.PartialUpdateInstanceRequest,com.google.bigtable.admin.v2.Instance,com.google.bigtable.admin.v2.UpdateInstanceMetadata>`"
  ([^BigtableInstanceAdminStubSettings$Builder this]
    (-> this (.partialUpdateInstanceOperationSettings))))

