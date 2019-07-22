(ns com.google.cloud.dataproc.v1.stub.ClusterControllerStubSettings$Builder
  "Builder for ClusterControllerStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1.stub ClusterControllerStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.dataproc.v1.stub.ClusterControllerStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.dataproc.v1.stub.ClusterControllerStubSettings$Builder [^ClusterControllerStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn create-cluster-operation-settings
  "Returns the builder for the settings used for calls to createCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1.CreateClusterRequest,com.google.cloud.dataproc.v1.Cluster,com.google.cloud.dataproc.v1.ClusterOperationMetadata>`"
  ([^ClusterControllerStubSettings$Builder this]
    (-> this (.createClusterOperationSettings))))

(defn delete-cluster-operation-settings
  "Returns the builder for the settings used for calls to deleteCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1.DeleteClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.ClusterOperationMetadata>`"
  ([^ClusterControllerStubSettings$Builder this]
    (-> this (.deleteClusterOperationSettings))))

(defn update-cluster-settings
  "Returns the builder for the settings used for calls to updateCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.UpdateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerStubSettings$Builder this]
    (-> this (.updateClusterSettings))))

(defn diagnose-cluster-operation-settings
  "Returns the builder for the settings used for calls to diagnoseCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1.DiagnoseClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.DiagnoseClusterResults>`"
  ([^ClusterControllerStubSettings$Builder this]
    (-> this (.diagnoseClusterOperationSettings))))

(defn build
  "returns: `com.google.cloud.dataproc.v1.stub.ClusterControllerStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1.stub.ClusterControllerStubSettings [^ClusterControllerStubSettings$Builder this]
    (-> this (.build))))

(defn delete-cluster-settings
  "Returns the builder for the settings used for calls to deleteCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.DeleteClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerStubSettings$Builder this]
    (-> this (.deleteClusterSettings))))

(defn update-cluster-operation-settings
  "Returns the builder for the settings used for calls to updateCluster.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.dataproc.v1.UpdateClusterRequest,com.google.cloud.dataproc.v1.Cluster,com.google.cloud.dataproc.v1.ClusterOperationMetadata>`"
  ([^ClusterControllerStubSettings$Builder this]
    (-> this (.updateClusterOperationSettings))))

(defn diagnose-cluster-settings
  "Returns the builder for the settings used for calls to diagnoseCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.DiagnoseClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerStubSettings$Builder this]
    (-> this (.diagnoseClusterSettings))))

(defn list-clusters-settings
  "Returns the builder for the settings used for calls to listClusters.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.dataproc.v1.ListClustersRequest,com.google.cloud.dataproc.v1.ListClustersResponse,com.google.cloud.dataproc.v1.ClusterControllerClient$ListClustersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ClusterControllerStubSettings$Builder this]
    (-> this (.listClustersSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ClusterControllerStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn create-cluster-settings
  "Returns the builder for the settings used for calls to createCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.CreateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerStubSettings$Builder this]
    (-> this (.createClusterSettings))))

(defn get-cluster-settings
  "Returns the builder for the settings used for calls to getCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.dataproc.v1.GetClusterRequest,com.google.cloud.dataproc.v1.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ClusterControllerStubSettings$Builder this]
    (-> this (.getClusterSettings))))

